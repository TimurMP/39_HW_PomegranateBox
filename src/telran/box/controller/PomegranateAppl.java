package telran.box.controller;

import telran.box.model.Box;
import telran.box.model.Pomegranate;
import telran.box.model.Seed;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PomegranateAppl {
    public static void main(String[] args) {


        List<Box> boxes = generateBoxes();
        System.out.println(totalSeeds(boxes));

        for (Box box : boxes) {
            System.out.println(box);

        }




    }

    private static int totalSeeds(List<Box> boxes){
        return  boxes.stream()
                .map(Box::getPomegranates)
                .flatMap(pomegranates -> pomegranates.stream())
                .map(Pomegranate::getSeeds)
                .map(x -> x.size())
                .reduce(0, (a,b) -> a + b);

    }

    private static  List<Box> generateBoxes(){
        int numberOfBoxes = randomGenerator(5, 5);
        List<Box> list = new ArrayList<>();
        for (int i = 0; i < numberOfBoxes; i++) {
            list.add(new Box("Box" + i, generatePomegranates()));
        }
        return list;
    }


    private static  List<Pomegranate> generatePomegranates(){
        int numberOfPomegranates = randomGenerator(5, 5);
        List<Pomegranate> list = new ArrayList<>();
        for (int i = 0; i < numberOfPomegranates; i++) {
            list.add(new Pomegranate(generateSeeds()));
        }
        return list;
    }

    private static  List<Seed> generateSeeds(){
        int numberOfSeeds = randomGenerator(5, 5);
        List<Seed> list = new ArrayList<>();
        for (int i = 0; i < numberOfSeeds; i++) {
             list.add(new Seed());
        }
        return list;
    }

    private static int randomGenerator(int from, int to){
        Random random = new Random();
        return random.nextInt((to + 1)-from)+from;
    }




}
