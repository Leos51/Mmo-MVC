package training.afpa.cda24060.controller;

import static training.afpa.cda24060.controller.MmoController.worldGeneration;
import static training.afpa.cda24060.view.GameMenu.displayMenu;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Main m = new Main();
    m.run();

    }
    private void run() {
        worldGeneration();
        displayMenu();



    }
}