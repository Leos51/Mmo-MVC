package training.afpa.cda24060.modele;

import java.util.ArrayList;
import java.util.List;

public class Warrior extends Character {
        int strength;
        public static List<Warrior> warriors = new ArrayList<Warrior>();


        public Warrior(String name,  Classe classe, Race race, int level, int health,int strength) {
        super(name, classe, race,  level, health);
        this.strength = strength;


    }

    public int getStrength() {
        return strength;
    }
    public void setStrength(int strength) {
            this.strength = strength;
    }

    public static void addWarrior(Warrior warrior) {
            warriors.add(warrior);
    }
}
