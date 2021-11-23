package Tema_Lab14_Lists;

import java.util.ArrayList;
import java.util.List;

public class TemaOptionala {
    public static void main(String[] args) {
        List<Integer> myFirstList = new ArrayList<>();

        myFirstList.add(15);
        myFirstList.add(22);
        myFirstList.add(3);
        myFirstList.add(6);
        myFirstList.add(100);
        myFirstList.add(37);
        myFirstList.add(1);
        myFirstList.add(18);

        System.out.println(myFirstList);

        exercise1(myFirstList, 1, 5);
        System.out.println(myFirstList);

        List<Integer> mySecondList = exercise2(myFirstList);
        System.out.println(mySecondList);

        exercise3(myFirstList);
        System.out.println(myFirstList);
    }

    public static List<Integer> exercise1(List<Integer> myList, int position, int position2) {
        int temp = myList.get(position);
        myList.set(position, myList.get(position2));
        myList.set(position2, temp);

        return myList;
    }

    public static List<Integer> exercise2(List<Integer> myList) {
        List<Integer> mySecondList = new ArrayList<>();

        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) % 2 == 0) {
                mySecondList.add(myList.get(i));
            }
        }

        return mySecondList;
    }

    public static List<Integer> exercise3(List<Integer> myList) {
        int temp;

        for (int i = 0; i < myList.size(); i++) {
            for (int j = i + 1; j < myList.size(); j++) {
                if (myList.get(i) > myList.get(j)) {
                    temp = myList.get(i);
                    myList.set(i, myList.get(j));
                    myList.set(j, temp);
                }
            }
        }

        return myList;
    }
}
