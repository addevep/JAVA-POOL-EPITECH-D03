import java.util.ArrayList;

public class Team {

    private String name;
    private ArrayList<Astronaut> team = new ArrayList<>();
    private ArrayList<String> show = new ArrayList<>();
    private int count;
    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void add(Astronaut name) {
        this.team.add(name);
    }
    public void remove(Astronaut name) {
        this.team.remove(name);
    }
    public int countMembers() {
        count = team.size();
        return count;
    }
    public void showMembers() {
        show.clear();
            for (Astronaut member: team) {
                if (member.getDestination() == null ) {
                    show.add(member.getName() + " on standby");
                } else {
                    show.add(member.getName() + " on mission");
                }
        }
        System.out.println(this.name + ": " + String.join(", ", show) + ".");
    }

}
