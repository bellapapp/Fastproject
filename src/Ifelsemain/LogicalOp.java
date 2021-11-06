package Ifelsemain;

public class LogicalOp {
    public int checkBiggerNumber(int first, int second) {
        if (first > second) {
            return first;
        }
        return second;
    }

    public String exercise4(String text) {
        if (text.equals("FastTrackIT")) {
            return "Learning text comparison";
        }
        return "Got to try some more";
    }

    public String exercise5(String text, int number) {
        if (text.equals("FastTrackIT") && number <= 3) {
            return text + number;
        } else if (!text.equals("FastTrackIT") && number >= 4) {
            return number + text;
        }
        return "Keep trying!";
    }

    public String exercise6(int number) {
        if (number > 8 || number == 6) {
            return "The amount of snow this winter was(cm): " + number;
        }
        return "The forecast snow is(cm): " + number;
    }

    public String exercise7(int number) {
        if (number > 3 && number != 4) {
            return "The number is greater than 3 and not equal to 4";
        } else if (number == 4) {
            return "The number is equal to 4";
        }
        return "The number is lower than 3";
    }

    public void exercise8(int number) {
        switch (number) {
            case 1:
                System.out.println("The number is: 1");
                break;
            case 2:
                System.out.println("The number is: 2");
                break;
            case 3:
                System.out.println("The number is: 3");
                break;
            case 4:
                System.out.println("The number is: 4");
                break;
            case 5:
                System.out.println("The number is: 5");
                break;
            default:
                System.out.println("Not found!");
        }
    }

    public boolean isNumberEven(int number) {
        return number % 2 == 0;
    }

    public boolean isEligibleToVote(int age) {
        return age > 18;
    }

    public int exercise11(int first, int second, int third) {
        if (first >= second && first >= third) {
            return first;
        } else if (second >= first && second >= third) {
            return second;
        } else {
            return third;
        }
    }
}

