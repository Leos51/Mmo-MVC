package training.afpa.cda24060.modele;

public class Character {
    private String name;
    private int level;
    private int health;
    private Classe classe;
    private Race race;

    public Character(String name, int level, int health, Classe classe, Race race) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.classe = classe;
        this.race = race;

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public Classe getClasse() {
        return classe;

    }
    public void setClasse(Classe classe) {
        this.classe = classe;
    }
    public Race getRace() {
        return race;
    }
    public void setRace(Race race) {
        this.race = race;
    }
}
