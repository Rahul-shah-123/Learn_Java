package Animal.Reptile;

import Animal.animal;

public class reptile extends animal {
    protected String skin,egg;
    protected boolean backbone;

    public reptile() {
        heightInFeet = 5;
        weightInKilos = 20;
        animalType = "Reptile";
        bloodType = "Cold";
        this.skin = "Dry skin";
        this.backbone = true;
        this.egg = "soft shelled";
    }

    
    public String showInfo() {
        return "reptile{" +
                "skin='" + skin + '\'' +
                ", egg='" + egg + '\'' +
                ", backbone=" + backbone +
                ", heightInFeet=" + heightInFeet +
                ", weightInKilos=" + weightInKilos +
                ", animalType='" + animalType + '\'' +
                ", bloodType='" + bloodType + '\'' +
                "} " + super.toString();
    }
}
