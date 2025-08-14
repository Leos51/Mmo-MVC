package training.afpa.cda24060.view;


import training.afpa.cda24060.controller.MmoController;
import training.afpa.cda24060.modele.Healer;
import training.afpa.cda24060.modele.Thief;
import training.afpa.cda24060.modele.Warrior;
import training.afpa.cda24060.utility.UserInput;

import static training.afpa.cda24060.modele.Healer.healers;
import static training.afpa.cda24060.modele.Thief.thiefs;
import static training.afpa.cda24060.modele.Warrior.getWarriors;
import static training.afpa.cda24060.modele.Warrior.showWarriorsList;


public class GameMenu {
    private static String characterName;
    private static int classChoice, raceChoice;

    public static String getCharacterName() {
        return characterName;
    }

    public static int getClassChoice() {
        return classChoice;
    }

    public static int getRaceChoice() {
        return raceChoice;
    }


    public static String nameChoice(){
        String charName = UserInput.userString("Entrez le nom de votre personnage :");
        return charName;
    }

    public static int classeChoice(){
        int classChoice = UserInput.userInt(" Classe de votre personnage (1, 2 ou 3)  \n1 -Guerrier \n2 - Voleur \n3 - Soigneur ");
        return classChoice;
    }

    public static int racialChoice(){
        int racialChoice = UserInput.userInt("Race de votre personnage (1, 2, 3) \n1 -Humain \n2 - Nain \n3 - Elfe  ");
        return racialChoice;
    }

    public static boolean validInput(String characterName,  int classChoice, int raceChoice){
        if (characterName == null || characterName.isBlank()) {
            return false;
        }

        if (classChoice < 1 || classChoice > 3) {
            return false;
        }
        if (raceChoice < 1 || raceChoice > 3) {
            return false;
        }
        return true;

    }




    public static void displayMenu() {
        System.out.println();
        System.out.println("----------------");
        System.out.println("| MMO 2A World |");
        System.out.println("----------------");
        System.out.println();
        System.out.println("1 - Nouveau personnage");
        System.out.println("2 - Votre personnage");
        System.out.println("3 - Voir la liste des guerriers");
        System.out.println("4 - Voir la liste des soigneurs");
        System.out.println("5 - Voir la liste des voleurs");
        System.out.println("0 - Quitter");
        choiceMenu();


    }

    public static void choiceMenu(){
        switch (UserInput.userInt("Votre Choix [1-5] ou [0] pour quitter : ")) {
            case 1 -> characterCreation();
            case 2 -> characterCreation(); //à remplacer
            case 3 -> showWarriorsList();
            case 4 -> showHealers();
            case 5 -> showThiefs();
            case 0  -> System.exit(0);
        }

    }

    public static void characterCreation() {
        int i = 0;
        boolean flag = false;
        do{
            characterName = nameChoice();
            classChoice = classeChoice();
            raceChoice = racialChoice();
            flag = validInput( characterName, classChoice, raceChoice);
            if (!flag) {
                System.err.println("Erreur de saisie!");
            }}while (!flag);
        MmoController.addCharToList();
        System.out.println("Votre personnage : " + characterName + " est crée");
        displayMenu();
    }



    public static void showThiefs(){
        System.out.println("Thiefs");
        System.out.println("--------");
        for(Thief thief : thiefs){
            System.out.println(thief.getName());
        }
        displayMenu();
    }

    public static void showHealers(){
        System.out.println("Healers");
        System.out.println("--------");
        for(Healer healer : healers){
            System.out.println(healer.getName());
        }
        displayMenu();

    }

}
