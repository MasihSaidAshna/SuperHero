public class SuperHero {
    private String supernavn;
    private String superkraft;
    private String oprindelsesår;
    private String styrke;

    public SuperHero(String supername, String superpower, String creationYear, String strength) {
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

    public String getCreationYear() {
        return oprindelsesår;
    }

    public String getStrength() {
        return styrke;
    }

    public void setSuperName(String supername) {
        this.supernavn = supername;
    }

    public void setSuperPower(String superpower) {
        this.superkraft = superpower;
    }

    public void setCreationYear(String creationYear) {
        this.oprindelsesår = creationYear;
    }

    public void setStrength(String strength) {
        this.styrke = strength;
    }

}