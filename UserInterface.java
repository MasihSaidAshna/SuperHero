import java.util.*;

public class UserInterface {
    Database db = new Database();
    Scanner sc = new Scanner(System.in);

    public void startProgram() {
        int userChoice = 0;
        while (userChoice != 9) {  
            System.out.println("""
                ____________________
                Welcome to the SUPERHERO Universe. 
                1. Create superhero 
                2. Show superhero list
                3. Search superhero
                4. Edit superhero
                5. Delete superhero
                9. Terminate
                ____________________""");
            userChoice = sc.nextInt();
            sc.nextLine();
            menuOption(userChoice);
        }
        sc.close();
        System.out.print("Thank you for using our services.");
    }

    public void menuOption(int userChoice) {
        if (userChoice == 1){
            try {
                System.out.print("Enter the superhero's name: "); 
                String superName = sc.next();
                System.out.print("Enter superpower: ");
                String superPower = sc.next();
                System.out.print("Enter creation year: ");
                String stringCreationYear = sc.next();
                int creationYear = Integer.parseInt(stringCreationYear);
                System.out.print("Enter strength: ");
                String stringStrength = sc.next();
                int strength = Integer.parseInt(stringStrength);

                db.addSuperHero(superName, superPower, creationYear, strength);
                
                System.out.println("""
                    ____________________
                    Superhero created. 
                    ____________________""");
            }
            catch (Exception exception) {
                System.out.println("ERROR: INVALID INPUT");
            }
        }
        if (userChoice == 2) {
            db.showSuperHeroes();
        }
        if (userChoice == 3) {
            System.out.println("Enter the superhero's name you want to find: "); 
            String superName = sc.next();
            sc.nextLine();
            db.searchSuperHeroes(superName);
        }
        if (userChoice == 4) {
            System.out.println("Enter the superhero's name you want to edit: "); 
            String superName = sc.next();
            sc.nextLine();
            db.editSuperHero(superName);
            //db.scDB.close();
        }
        if (userChoice == 5) {
            System.out.println("Enter the superhero's name that you want to delete: "); 
            String superName = sc.next();
            sc.nextLine();
            db.deleteSuperHero(superName);
        }
    }
}