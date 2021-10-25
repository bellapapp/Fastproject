public class Lab_2Java {
    public static int x = 7;
    public static int z = 3;

    public static void main(String[] args) {
        // Tema
        // 1
        Calculator calchere = new Calculator();
        Print printhere = new Print();

        printhere.PrintMyName();
        printhere.PrintCosminsName();
        System.out.println("\n");

        int result1 = calchere.sum(x, z);
        int result2 = calchere.subs(x, z);
        long result3 = calchere.mul(x, z);
        float result4 = calchere.div(x, z);
        float result5 = calchere.mod(x, z);

        System.out.println("Rezultatul adunarii a " + x + " si " + z + " este: " +result1);
        System.out.println("Rezultatul scaderii a " + x + " si " + z  + " este: " + result2);
        System.out.println("Rezultatul inmultirii a " + x + " si " + z  + " este: " + result3);
        System.out.println("Rezultatul impartirii a " + x + " la " + z  + " este: "+ result4);
        System.out.println("Rezultatul modulo-ului a " + x + " cu " + z  + " este: " + result5 + "\n");
        System.out.println(calchere.sum(5, 8));
        System.out.println(calchere.subs(5, 8));
        System.out.println(calchere.mul(5, 8));
        System.out.println(calchere.div(5, 8));
        System.out.println(calchere.mod(10, 3));
    }

}




