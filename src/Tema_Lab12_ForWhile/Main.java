package Tema_Lab12_ForWhile;

public class Main {
    public static void main(String[] args) {
        LogicalOpFor opFor = new LogicalOpFor();
        LogicalOpWhile opWhile = new LogicalOpWhile();

        opFor.exercise1(95);
        opFor.exercise2(-103);
        opFor.exercise3(2, 8);
        opFor.exercise4(9, 2);
        opFor.exercise5();
        opFor.exercise6();
        System.out.println(opFor.exercise7(85));
        System.out.println(opFor.exercise8(85));
        opFor.exercise9();
        opWhile.exercise1(95);
        opWhile.exercise2(-103);
        opWhile.exercise3(8, 2);
        opWhile.exercise4(2, 9);
        opWhile.exercise5();
        opWhile.exercise6();
        opWhile.exercise7();
        opWhile.exercise8(7, 14);
        opWhile.numberFibonacci();
        opWhile.CozaLozaWoza();
    }
}
