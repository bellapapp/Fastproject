package Tema_Lab15_ErrorHandling;

public class LogicalOPPP {

    ReadFromKeyboard read = new ReadFromKeyboard();

    public void valueOfArrayPerIndex(int[] myArray, int index) {
        try {
            System.out.println(myArray[index]);
        } catch (IndexOutOfBoundsException error) {
            System.out.println("Inside catch, number too large.");
        }
    }
}
