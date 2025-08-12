package training.afpa.cda24060.controller;

import training.afpa.cda24060.modele.*;
import training.afpa.cda24060.modele.Character;


import static training.afpa.cda24060.view.GameMenu.*;

public class MmoController {




    static Race human = new Race("HUmain");
    static Race elfen = new Race("Elfe");
    static Race kobold = new Race("Kobold");


    static Classe guerrier = new Classe("guerrier", "hache", "armure lourde");
    static Classe voleur = new Classe("voleur", "dague", "armure legere");
    static Classe soigneur = new Classe("soigneur", "baton", "tissu");


    public static void addCharToList(){
        Character c;

        Race raceName = switch (getRaceChoice()){
            case 1 -> human;
            case 2 -> elfen;
            case 3 -> kobold;
            default ->  human;
        };
        Classe className;
        switch (getClassChoice()){

            case 1 : className = guerrier;
                    c = new Warrior(getCharacterName(),className, raceName,1,100,50);
                    Warrior.addWarrior((Warrior) c);
                break;
            case 2 : className = voleur;
                c = new Thief(getCharacterName(),className, raceName,1,100,50);
                Thief.addThief((Thief) c);
            break;
            case 3 : className = soigneur;
                c = new Healer(getCharacterName(),className, raceName,1,100,50);
                Healer.addHealer((Healer) c);
            break;
            default:
                break;
        };





    }

}
