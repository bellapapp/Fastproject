public class Lab13 {
    public static void main(String[] args) {
//        int[] arrayBella = populateArray(10);
//        System.out.println(containArray(15, arrayBella));
//        System.out.println(containArray(5, arrayBella));
//        System.out.println(containArray2(5,arrayBella));

        String bella;
        bella = new String("Zoli");
        int[] arrayZoli;
        arrayZoli = populateArray(15);
        System.out.println(containArray2(17, arrayZoli));


    }

    public static int[] populateArray(int max) {
        int[] myArr = new int[max];
        for (int i = 0; i < max; i++) {
            myArr[i] = i + 1;
        }
        return myArr;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static String containArray(int number, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                return "True";
            }
        }
        return "False";
    }

    public static Boolean containArray2(int number, int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                return true;
            }
        }
        return false;

    }

    public static int[] exercise3altfel(int[] array) {
        int counter = 0;
        int max = 100;
        for (int i = 1; i <= max; i++) {
            if (i % 2 == 0){
                array[counter] = i;
                counter++;
            }
        }
        return array;
    }
}



