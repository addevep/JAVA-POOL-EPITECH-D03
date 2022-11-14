import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class Astronaut {
    private static AtomicInteger ID_FACTORY = new AtomicInteger(-1);
    private String name;
    private int snacks = 0;
    private String destination = null;
    private int id;

    public Astronaut(String varName) {
        id = ID_FACTORY.incrementAndGet();
        name = varName;
        System.out.println(name + " ready for launch!");
    }
    public void doActions() {
        System.out.println(name + ": Nothing to do.");
        if (destination == null) {
            System.out.println(name + ": I may have done nothing, but I have " + snacks + " Mars to eat at least!");
        }
    }
    public void doActions(planet.Mars mission) {
        destination = mission.getLandingSite();
        System.out.println(name + ": Started a mission!");
    }
    public void doActions(chocolate.Mars nb) {
        snacks++;
        System.out.println(name + ": Thanks for this mars number " + nb.getId());
        if (destination == null) {
            System.out.println(name + ": I may have done nothing, but I have " + snacks + " Mars to eat at least!");
        }
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public String getDestination() {
        return destination;
    }

    public int getSnacks() {
        return snacks;
    }

}
