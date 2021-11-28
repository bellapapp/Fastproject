package Tema_Lab11_AnimalRescue;

public class Nurse extends Veterinary {


    public void surgery() {
        System.out.println("I am a nurse, I can't perform surgery on animals.");
    }

    @Override
    public void nonSpecialization() {
        System.out.println("I can only treat dogs.");
    }
}
