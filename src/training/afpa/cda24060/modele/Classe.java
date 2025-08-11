package training.afpa.cda24060.modele;

import java.util.HashMap;
import java.util.Map;

public class Classe {
    private String name;
    private String weapon;
    private String armor;

    private static  Map<String, Classe> classes = new HashMap<>();

    public Classe(String name, String weapon, String armor) {
        this.name = name;
        this.weapon = weapon;
        this.armor = armor;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon(){
        return weapon;
    }
    public void setWeapon(String weapon){
        this.weapon = weapon;
    }

    public String getArmor(){
        return armor;
    }
    public void setArmor(String armor){
        this.armor = armor;
    }
public static Map<String,Classe> getClasses(){
    return classes;
}


}
