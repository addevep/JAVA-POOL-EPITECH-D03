package planet;

import java.util.concurrent.atomic.AtomicInteger;
public class Mars {
    private int id;
    private static AtomicInteger ID_FACTORY = new AtomicInteger(-1);
    private String landingSite;
    public Mars(String landingName) {
        id = ID_FACTORY.incrementAndGet();
        landingSite = landingName;
    }
    public int getId() {
        return id;
    }

    public String getLandingSite() {
        return landingSite;
    }
}