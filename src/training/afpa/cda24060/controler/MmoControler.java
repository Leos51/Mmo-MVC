package training.afpa.cda24060.controler;

import training.afpa.cda24060.modele.Classe;
import training.afpa.cda24060.modele.Healer;
import training.afpa.cda24060.modele.Race;

import java.util.ArrayList;

import static training.afpa.cda24060.modele.Healer.healers;

public class MmoControler {

    Race human = new Race("HUmain");
    Race elfen = new Race("Elfe");
    Race kobold = new Race("Kobold");


    Classe guerrier = new Classe("guerrier", "hache", "armure lourde");
    Classe voleur = new Classe("voleur", "dague", "armure legere");
    Classe soigneur = new Classe("soigneur", "baton", "tissu");


    Healer h1 = new Healer("h1",1,100, 50, soigneur, elfen);

    getHealers().

    add(h1)
}
