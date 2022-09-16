import java.util.*;

public class Database {
    public ArrayList<String> SuperListe = new ArrayList<String>();
    //private SuperHero[] helte = new SuperHero[5]; //Array med længde 5
    //int n = 0; //Counter

    public void addSuperHero (String supernavn, String superkraft, String oprindelsesår, String styrke) {
        Collections.addAll(SuperListe, supernavn, superkraft, oprindelsesår, styrke);
        /*SuperHero superhelt = new SuperHero(supernavn, superkraft, oprindelsesår, styrke);
        helte[n] = superhelt;
        n++;*/
    }

/*    public SuperHero findSuperHero(String supernavn) {
        for (SuperHero s : SuperListe){
            if (s.getSuperName().equals(supernavn)) {
                return s;
            }
            else {return null;}
        }
    }*/
}
