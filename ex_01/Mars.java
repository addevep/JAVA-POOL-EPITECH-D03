import java.util.concurrent.atomic.AtomicInteger;
public class Mars {
    private int id;
    private static AtomicInteger ID_FACTORY = new AtomicInteger(-1);
    public Mars() {
        id = ID_FACTORY.incrementAndGet();
    }
    public int getId() {
        return id;
    }

}