package Tema_Lab11_AnimalRescue;

public abstract class Veterinary extends HumanBeing {

    private String specialization;
    private int priceRange;
    private int availability;


    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setPriceRange(int priceRange) {
        this.priceRange = priceRange;
    }

    public int getPriceRange() {
        return priceRange;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public int getAvailability() {
        return availability;
    }

    public void whatDoWithTheAnimal() {
        System.out.println("I heal the animal.");
    }

    public void examine() {
        System.out.println("I examine the animal. ");
    }

    public void vaccinate() {
        System.out.println("I vaccinate the animal.");
    }

    public void nonSpecialization() {
        System.out.println("I can treat any animal.");
    }

    public abstract void surgery();
}
