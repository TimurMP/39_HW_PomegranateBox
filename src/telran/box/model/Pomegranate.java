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
    public String toString() {
        return "Pomegranate{" +
                "seeds=" + seeds +
                '}';
    }

    @Override
    public Iterator<Seed> iterator() {
        return new Iterator<Seed>() {
            int count = 0;
            @Override
            public boolean hasNext() {
                return count < seeds.size();
            }

            @Override
            public Seed next() {
                Seed seed = seeds.get(count);
                count++;
                return seed;
            }
        };
    }
}
