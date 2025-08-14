package training.afpa.cda24060.modele;

import java.util.ArrayList;
import java.util.List;

public class Thief extends Character {
    private int agility;
    public static List<Thief> thiefs = new ArrayList<>();


    public Thief(String name,  Classe classe, Race race, int level, int health, int agility) {
        super(name, classe, race,  level, health);
        this.agility = agility;

    }
        public int getAgility() {
        return agility;
    }
    public void setAgility(int agility) {
        this.agility = agility;
    }


    public static void addThief(Thief thief) {
            thiefs.add(thief);
    }

    public static Thief findThiefByName(String name) {
        for (Thief thief : thiefs) {
            if (thief.getName().equals(name)) {
                return thief;
            }
        }
        return null;
    }

}
