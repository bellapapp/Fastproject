package Tema_Lab13_Arrays;

public class LogicalOpArray {
    public static void main(String[] args) {

        int[] firstIntArray = new int[50];
        int[] arrayZoli = {5, 6, 15, 22, 13, 1, 15, 12};
        String[] firstStringArray = {"one", "two", "three", "four", "five"};
        int[] secondIntArray = new int[50];


//        exercise2();

//        exercise3(firstIntArray);
//        printArray(firstIntArray);

//        System.out.println(exercise4(firstIntArray));

//        System.out.println(exercise5(firstStringArray, "ten"));
//        System.out.println(exercise5(firstStringArray, "two"));


//        System.out.println(exercise6(firstIntArray, 999));
//        System.out.println(exercise6(firstIntArray, 50));

//        exercise7();

        printArray(exercise8(arrayZoli, 15));
//        printArray(getArrayWithoutNumber(arrayZoli,15));

//        System.out.println(exercise9(arrayZoli));

//        exercise10(firstIntArray, secondIntArray);
//        printArray(secondIntArray);

    }


    public static void exercise2() {
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.println(array[i]);
        }
    }

    public static int[] exercise3(int[] array) {
        int max = 50;

        for (int i = 1; i <= max; i++) {
            array[i - 1] = i * 2;
        }
        return array;
    }

    public static float exercise4(int[] array) {
        float sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum / array.length;
    }

    public static boolean exercise5(String[] array, String verifyWord) {
        for (int i = 0; i < array.length; i++) {
            if (verifyWord == array[i]) {
                return true;
            }
        }
        return false;
    }

    public static Integer exercise6(int[] array, int verifyNumber) {
        for (int i = 0; i < array.length; i++) {
            if (verifyNumber == array[i]) {
                return i;
            }
        }
        return null;
    }

    public static void exercise7() {
        String[] array = new String[10];

        for (int i = 0; i < 10; i++) {
            array[i] = "-";
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j]);
            }
            System.out.println();
        }
    }


    public static int[] exercise8(int[] array, int verifyNumber) {

        int found = 0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == verifyNumber) {
                found = found + 1;
            }
        }

        if (found == 0) {

            return array;
        }

        int[] newArray = new int[array.length - found];

        for (int j = 0; j < newArray.length; j++) {
            if (array[count] == verifyNumber) {
                count = count + 1;
            }
            newArray[j] = array[count];
            count++;
        }

        return newArray;
    }

    public static int exercise9(int[] array) {
        int temp;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        int smallest = array[0];
        int secondnumber = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > smallest) {
                secondnumber = array[i];
                break;
            }
        }
        return secondnumber;
    }

    public static int[] exercise10(int[] populatedArray, int[] emptyArray) {
        for (int i = 0; i < emptyArray.length; i++) {
            emptyArray[i] = populatedArray[i];
        }
        return emptyArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

