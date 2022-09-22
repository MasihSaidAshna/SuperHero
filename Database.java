import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Database {
    public ArrayList<SuperHero> SuperListe = new ArrayList<SuperHero>();
    private Scanner scDB = new Scanner(System.in);

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
        for (int i = 0; i < SuperListe.size(); i++){
            SuperHero s = SuperListe.get(i);
            Matcher m = p.matcher(s.getSuperName());
            if (m.find()) {
                System.out.println("Supername: " + s.getSuperName() + "\nSuperpower: " + s.getSuperPower() + "\nCreation year: " + s.getCreationYear() + "\nStrength: " + s.getStrength());
            }
            else {
                System.out.println("Superhero not found");
            }
        }
    }

    public void editSuperHero(String supernavn) {
        int editChoice = -1; 
        if (SuperListe.isEmpty()) {
            System.out.println("List is empty!");
        }
        for (int i = 0; i < SuperListe.size(); i++){
            SuperHero s = SuperListe.get(i);
            if (s.getSuperName().equals(supernavn)) {

                System.out.println("""
                    ____________________
                    Select which attribute you'd like to change for your superhero. 
                    1. Edit superhero name 
                    2. Edit super power
                    3. Edit creation year
                    4. Edit strength
                    ____________________""");
                    editChoice = scDB.nextInt();
                    scDB.nextLine();

                if (editChoice == 1) {
                    System.out.print("Enter the superhero's new name: "); 
                    String supername = scDB.next();
                    scDB.nextLine();
                    s.setSuperName(supername);
                }
                if (editChoice == 2) {
                    System.out.print("Enter the superhero's new power: "); 
                    String superpower = scDB.next();
                    scDB.nextLine();
                    s.setSuperPower(superpower);
                }
                if (editChoice == 3) {
                    System.out.print("Enter the superhero's new creation year: "); 
                    int creationYear = scDB.nextInt();
                    scDB.nextLine();
                    s.setCreationYear(creationYear);
                }
                if (editChoice == 4) {
                    System.out.print("Enter the superhero's new strength: "); 
                    int strength = scDB.nextInt();
                    scDB.nextLine();
                    s.setStrength(strength);
                }
            }
            else {
                System.out.println("Superhero not found");
            }
        }
    }

    public void deleteSuperHero (String supernavn) {
        if (SuperListe.isEmpty()) {
            System.out.println("List is empty!");
        }
        for (int i = 0; i < SuperListe.size(); i++){
            SuperHero s = SuperListe.get(i);
            if (s.getSuperName().equals(supernavn)) {
                SuperListe.remove(s);
                System.out.println("Superhero deleted!");
            }
            else {
                System.out.println("Superhero not found");
            }
        }
    }
}
