package training.afpa.cda24060.modele;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import static training.afpa.cda24060.utility.DateFormat.format;

public class Party {

    private String partyName;
    private Thief thief;
    private Warrior warrior;
    private Healer healer;
    private LocalDate dateCreated;
    private static ArrayList<Party> partyList = new ArrayList<Party>();

    public Party(String name, Warrior warrior, Thief thief, Healer healer) {
        this.partyName = name;
        this.warrior = warrior;
        this.thief = thief;
        this.healer = healer;
        this.dateCreated = LocalDate.now();

    }
    public Party(String name, Warrior warrior, Thief thief, Healer healer, LocalDate dateCreated ) {
        this.partyName = name;
        this.warrior = warrior;
        this.thief = thief;
        this.healer = healer;
        this.dateCreated = dateCreated;

    }

    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    public Warrior getWarrior() {
        return warrior;
    }

    public void setWarrior(Warrior warrior) {
        this.warrior = warrior;
    }

    public Thief getThief() {
        return thief;
    }

    public void setThief(Thief thief) {
        this.thief = thief;
    }

    public Healer getHealer() {
        return healer;
    }
    public void setHealer(Healer healer) {
        this.healer = healer;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {


        this.dateCreated = dateCreated;

    }

    public static ArrayList<Party> getPartyList() {
        return partyList;
    }

    public static void setPartyList(ArrayList<Party> partyList) {
        Party.partyList = partyList;
    }

public static void addGroupToList(Party p){
        getPartyList().add(p);
}

public static void showListParty() {
        System.out.println("Party List:");
        for (Party p : partyList) {
            System.out.println(p.getPartyName() + " - " + p.getDateCreated()) ;
        }
}

public static void findByName(String name){
    for (Party p : partyList) {
        if (p.getPartyName().equals(name)) {

        }
    }
}


    @Override
    public String toString() {
        return "Party Name: " + this.partyName + "\n" +
                "Warrior Name: " + this.warrior.getName() + "\n" +
                "Thief Name: " + this.thief.getName() + "\n" +
                "Healer Name: " + healer.getName() + "\n" +
                "Date Created: " + format(this.dateCreated) + "\n";
    }


}

