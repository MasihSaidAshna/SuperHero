public class Database {
    private SuperHero[] helte = new SuperHero[5];
    int n = 0;

    public void addSuperHero (String supernavn, String superkraft, String oprindelsesår, int styrke) {
        SuperHero superhelt = new SuperHero(supernavn, superkraft, oprindelsesår, styrke);
        helte[n] = superhelt;
        n++;
    }
}
