package Tema_Lab10;

public class Exercise7 {
    public static void main(String[] args) {
        System.out.println(tempCels(-12));
    }
    public static float tempCels(float fahr) {
        return (float)5 / 9 * (fahr - 32);
    }
}
