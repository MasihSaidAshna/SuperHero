public class SuperHero {
    private String supername;
    private String superpower;
    private String creationYear;
    private int strength;

    public SuperHero(String supername, String superpower, String creationYear, int strength) {
        this.supername = supername;
        this.superpower = superpower;
        this.creationYear = creationYear;
        this.strength = strength;
    }

    public String getSuperName() {
        return supername;
    }

    public String getSuperPower() {
        return superpower;
    }

    public String getCreationYear() {
        return creationYear;
    }

    public int getStrength() {
        return strength;
    }

    public void setSuperName(String supername) {
        this.supername = supername;
    }

    public void setSuperPower(String superpower) {
        this.superpower = superpower;
    }

    public void setCreationYear(String creationYear) {
        this.creationYear = creationYear;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

}