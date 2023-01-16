import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random = new Random();
    protected int min;
    protected int max;
    protected Integer randomNum = 0;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        Iterator<Integer> it = new Iterator<>() {
            @Override
            public boolean hasNext() {
                if (randomNum >= min || randomNum < max) {
                    return true;
                } else
                    return false;
            }

            @Override
            public Integer next() {
                return randomNum = random.nextInt(max - min + 1) + min;
            }
        };
        return it;
    }
}
