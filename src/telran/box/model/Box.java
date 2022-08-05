package telran.box.model;

import java.util.Iterator;
import java.util.List;

public class Box implements Iterable<Pomegranate>{
    String name;
    List<Pomegranate> pomegranates;


    public Box(String name, List<Pomegranate> pomegranates) {
        this.name = name;
        this.pomegranates = pomegranates;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Pomegranate> getPomegranates() {
        return pomegranates;
    }

    @Override
    public String toString() {
        return "Box{" +
                "name='" + name + '\'' +
                ", pomegranates=" + pomegranates +
                '}';
    }

    @Override
    public Iterator<Pomegranate> iterator() {
        return null;
    }
}
