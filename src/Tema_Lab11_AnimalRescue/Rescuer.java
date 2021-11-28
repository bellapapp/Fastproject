package Tema_Lab11_AnimalRescue;

public abstract class Rescuer extends HumanBeing {

    private String occupation;
    private String timeAvailability;

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getOccupation() {

        return occupation;
    }

    public void setTimeAvailability(String timeAvailability) {
        this.timeAvailability = timeAvailability;
    }

    public String getTimeAvailability() {

        return timeAvailability;
    }

    public void whatDoWithTheAnimal() {
        System.out.println("I adopt the animal.");
    }

    public abstract void whatKindOfAnimalAdopts();

    public abstract void fluffyOrShortHairToAdopt();

}

