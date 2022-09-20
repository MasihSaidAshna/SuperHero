import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userChoice = 0;
        Database superHeltData = new Database();
        while (userChoice != 9) {        //for (int i = 0; i <= 5; i++) {
            System.out.println("""
                ____________________
                Welcome to the SUPERHERO Universe. 
                1. Create superhero 
                2. Show superhero list
                3. Search superhero
                9. Terminate
                ____________________""");
            userChoice = sc.nextInt();
            if (userChoice == 1){
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

                superHeltData.addSuperHero(superName, superPower, creationYear, strength);
                
                System.out.println("""
                    ____________________
                    Superhero created. 
                    ____________________""");
            }
            if (userChoice == 2) {
                //superHeltData.showSuperHeroes(superName, superPower, creationYear, strength);
                superHeltData.showSuperHeroes();
            }
            if (userChoice == 3) {
                //superHeltData.showSuperHeroes(superName, superPower, creationYear, strength);
                System.out.println("Enter the superhero's name: "); 
                String superName = sc.next();
                superHeltData.searchSuperHeroes(superName);
            }
        }
        sc.close();
        System.out.print("Thank you for using our services.");
    }
}
