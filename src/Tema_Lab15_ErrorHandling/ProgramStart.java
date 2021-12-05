package Tema_Lab15_ErrorHandling;


public class ProgramStart extends MenuOptions {

    ReadFromKeyboard read = new ReadFromKeyboard();

    public void printMainMenu() {
        System.out.println(Messages.MAIN_MENU);
    }

    public void printMathematicalMenu() {
        System.out.println(Messages.MATHEMATICAL_MENU);
    }

    public void printLogicalMenu() {
        System.out.println(Messages.LOGICAL_MENU);
    }


    public boolean runMainMenuOption() {
        printMainMenu();
        System.out.println();
        int option = read.getOption();

        switch (option) {
            case 0:
                System.out.println(Messages.BYE);
                return false;
            case 1:
                do {
                } while (runMathematicalOption());
                return true;
            case 2:
                do {
                } while (runLogicalOption());
                return true;
            default:
                System.out.println(Messages.INCORRECT_OPTION);
                return true;
        }
    }

    public boolean runMathematicalOption() {
        printMathematicalMenu();
        System.out.println();
        int option = read.getOption();

        switch (option) {
            case 0:
                return false;
            case 1:
                doSum();
                return true;
            case 2:
                doSubtract();
                return true;
            case 3:
                doMultiplication();
                return true;
            case 4:
                doDivision();
                return true;
            case 5:
                modulo();
                return true;
            case 6:
                averageFromAList();
                return true;
            case 7:
                sumToOneHundred();
                return true;
            case 8:
                averageToOneHundred();
                return true;
            default:
                System.out.println(Messages.INCORRECT_OPTION);
                return true;
        }
    }

    public boolean runLogicalOption() {
        printLogicalMenu();
        System.out.println();
        int option = read.getOption();

        switch (option) {
            case 0:
                return false;
            case 1:
                tempCelsius();
                return true;
            case 2:
                inchToMeter();
                return true;
            case 3:
                kmPerHour();
                return true;
            case 4:
                checkBiggerNumber();
                return true;
            case 5:
                isNumberEven();
                return true;
            case 6:
                isEligibleToVote();
                return true;
            case 7:
                sortAList();
                return true;
            case 8:
                returnPositionsFromAList();
                return true;
            case 9:
                checkSmallestAndBiggestFromArray();
                return true;
            default:
                System.out.println(Messages.INCORRECT_OPTION);
                return true;
        }
    }


    public void runMainProgram() {
        boolean repeatProgram;
        do {
            repeatProgram = runMainMenuOption();
        } while (repeatProgram);
    }
}

