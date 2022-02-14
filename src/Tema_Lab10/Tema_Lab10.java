package Tema_Lab10;

public class Tema_Lab10 {

    public void printAnnabella() {
        System.out.println("Hello Annabella");
    }

    public void printTema2() {
        System.out.println(20 + 7);
    }

    public void printTema3() {
        System.out.println((float) 55 / 9);
    }

    public void printTema4a() {
        System.out.println(-5 + 8 * 6);
    }

    public void printTema4b() {
        System.out.println((55 + 9) % 9);
    }

    public void printTema4c() {
        System.out.println(20 + -3 * 5 / 8);
    }

    public void printTema4d() {
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);
    }

    public int sum(int first, int second) {
        return first + second;
    }

    public int subs(int first, int second) {
        return first - second;
    }

    public long mul(int first, int second) {
        return (long) first * second;
    }

    public float div(int first, int second) {
        return (float) first / second;
    }

    public void printJava() {
        System.out.println("""
                   J    a   V      V   a
                   J   a a   V    V   a a
                J  J  aaaaa   V V    aaaaa
                 JJ  a     a   V    a     a""");
    }

    public float medianumerelor(float first, float second, float third) {
        return (first + second + third) / 3;
    }

    public void printCup() {
        System.out.println("""
                 +""\"""+
                [| ° ° | ]
                 |  ^  |
                 | '_' |
                 +-----+""");
    }

    public int mod(int first, int second) {
        return first % second;
    }

    public float tempCels(float fahr) {
        return (float) 5 / 9 * (fahr - 32);
    }

    public float inchToMeter(float inch) {
        return (float) 0.0254 * inch;
    }

    public void exercitiul9(int distanta, int ora, int minuta, int secunda) {
        float timpul = (ora * 60 * 60) + (minuta * 60) + secunda;
        float mPerS = distanta / timpul;
        double kmPerH = mPerS * 3.6;
        double milePerH = mPerS * 2.23694;

        System.out.println("Meter per second: " + mPerS + "\n" +
                "Kilometer per hour: " + kmPerH + "\n" +
                "Mile per hour: " + milePerH);
    }

}
