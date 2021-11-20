package Tema_Lab13_Arrays;

import java.util.concurrent.Callable;

public class Calculator {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

//        System.out.println(cal.sum(2,9));
//        System.out.println(cal.sum(2,9,6));
//        System.out.println(cal.sum(2.3f,9.9f));
//        System.out.println(cal.sum(2.3f,9.9f,1.5f));

//        System.out.println(cal.subs(2,9));
//        System.out.println(cal.subs(2,9,6));
//        System.out.println(cal.subs(2.6f,9.5f));
//        System.out.println(cal.subs(2.3f,9.9f,1.5f));

//        System.out.println(cal.mul(112, 199));
//        System.out.println(cal.mul(112, 155, 166));
//        System.out.println(cal.mul(1.2f, 5.9f));
//        System.out.println(cal.mul(1.2f, 5.9f, 1.6f));

//        System.out.println(cal.div(15, 6));
//        System.out.println(cal.div(15, 6, 2));
//        System.out.println(cal.div(15.5f, 6.1f));
//        System.out.println(cal.div(155.3f, 6.3f, 2.2f));
//
//        System.out.println(cal.average(2,9));
//        System.out.println(cal.average(2,9,4));
//        System.out.println(cal.average(2.9f,9.3f));
//        System.out.println(cal.average(2.9f,9.3f,4.2f));
    }


    public int sum(int first, int second) {
        return first + second;
    }

    public int sum(int first, int second, int third) {
        return first + second + third;
    }

    public float sum(float first, float second, float third) {
        return first + second + third;
    }

    public float sum(float first, float second) {
        return first + second;
    }

    public int subs(int first, int second) {
        return first - second;
    }

    public int subs(int first, int second, int third) {
        return first - second - third;
    }

    public float subs(float first, float second) {
        return first - second;
    }

    public float subs(float first, float second, float third) {
        return first - second - third;
    }

    public long mul(int first, int second) {
        return (long) first * second;
    }

    public long mul(int first, int second, int third) {
        return (long) first * second * third;
    }

    public float mul(float first, float second) {
        return first * second;
    }

    public float mul(float first, float second, float third) {
        return first * second * third;
    }

    public float div(int first, int second) {
        return (float) first / second;
    }

    public float div(int first, int second, int third) {
        return (float) first / second / third;
    }

    public double div(float first, float second) {
        return (double) first / second;
    }

    public double div(float first, float second, float third) {
        return (double) first / second / third;
    }

    public float average(int first, int second) {
        return ((float) first + second) / 2;
    }

    public float average(int first, int second, int third) {
        return ((float) first + second + third) / 3;
    }

    public float average(float first, float second) {
        return (first + second) / 2;
    }

    public float average(float first, float second, float third) {
        return (first + second + third) / 3;
    }

}