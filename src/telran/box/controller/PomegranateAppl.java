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


        System.out.println(boxes.get(11));



    }


    private static  List<Box> generateBoxes(){
        int numberOfBoxes = randomGenerator(100, 200);
        List<Box> list = new ArrayList<>();
        for (int i = 0; i < numberOfBoxes; i++) {
            list.add(new Box("Box" + i, generatePomegranates()));
        }
        return list;
    }


    private static  List<Pomegranate> generatePomegranates(){
        int numberOfPomegranates = randomGenerator(10, 20);
        List<Pomegranate> list = new ArrayList<>();
        for (int i = 0; i < numberOfPomegranates; i++) {
            list.add(new Pomegranate(generateSeeds()));
        }
        return list;
    }

    private static  List<Seed> generateSeeds(){
        int numberOfSeeds = randomGenerator(400, 700);
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
