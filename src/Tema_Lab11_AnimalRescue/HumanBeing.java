package Tema_Lab11_AnimalRescue;

public abstract class HumanBeing {
    private String name;
    private int age;
    private String residence;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {

        return age;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public String getResidence() {

        return residence;
    }

    public abstract void whatDoWithTheAnimal();
}
