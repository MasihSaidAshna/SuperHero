public class SuperHero {
    private String supernavn;
    private String superkraft;
    private int oprindelsesår;
    private int styrke;

    public SuperHero(String supername, String superpower, int creationYear, int strength) {
        this.supernavn = supername;
        this.superkraft = superpower;
        this.oprindelsesår = creationYear;
        this.styrke = strength;
    }

    public String getSuperName() {
        return supernavn;
    }

    public String getSuperPower() {
        return superkraft;
    }

    public int getCreationYear() {
        return oprindelsesår;
    }

    public int getStrength() {
        return styrke;
    }

    public void setSuperName(String supername) {
        this.supernavn = supername;
    }

    public void setSuperPower(String superpower) {
        this.superkraft = superpower;
    }

    public void setCreationYear(int creationYear) {
        this.oprindelsesår = creationYear;
    }

    public void setStrength(int strength) {
        this.styrke = strength;
    }

}