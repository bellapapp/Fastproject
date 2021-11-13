package Tema_Lab12_ForWhile;

public class LogicalOpFor {
    public void exercise1(int number) {
        for (int i = number; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public void exercise2(int number) {
        if (number >= -100) {
            for (int i = number; i >= -100; i--) {
                System.out.println(i);
            }
        } else if (number < -100) {
            for (int i = number; i <= -100; i++) {
                System.out.println(i);
            }
        }
    }

    public void exercise3(int x, int y) {
        if (x <= y) {
            for (int i = x; i <= y; i++) {
                System.out.println(i);
            }
        } else if (x > y) {
            for (int i = x; i >= y; i--) {
                System.out.println(i);
            }
        }
    }

    public void exercise4(int x, int y) {
        if (x > y) {
            int aux = x;
            x = y;
            y = aux;
        }
        for (int i = x; i <= y; i++) {
            System.out.println(i);
        }

    }

    public void exercise5() {
        int x = 1;

        for (int i = x; i <= 100; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }

    public void exercise6() {
        int x = 1;

        for (int i = x; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public int exercise7(int number) {
        int sum = 0;

        for (int i = number; i <= 100; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public float exercise8(int number) {
        int sum = 0;
        int count = 0;

        for (int i = number; i <= 100; i++) {
            sum = sum + i;
            count++;
        }
        return (float) sum / count;
    }

    public void exercise9() {
        int n = 7;

        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}




