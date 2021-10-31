public class Lab10 {
    public static int x = 7;
    public static int z = 3;

    public static void main(String[] args) {
        // Tema Lab 10 - exercitiul 2
        //
        Lab10Calculator calchere = new Lab10Calculator();
        Lab10Print printhere = new Lab10Print();
        int odaat = Lab10Calculator.calvar;
        System.out.println(Lab10Calculator.calvar);
        System.out.println(Lab10Calculator.calvar);
        System.out.println(odaat);
        printhere.printMyName();
        printhere.printMyName();
        System.out.println("\n");

        int result1 = calchere.sum(x, z);
        int result2 = calchere.subs(x, z);
        long result3 = calchere.mul(x, z);
        float result4 = calchere.div(x, z);
        float result5 = calchere.mod(x, z);

        int result7 = calchere.sum(odaat, z);
        int result8 = calchere.sum(9, odaat);
        System.out.println(result7);
        System.out.println(result8);

        System.out.println("Rezultatul adunarii a " + x + " si " + z + " este: " + result1);
        System.out.println("Rezultatul scaderii a " + x + " si " + z  + " este: " + result2);
        System.out.println("Rezultatul inmultirii a " + x + " si " + z  + " este: " + result3);
        System.out.println("Rezultatul impartirii a " + x + " la " + z  + " este: "+ result4);
        System.out.println("Rezultatul modulo-ului a " + x + " cu " + z  + " este: " + result5 + "\n");
        System.out.println(calchere.sum(odaat, 8));
        System.out.println(calchere.subs(5, 8));
        System.out.println(calchere.mul(5, 8));
        System.out.println(calchere.div(5, 8));
        System.out.println(calchere.mod(10, 3));
        System.out.println(calchere.sum(7 , 8) + calchere.subs(4, 3));
    }

}




