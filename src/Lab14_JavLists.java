import java.util.ArrayList;
import java.util.List;

public class Lab14_JavLists {
    public static void main(String[] args) {

        List<Integer> myFirstList = getPopulatedList(14);

        List<String> myFirstStringList = new ArrayList<>();
        myFirstStringList.add("Blue");
        myFirstStringList.add("White");
        myFirstStringList.add("Black");

        System.out.println(myFirstList);
        myFirstList.add(2, 100);
        System.out.println(myFirstList);
        myFirstList.set(2,115);
        System.out.println(myFirstList);


//        exercise2(myFirstList, 15);
//        exercise1(myFirstList);
//
//        exercise3(myFirstList, 3);
//
//        exercise4(myFirstList);
//
//        exercise5(myFirstStringList, 0, "Red");
//        printStringList(myFirstStringList);
//
//        exercise6(myFirstList, 19);
//        exercise1(myFirstList);
//
//        exercise7(myFirstList);
//
//        System.out.println(exercise8(myFirstList));

    }

    public static void exercise1(List<Integer> myList) {
        for (int x : myList) {
            System.out.println(x);
        }
    }

    public static List<Integer> exercise2(List<Integer> myList, int number) {
        myList.add(number);
        return myList;
    }

    public static void exercise3(List<Integer> myList, int number) {
        for (int i = number; i <= myList.size(); i++) {
            System.out.println(myList.get(i - 1));
        }
    }

    public static void exercise4(List<Integer> myList) {
        for (int i = myList.size() - 1; i >= 0; i--) {
            System.out.println(myList.get(i));
        }
    }

    public static List<String> exercise5(List<String> myList, int number, String theString) {
        myList.add(number, theString);
        return myList;
    }

    public static List<Integer> exercise6(List<Integer> myList, int number) {
        myList.add(0, number);
        return myList;
    }

    public static void exercise7(List<Integer> myList) {
        for (int i = 0; i < myList.size(); i++) {
            System.out.println("Pe pozitia " + i + " se afla: " + myList.get(i));
        }
    }

    public static int exercise8(List<Integer> myList) {
        int biggest = myList.get(0);

        for (int i = 1; i < myList.size(); i++) {
            if (myList.get(i) > biggest) {
                biggest = myList.get(i);
            }
        }
        return biggest;
    }

    public static List<Integer> getPopulatedList(int max) {
        List<Integer> myList = new ArrayList<>();

        for (int i = 1; i <= max; i++) {
            myList.add(i);
        }
        return myList;
    }

    public static void printStringList(List<String> myList) {
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }

}
