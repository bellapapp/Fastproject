package Tema_Lab10;

public class Exercise9 {
    public static void main(String[] args) {
        exercitiul9(100000, 1,15,20);
    }

    public static void exercitiul9(int distanta, int ora, int minuta, int secunda){
        float timpul = (ora * 60 * 60) + (minuta * 60) + secunda;
        float mPerS = distanta/timpul;
        double kmPerH = mPerS * 3.6;
        double milePerH = mPerS * 2.23694;

        System.out.println("Metri/secunda: " + mPerS + "\n" +
                "Kilometri/ora: " + kmPerH + "\n" +
                "Mile/ora: " + milePerH);
    }
    }
