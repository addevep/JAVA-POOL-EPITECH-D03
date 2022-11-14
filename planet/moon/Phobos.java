package planet.moon;

public class Phobos {
    private planet.Mars mars;
    private String landingSite;
    public Phobos(planet.Mars mars, String landing) {
        if (mars == null) {
            System.out.println("No planet given.");
        } else {
            this.mars = mars;
            this.landingSite = landing;
            System.out.println("Phobos placed in orbit.");
        }
    }
    public String getLandingSite() {
        return landingSite;
    }

    public planet.Mars getMars() {
        return mars;
    }
}
