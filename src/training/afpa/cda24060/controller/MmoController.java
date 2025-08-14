package training.afpa.cda24060.controller;

import training.afpa.cda24060.modele.*;
import training.afpa.cda24060.modele.Character;


import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import static training.afpa.cda24060.view.GameMenu.*;

public class MmoController {
    private static HashMap<String, Race> races = new HashMap<>();
    private static Map<String, Classe> classes = new HashMap<>();


    private static void initializeRaces() {
        races.put("Human", new Race("Humain"));
        races.put("Elf", new Race("Elfe"));
        races.put("Nain", new Race("Nain"));
        races.put("Kobold", new Race("Kobold"));
    }

    private static void initializeClasses() {
        Classe guerrier = new Classe("guerrier", "hache", "armure lourde");
        Classe voleur = new Classe("voleur", "dague", "armure legere");
        Classe soigneur = new Classe("soigneur", "baton", "tissu");
        classes.put("Guerrier", guerrier);
        classes.put("Voleur", voleur);
        classes.put("Soigneur", soigneur);
    }

    private static void initializeCharacters() {
        Warrior w1 = new Warrior("Wallander", classes.get("Guerrier"),races.get("Human"), 1,100,50);
        Warrior w2 = new Warrior("war1", classes.get("Guerrier"), races.get("Nain"), 1,100,50);
        Thief t1 = new Thief("Bilbo", classes.get("Voleur"), races.get("Kobold"), 1,80,60);
        Healer h1 = new Healer("Hikari", classes.get("Soigneur"), races.get("Elf"),1,60,100);
        Healer h2 = new Healer("Hikari", classes.get("Soigneur"), races.get("Elf"),1,60,100);
        Healer.addHealer(h1);
        Thief.addThief(t1);
        Warrior.addWarrior(w1);
        Party p1 = new Party("Groupe 1", w1, t1, h1, LocalDate.now());
        Party.addGroupToList(p1);
    }

    public static void worldGeneration() {
        initializeRaces();
        initializeClasses();
        initializeCharacters();


//        Party.showListParty();
//        Warrior test1 = Warrior.findWarriorByName("Wallander");
//        Healer test = Healer.findHealerByName("Hikari");
//        System.out.println("Test : " + test1);
//        System.out.println("Test : " + test);

    }

    public static void addCharToList(){
        Character c;

        Race raceName = switch (getRaceChoice()){
            case 1 -> races.get("Humain");
            case 2 -> races.get("Elfe");
            case 3 -> races.get("Nain");
            default ->  races.get("Humain");
        };
        Classe className;
        switch (getClassChoice()){
            case 1 : className = classes.get("Guerrier");
                c = new Warrior(getCharacterName(),className, raceName,1,100,50);
                    Warrior.addWarrior((Warrior) c);
                break;
            case 2 : className = classes.get("Voleur");
                c = new Thief(getCharacterName(),className, raceName,1,100,50);
                Thief.addThief((Thief) c);
            break;
            case 3 : className = classes.get("Soigneur");
                c = new Healer(getCharacterName(),className, raceName,1,100,50);
                Healer.addHealer((Healer) c);
            break;
            default:
                break;
        };





    }

}
