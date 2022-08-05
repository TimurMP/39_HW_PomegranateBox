package telran.box.model;

import java.util.Iterator;
import java.util.List;

public class Pomegranate implements Iterable<Seed> {
    List<Seed> seeds;

    public Pomegranate(List<Seed> seeds) {
        this.seeds = seeds;
    }

    public List<Seed> getSeeds() {
        return seeds;
    }

    @Override
    public Iterator<Seed> iterator() {
        return null;
    }
}
