package AnimalRescue;

public class Rescuer {
    private String name;
    private String occupation;
    private String residence;
    private int age;
    private int timeAvailability;
    private int moneyAvailability;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public String getResidence() {
        return residence;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setTimeAvailability(int timeAvailability) {
        this.timeAvailability = timeAvailability;
    }

    public int getTimeAvailability() {
        return timeAvailability;
    }

    public void setMoneyAvailability(int moneyAvailability) {
        this.moneyAvailability = moneyAvailability;
    }

    public int getMoneyAvailability() {
        return moneyAvailability;
    }


    public void adoption() {
        System.out.println("She adopts a dog. ");
    }

    public void vetCheck() {
        System.out.println("She takes the dog to the vet. ");
    }

    public void playWithTheDog() {
        System.out.println("She plays with the dog. ");
    }

    public void buyGames() {
        System.out.println("She goes to the pet shop to buy games for the dog. ");
    }

    public void buyFood() {
        System.out.println("She buys food for the dog. ");
    }
}

