package training.afpa.cda24060.modele;

import java.util.ArrayList;
import java.util.List;

public class Healer extends Character {
    private int mana;
    public static List<Healer> healers = new ArrayList<>();


    public Healer(String name, Classe classe, Race race, int level, int health, int mana) {
        super(name,  classe, race, level, health);
        this.mana=mana;
    }

    public int getMana() {
        return mana;
    }
    public void setMana(int mana) {
        this.mana = mana;
    }

    public static void addHealer(Healer healer) {
        healers.add(healer);
    }
//
//    public static List<Healer> getHealers() {
//        return healers;
//    }
//
//    public void setHealers(List<Healer> healers) {
//        this.healers = healers;
//
//    }
//    public static void showHealers() {
//        for (Healer healer : healers) {
//            System.out.println(healer.toString());
//        }

        public static Healer findHealerByName(String name) {
            for (Healer healer : healers) {
                if (healer.getName().equals(name)) {
                    return healer;
                }
            }
            return null;
        }
        public static void removeHealer(String name) {
            Healer healer = findHealerByName(name);
            healers.remove(healer);
        }



    }



