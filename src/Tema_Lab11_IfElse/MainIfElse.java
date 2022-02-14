package Tema_Lab11_IfElse;

public class MainIfElse {
    public static void main(String[] args) {
        LogicalOpIfElse logicalop = new LogicalOpIfElse();
        int biggest = logicalop.checkBiggerNumber(2, 8);
        System.out.println("The bigger number is: " + biggest);
        System.out.println(logicalop.checkBiggerNumber(28, 7));
        System.out.println(logicalop.exercise4("FastTrack"));
        System.out.println(logicalop.exercise4("FastTrackIT"));
        System.out.println(logicalop.exercise5("FastTrackIT", 2));
        System.out.println(logicalop.exercise5("FastTrackITT", 8));
        System.out.println(logicalop.exercise5("FastTrackIT", 8));
        System.out.println(logicalop.exercise5("FastTrackITT", 2));
        System.out.println(logicalop.exercise6(6));
        System.out.println(logicalop.exercise6(15));
        System.out.println(logicalop.exercise6(7));
        System.out.println(logicalop.exercise7(9));
        System.out.println(logicalop.exercise7(4));
        System.out.println(logicalop.exercise7(-5));
        logicalop.exercise8(4);
        logicalop.exercise8(15);
        System.out.println(logicalop.isNumberEven(9));
        System.out.println(logicalop.isNumberEven(12));
        System.out.println(logicalop.isEligibleToVote(16));
        System.out.println(logicalop.isEligibleToVote(19));
        System.out.println(logicalop.exercise11(10,7,6));
        System.out.println(logicalop.exercise11(10,10,10));
        System.out.println(logicalop.exercise11(10,10,615));
        System.out.println(logicalop.exercise11(10,20,6));

    }
}
