package AnimalRescue;

public class Veterinary {
    String name;
    String specialization;
    int priceRange;
    int availability;

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
