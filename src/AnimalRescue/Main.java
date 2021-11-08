package AnimalRescue;

public class Main {
    public static void main(String[] args) {

        Animal dog = new Animal();

        dog.setName("Lessie");
        dog.setAge(3);
        dog.setBreed("Labrador");
        dog.setColor("White");
        dog.setWeight(5.5F);
        dog.setHeight(60);
        dog.setFeelingHungry(9);
        dog.setHealthy(8);
        dog.setMood(10);

        Rescuer tanja = new Rescuer();

        tanja.setName("Tanja");
        tanja.setAge(15);
        tanja.setMoneyAvailability(5);
        tanja.setOccupation("student");
        tanja.setResidence("city");
        tanja.setTimeAvailability(10);

        AnimalFood pedigree = new AnimalFood();

        pedigree.setName("Pedigree");
        pedigree.setPrice(20);
        pedigree.setQty(5);
        pedigree.setStockAvailability(1);

        Veterinary drCurt = new Veterinary();

        drCurt.setName("Dr.Curt");
        drCurt.setAvailability(2);
        drCurt.setPriceRange(10);
        drCurt.setSpecialization("cats");

        RecreationalActivity playing = new RecreationalActivity();
        playing.setName("Playing");


        System.out.println("The dog's details: \n" +
                "Name: " + dog.getName() + "\n" +
                "Age: " + dog.getAge() + "\n" +
                "Breed: " + dog.getBreed() + "\n" +
                "Color: " + dog.getColor() + "\n" +
                "Weight: " + dog.getWeight() + "\n" +
                "Height: " + dog.getHeight() + "\n" +
                "Feeling hungry: " + dog.getFeelingHungry() + "\n" +
                "Healthy: " + dog.getHealthy() + "\n" +
                "Mood: " + dog.getMood() + "\n");

        System.out.println("The rescuer details: \n" +
                "Name: " + tanja.getName() + "\n" +
                "Age: " + tanja.getAge() + "\n" +
                "Occupation: " + tanja.getOccupation() + "\n" +
                "Money availability: " + tanja.getMoneyAvailability() + "\n" +
                "Time availability: " + tanja.getTimeAvailability() + "\n" +
                "Residence: " + tanja.getResidence() + "\n");

        System.out.println("The dog food's details: \n" +
                "Name: " + pedigree.getName() + "\n" +
                "Price: " + pedigree.getPrice() + "\n" +
                "Quantity: " + pedigree.getQty() + "\n" +
                "Stock availability: " + pedigree.getStockAvailability() + "\n");

        System.out.println("The veterinary's details: \n" +
                "Name: " + drCurt.getName() + "\n" +
                "Price range: " + drCurt.getPriceRange() + "\n" +
                "Specialization: " + drCurt.getSpecialization() + "\n" +
                "Availability: " + drCurt.getAvailability() + "\n");

        System.out.println(dog.getName() +  " likes this recreational activity: " + playing.getName());
    }

}
