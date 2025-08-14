package training.afpa.cda24060.modele;

import java.util.HashMap;
import java.util.Map;

public class Race {
    private String name;
    private static Map<String, Race> races = new HashMap<>();


    public Race(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if(name == null || name.isEmpty()) {
//            throw new IllegalArgumentException("name cannot be null or empty");
            System.err.println("Le nom est vide, vide et encore vide !!  Merci d'indiquer un nom");
        }
        this.name = name;
    }

    Map<String, Race> getRaces() {
        return races;
    }

    @Override
    public String toString() {
        return this.getName();
    }

}
