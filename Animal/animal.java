package Animal;

public class animal {
    protected float heightInFeet;
    protected float weightInKilos;
    protected String animalType;
    protected String bloodType;

    public animal() {
        this.heightInFeet = 0;
        this.weightInKilos = 0;
        this.animalType = "unknown";
        this.bloodType = "unknown";
    }

    public String showInfo() {
        return "animal{" +
                "heightInFeet=" + heightInFeet +
                ", weightInKilos=" + weightInKilos +
                ", animalType='" + animalType + '\'' +
                ", bloodType='" + bloodType + '\'' +
                '}';
    }
}
