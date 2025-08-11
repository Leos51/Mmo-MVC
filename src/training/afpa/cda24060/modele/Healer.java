package training.afpa.cda24060.modele;

import java.util.ArrayList;
import java.util.List;

public class Healer extends Character {
    private int mana;
    private static List<Healer> healers = new ArrayList();

    public Healer(String name, int level, int health, int mana, Classe classe, Race race) {
        super(name, level, health, classe, race);
        this.mana=mana;
    }

    public int getMana() {
        return mana;
    }
    public void setMana(int mana) {
        this.mana = mana;
    }

    public void addHealer(Healer healer) {
        healers.add(healer);
    }

    public static List<Healer> getHealers() {
        return healers;
    }

    public void setHealers(List<Healer> healers) {
        this.healers = healers;

    }
    public static void showHealers() {
        for (Healer healer : healers) {
            System.out.println(healer.toString());
        }
    }


}
