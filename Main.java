import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userChoice = 0;
        while (userChoice != 9) {        //for (int i = 0; i <= 5; i++) {
            System.out.println("""
                ____________________
                Welcome to the SUPERHERO Universe. 
                1. Create superhero 
                9. Terminate
                ____________________""");
            userChoice = sc.nextInt();            
            if (userChoice == 1){
                System.out.print("Enter the superhero's name: "); 
                String superName = sc.next();
                System.out.print("Enter superpower: ");
                String superPower = sc.next();
                System.out.print("Enter creation year: ");
                String creationYear = sc.next();
                System.out.print("Enter strength: ");
                String strength = sc.next();

                System.out.println("Supername: " + superName + "\nSuperpower: " + superPower + "\nCreation year: " + creationYear + "\nStrength: " + strength);
                Database superHeltData = new Database(); 
                superHeltData.addSuperHero(superName, superPower, creationYear, strength);
                
                System.out.println("""
                    ____________________
                    Superhero created. 
                    1. Create superhero 
                    9. Terminate
                    ____________________""");
            }
            else {break;}
        }
        sc.close();
        System.out.print("Thank you for using our services.");
    }
}
