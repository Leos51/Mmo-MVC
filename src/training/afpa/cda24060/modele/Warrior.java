package training.afpa.cda24060.modele;

import java.util.ArrayList;

public class Warrior extends Character {
        int strength;
        ArrayList<Warrior> warriors = new ArrayList<Warrior>();


        public Warrior(String name, int level, int health,int strength , Classe classe, Race race) {
        super(name, level, health, classe, race);
        this.strength = strength;


    }

    public int getStrength() {
        return strength;
    }
    public void setStrength(int strength) {
            this.strength = strength;
    }

    public void addWarrior(Warrior warrior) {
            warriors.add(warrior);
    }
}
