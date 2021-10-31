package Tema_Lab10;

public class Exercise2 {
    public static void main(String[] args) {
        System.out.println("Rezultatul adunarii este: " + sum(5, 8));
        System.out.println("Rezultatul scaderii este: " + subs(5, 8));
        System.out.println("Rezultatul inmultirii este: " + mul(5, 8));
        System.out.println("Rezultatul impartirii este: " + div(5, 8));
    }

    public static int sum(int first, int second) {
        return first + second;
    }

    public static int subs(int first, int second) {
        return first - second;
    }

    public static long mul(long first, long second) {
        return first * second;
    }

    public static float div(float first, float second) {
        return first / second;
    }
}
