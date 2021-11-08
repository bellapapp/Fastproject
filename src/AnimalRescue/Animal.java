package AnimalRescue;

public class Animal {
    private String name;
    private String breed;
    private int age;
    private float weight;
    private String color;
    private int height;
    private int feelingHungry;
    private int healthy;
    private int mood;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setFeelingHungry(int feelingHungry) {
        this.feelingHungry = feelingHungry;
    }

    public int getFeelingHungry() {
        return feelingHungry;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }

    public int getMood() {
        return mood;
    }

    public void sleep() {
        System.out.println("Sleeping ...");
    }

    public void eat() {
        System.out.println("Eating ...");
    }

    public void play() {
        System.out.println("Playing ...");
    }

    public void speak() {
        System.out.println("Bark! ");
    }
}