package Tema_Lab15_ErrorHandling;

import Tema_Lab10.Tema_Lab10;
import Tema_Lab11_IfElse.LogicalOpIfElse;
import Tema_Lab12_ForWhile.LogicalOpFor;
import Tema_Lab13_Arrays.TemaOptionalaArrays;
import Tema_Lab14_Lists.Liste;
import Tema_Lab14_Lists.TemaOptionalaListe;

import java.util.ArrayList;
import java.util.List;

public class MenuOptions {

    ReadFromKeyboard read = new ReadFromKeyboard();

    Tema_Lab10 calc = new Tema_Lab10();

    Liste liste = new Liste();

    LogicalOpIfElse logIf = new LogicalOpIfElse();

    LogicalOpFor logFor = new LogicalOpFor();

    TemaOptionalaListe temaOptionalaListe = new TemaOptionalaListe();

    TemaOptionalaArrays temaOptionalaArrays = new TemaOptionalaArrays();

    public void doSum() {
        System.out.println(Messages.SUM_HELLO);
        int first = read.getInt();
        int second = read.getInt();

        System.out.println(Messages.SUM + calc.sum(first, second));
    }

    public void doSubtract() {
        System.out.println(Messages.SUBTRACTION_HELLO);
        int first = read.getInt();
        int second = read.getInt();

        System.out.println(Messages.SUBTRACTION + calc.subs(first, second));
    }

    public void doMultiplication() {
        System.out.println(Messages.MULTIPLICATION_HELLO);
        int first = read.getInt();
        int second = read.getInt();

        System.out.println(Messages.MULTIPLICATION + calc.mul(first, second));
    }

    public void doDivision() {
        System.out.println(Messages.DIVISION_HELLO);
        int first = read.getInt();
        int second = read.getInt();

        System.out.println(Messages.DIVISION + calc.div(first, second));
    }

    public void modulo() {
        System.out.println(Messages.MODULO_HELLO);
        int first = read.getInt();
        int second = read.getInt();
        System.out.println(Messages.MODULO + calc.mod(first, second));
    }

    public void averageFromAList() {
        System.out.println(Messages.AVERAGE_FROM_LIST_HELLO);
        List<Integer> myList = new ArrayList<>();
        myList = read.getIntegerList();
        System.out.println(Messages.AVERAGE_FROM_LIST + liste.averageFromList(myList));
    }

    public void sumToOneHundred() {
        System.out.println(Messages.SUM_TO_ONE_HUNDRED_HELLO);
        int first = read.getInt();
        System.out.println(Messages.SUM_TO_ONE_HUNDRED + logFor.exercise7(first));
    }

    public void averageToOneHundred() {
        System.out.println(Messages.AVERAGE_TO_ONE_HUNDRED_HELLO);
        int first = read.getInt();
        System.out.println(Messages.AVERAGE_TO_ONE_HUNDRED + logFor.exercise8(first));
    }

    public void tempCelsius() {
        System.out.println(Messages.TEMP_CELSIUS_HELLO);
        float fahrenheit = read.getFloat();
        System.out.println(Messages.TEMP_CELSIUS + calc.tempCels(fahrenheit));
    }

    public void inchToMeter() {
        System.out.println(Messages.INCH_TO_METER_HELLO);
        int inch = read.getInt();
        System.out.println(Messages.INCH_TO_METER + calc.inchToMeter(inch));
    }

    public void kmPerHour() {
        System.out.println(Messages.KM_PER_HOUR_HELLO);
        int distance = read.getInt();
        int hours = read.getInt();
        int minutes = read.getInt();
        int seconds = read.getInt();
        System.out.println();
        calc.exercitiul9(distance, hours, minutes, seconds);
    }

    public void checkBiggerNumber() {
        System.out.println(Messages.CHECK_BIGGER_HELLO);
        int first = read.getInt();
        int second = read.getInt();
        System.out.println(Messages.CHECK_BIGGER_NUMBER + logIf.checkBiggerNumber(first, second));
    }

    public void isNumberEven() {
        System.out.println(Messages.IS_NUMBER_EVEN_HELLO);
        int first = read.getInt();
        System.out.println(Messages.IS_NUMBER_EVEN + logIf.isNumberEven(first));
    }

    public void isEligibleToVote() {
        System.out.println(Messages.IS_ELIGIBLE_TO_VOTE_HELLO);
        int first = read.getInt();
        System.out.println(Messages.IS_ELIGIBLE_TO_VOTE + logIf.isEligibleToVote(first));
    }

    public void sortAList() {
        System.out.println(Messages.SORT_LIST_HELLO);
        List<Integer> myList = new ArrayList<>();
        myList = read.getIntegerList();
        System.out.println(Messages.SORT_LIST + temaOptionalaListe.exercise3(myList));
    }

    public void returnPositionsFromAList() {
        System.out.println(Messages.RETURN_POSITIONS_FROM_A_LIST_HELLO);
        List<Integer> myList = new ArrayList<>();
        myList = read.getIntegerList();
        System.out.println(Messages.RETURN_POSITIONS_FROM_A_LIST);
        liste.exercise7(myList);
    }

    public void checkSmallestAndBiggestFromArray() {
        System.out.println(Messages.CHECK_BIGGEST_AND_SMALLEST_ARRAY_HELLO);
        int length = read.getInt();
        System.out.println(Messages.CHECK_BIGGEST_AND_SMALLEST_ARRAY_LENGTH + " " + length);
        int[] myArray = read.getIntArray(length);
        temaOptionalaArrays.exercise2(myArray);
    }
}
