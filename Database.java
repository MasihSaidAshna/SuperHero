import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

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
        Pattern p = Pattern.compile(supernavn);
        if (SuperListe.isEmpty()) {
            System.out.println("List is empty!");
        }
        for (SuperHero s : SuperListe){
            Matcher m = p.matcher(s.getSuperName());
            if (/*s.getSuperName().equals(supernavn)*/ m.find()) {
                System.out.println("Supername: " + s.getSuperName() + "\nSuperpower: " + s.getSuperPower() + "\nCreation year: " + s.getCreationYear() + "\nStrength: " + s.getStrength());
            }
            else {
                System.out.println("Superhero not found");
            }
        }
    }

}
