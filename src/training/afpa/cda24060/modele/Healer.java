package training.afpa.cda24060.modele;

import java.util.ArrayList;

public class Healer extends Character {
    private int mana;
    ArrayList<Healer> healers = new ArrayList<Healer>();

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

}
