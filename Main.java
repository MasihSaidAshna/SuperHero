import java.util.*;

public class Main{
    public static void main(String[] args) {
        System.out.println("Indtast superheltenavn");
        Scanner sc1 = new Scanner(System.in);
        String supernavn = sc1.next();
        System.out.println("Indtast superkraft");
        Scanner sc2 = new Scanner(System.in);
        String superkraft = sc2.next();
        System.out.println("Indtast creation year");
        Scanner sc3 = new Scanner(System.in);
        String cy = sc3.next();
        System.out.println("Indtast styrke");
        Scanner sc4 = new Scanner(System.in);
        int styrke = sc4.nextInt();


        System.out.println("Supername: " + supernavn + " Superpower: " + superkraft + " Creation year: " + cy + " Strength: " + styrke);
        Database superheltedata = new Database();
        superheltedata.addSuperHero(supernavn,superkraft,cy,styrke);

    }
}