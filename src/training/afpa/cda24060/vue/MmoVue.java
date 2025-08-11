package training.afpa.cda24060.vue;
import training.afpa.cda24060.modele.Classe;
import training.afpa.cda24060.modele.Warrior;
import training.afpa.cda24060.utility.UserEntry;

public class MmoVue {
    public static void main(String[] args) {
        MmoVue m = new MmoVue();
        m.run();
    }

    private void run(){
        System.out.println("Creation de personnage");
        int charChoice = UserEntry.userInt("Quel personnage voulez vous : \n Guerrier (1) \n Voleur (2) \n Soigneur (3)");

        switch (charChoice) {
            case 1:
                System.out.println("guerrier");
                break;
                case 2:
                    System.out.println("voleur");
                    break;
                case 3:
                    System.out.println("soigneur");
                    break;
            default:
                System.err.println("error");
        }

    }
}
