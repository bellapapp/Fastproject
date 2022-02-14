package Tema_Lab13_Arrays;

public class TemaOptionalaArrays {
    public static void main(String[] args) {
        int[] firstArray = {1, 2, 3, 4, 5, 6, 7};
        int[] secondArray = {3, 2, 27, 8, 8, 10, 15, 88};
        String[] firstStringArray = {"white", "blue", "black", "yellow"};
        String[] secondStringArray = {"red", "pink", "white", "black", "green"};

//        exercise1(secondArray, 2, 1216);
//        printArray(secondArray);
//
//        exercise2(secondArray);
//
//        exercise3(secondArray);
//        printArray(secondArray);
//
//        exercise4(secondArray);
//
//        exercise5(firstStringArray, secondStringArray);

        exercise6(secondArray);
        printArray(secondArray);

    }


    public static int[] exercise1(int[] array, int position, int insertNumber) {
        for (int i = 0; i < array.length; i++) {
            if (i == position) {
                array[i] = insertNumber;
            }
        }
        return array;
    }

    public void exercise2(int[] array) {
        int smallest = array[0];
        int biggest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > biggest) {
                biggest = array[i];
            } else if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        System.out.println("The biggest number from the array is: " + biggest);
        System.out.println("The smallest number from the array is: " + smallest);
    }

    public static int[] exercise3(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
        return array;
    }

    public static void exercise4(int[] array) {
        System.out.println("Valori duplicate din array: ");

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[i]);
                }
            }
        }
    }

    public static void exercise5(String[] firstArray, String[] secondArray) {
        System.out.println("Elemente duplicate din array: ");

        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < secondArray.length; j++) {
                if (firstArray[i] == secondArray[j]) {
                    System.out.println(firstArray[i]);
                }
            }
        }
    }

    public static int[] exercise6(int[] array) {
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
        return array;
    }


    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}



