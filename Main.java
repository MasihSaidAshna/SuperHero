import java.util.*;

public class Main{
    public static void main(String[] args) {
        System.out.println("Velkommen til SUPERHERO Universet. \n1. Opret superhelt\n9. Afslut");
        Scanner sc0 = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        Scanner sc4 = new Scanner(System.in);
        int superMenu = sc0.nextInt();
        for (int i = 0; i <= 5; i++) {
            if (superMenu == 1) {
                System.out.print("Indtast superheltens navn: "); 
                String supernavn = sc1.next();
                System.out.print("Indtast superkraft: ");
                String superkraft = sc2.next();
                System.out.print("Indtast oprindelsesår: ");
                String creationYear = sc3.next();
                System.out.print("Indtast styrke: ");
                int styrke = sc4.nextInt();
        
                System.out.println("Supernavn: " + supernavn + "\nSuperkraft: " + superkraft + "\nOprindelsesår: " + creationYear + "\nStyrke: " + styrke);
                Database superHeltData = new Database(); 
                superHeltData.addSuperHero(supernavn, superkraft, creationYear, styrke);
            }
            else {break;}
        }
        sc0.close();
        sc1.close();
        sc2.close();
        sc3.close();
        sc4.close();
        System.out.print("Tak for besøget!");
    }
}