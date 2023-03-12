import java.util.Random;

public class Dado {
    private Random r;

    public Dado() {
        r = new Random();
    }

    public int lanzar() {
        return r.nextInt(6) + 1;
    }
}
