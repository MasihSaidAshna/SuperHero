import java.util.*;

public class Database {
    public ArrayList<SuperHero> SuperListe = new ArrayList<SuperHero>();


    public void addSuperHero (String supernavn, String superkraft, int oprindelsesår, int styrke) {
        SuperHero superhelt = new SuperHero(supernavn, superkraft, oprindelsesår, styrke);
        SuperListe.add(superhelt);
    }

    public void showSuperHeroes() {
        System.out.println("____________________\nList of superheroes:\n____________________");
        for (SuperHero s : SuperListe) {
            System.out.println("Supername: " + s.getSuperName() + "\nSuperpower: " + s.getSuperPower() + "\nCreation year: " + s.getCreationYear() + "\nStrength: " + s.getStrength() + "\n____________________");
        }
    }

    public void searchSuperHeroes(String supernavn) {
        for (SuperHero s : SuperListe){
            if (s.getSuperName().equals(supernavn)) {
                System.out.println("Supername: " + s.getSuperName() + "\nSuperpower: " + s.getSuperPower() + "\nCreation year: " + s.getCreationYear() + "\nStrength: " + s.getStrength());
            }
        }
    }

/*    public SuperHero searchSuperHero(String supernavn) {
        for (SuperHero s : SuperListe){
            if (s.getSuperName().equals(supernavn)) {
                return s;
            }
            else {return null;}
        }
    }*/
}
