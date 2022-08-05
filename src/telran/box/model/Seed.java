package telran.box.model;

public class Seed {
    double weight;

    public Seed(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Seed{" +
                "weight=" + weight +
                '}';
    }
}


