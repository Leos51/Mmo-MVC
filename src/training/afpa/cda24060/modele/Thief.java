package training.afpa.cda24060.modele;

import java.util.ArrayList;

public class Thief extends Character {
    private int agility;
    ArrayList<Thief> Thiefs = new ArrayList<Thief>();



    public Thief(String name, int level, int health, int agility, Classe classe, Race race) {
        super(name, level, health, classe, race);
        this.agility = agility;

    }
        public int getAgility() {
        return agility;
    }
    public void setAgility(int agility) {
        this.agility = agility;
    }

public void addThief(Thief thief) {
        Thiefs.add(thief);
}

}
