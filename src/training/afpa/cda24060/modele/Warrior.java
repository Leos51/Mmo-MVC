package training.afpa.cda24060.modele;

import java.util.ArrayList;
import java.util.List;

import static training.afpa.cda24060.view.GameMenu.displayMenu;

public class Warrior extends Character implements Comparable<Warrior> {
        int strength;
        private static List<Warrior> warriors = new ArrayList<Warrior>();


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

    public static List<Warrior> getWarriors() {
            return warriors;
    }

    public static void showWarriorsList(){
        System.out.println("Warriors :");
        System.out.println("--------");
        for(Warrior warrior : getWarriors())
            System.out.println(warrior.getName());
        displayMenu();
    }

    public static void setWarriorsList(List<Warrior> warriors) {
            Warrior.warriors = warriors;
    }

    public static Warrior findWarriorByName(String name) {
            for (Warrior warrior : getWarriors()) {
                if (warrior.getName().equalsIgnoreCase(name)) {
                    return warrior;
                }
            }
            return null;
    }

    @Override
    public int compareTo(Warrior warrior) {
            System.out.println("Compare " + warrior + " to " + this );

            int value =  warrior.getName().compareTo(this.getName());
            if (value != 0) return value;

            value = Integer.compare(warrior.getStrength(), this.getStrength());
            if (value != 0) return value;

            value = Integer.compare(warrior.getLevel(), this.getLevel());
            if (value != 0) return value;

            value = Integer.compare(warrior.getHealth(), this.getHealth());
            if (value != 0) return value;

            return value;

    };

}
