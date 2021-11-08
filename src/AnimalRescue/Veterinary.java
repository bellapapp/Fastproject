package AnimalRescue;

public class Veterinary {
    private String name;
    private String specialization;
    private int priceRange;
    private int availability;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

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

    public void examine() {
        System.out.println("The veterinary examines the dog. ");
    }

    public void vaccinate() {
        System.out.println("The veterinary vaccinates the dog. ");
    }

    public void cure() {
        System.out.println("The veterinary cures the dog. ");
    }

    public void nonSpecialization() {
        System.out.println("The veterinary cannot treat dogs. ");
    }

    public void setAvailability() {
        System.out.println("the veterinary is unavailable. ");
    }
}
