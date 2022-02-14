package Tema_Lab15_ErrorHandling;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ReadFromKeyboard {

    public int getInt() {
        int count = 0;

        do {
            Scanner scan = new Scanner(System.in);
            try {
                System.out.println(Messages.ENTER_NUMBER);

                return scan.nextInt();
            } catch (InputMismatchException error) {
                System.out.println(Messages.INCORRECT_VALUE);
                count++;
            }
            if (count == 5) {
                wait(5);
                count = 0;
            }
        } while (true);
    }

    public int getOption() {
        int count = 0;

        do {
            Scanner scan = new Scanner(System.in);
            try {
                System.out.println(Messages.ENTER_OPTION);

                return scan.nextInt();
            } catch (InputMismatchException error) {
                System.out.println(Messages.INCORRECT_OPTION);
                count++;
            }
            if (count == 5) {
                wait(5);
                count = 0;
            }
        } while (true);
    }

    public long getLong() {
        int count = 0;

        do {
            Scanner scan = new Scanner(System.in);
            try {
                System.out.println((Messages.ENTER_NUMBER));

                return scan.nextLong();
            } catch (InputMismatchException error) {
                System.out.println(Messages.INCORRECT_VALUE);
                count++;
            }
            if (count == 5) {
                wait(5);
                count = 0;
            }
        } while (true);
    }

    public float getFloat() {
        int count = 0;

        do {
            Scanner scan = new Scanner(System.in);
            try {
                System.out.println((Messages.ENTER_NUMBER));

                return scan.nextFloat();
            } catch (InputMismatchException error) {
                System.out.println(Messages.INCORRECT_VALUE);
                count++;
            }
            if (count == 5) {
                wait(5);
                count = 0;
            }
        } while (true);
    }

    public double getDouble() {
        int count = 0;

        do {
            Scanner scan = new Scanner(System.in);
            try {
                System.out.println((Messages.ENTER_NUMBER));

                return scan.nextDouble();
            } catch (InputMismatchException error) {
                System.out.println(Messages.INCORRECT_VALUE);
                count++;
            }
            if (count == 5) {
                wait(5);
                count = 0;
            }
        } while (true);
    }

    public String getString() {
        int count = 0;

        do {
            Scanner scan = new Scanner(System.in);
            try {
                System.out.println(Messages.ENTER_STRING);

                return scan.next();
            } catch (InputMismatchException error) {
                System.out.println(Messages.INCORRECT_VALUE);
                count++;
            }
            if (count == 5) {
                wait(5);
                count = 0;
            }
        } while (true);
    }


    public int[] getIntArray(int size) {
        int[] myArray = new int[size];
        System.out.println(Messages.ENTER_ARRAY_NUMBERS);
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = getInt();
        }

        return myArray;
    }

    public String[] getStringArray(int size) {
        String[] myArray = new String[size];
        System.out.println(Messages.ENTER_ARRAY_STRINGS);
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = getString();
        }

        return myArray;
    }

    public List<Integer> getIntegerList() {

        List<Integer> myList = new ArrayList<>();
        System.out.println(Messages.ENTER_LIST_VALUES);

        do {
            Scanner scan = new Scanner(System.in);
            try {
                System.out.println((Messages.ENTER_NUMBER));
                myList.add(scan.nextInt());
            } catch (InputMismatchException error) {
                System.out.println(Messages.FINISHED_LIST);
                break;
            }
        } while (true);

        return myList;
    }

    private void wait(int seconds) {
        System.out.print(Messages.SLEEPING);
        do {
            System.out.print(seconds + " ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            seconds--;
        } while (seconds > 0);
        System.out.println();
    }

    public String getUsername() {
        Scanner scan = new Scanner(System.in);
        System.out.println(Messages.ENTER_USERNAME);

        return scan.next();
    }

    public String getPassword() {
        Scanner scan = new Scanner(System.in);
        System.out.println(Messages.ENTER_PASSWORD);

        return scan.next();
    }
}



