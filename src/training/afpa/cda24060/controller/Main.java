package training.afpa.cda24060.controller;

import training.afpa.cda24060.modele.Warrior;
import training.afpa.cda24060.utility.UserInput;

import static training.afpa.cda24060.modele.Warrior.warriors;
import static training.afpa.cda24060.view.GameMenu.displayMenu;
import static training.afpa.cda24060.view.GameMenu.home;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Main m = new Main();
    m.run();

    }
    private void run() {
        home();
        displayMenu();


    }
}