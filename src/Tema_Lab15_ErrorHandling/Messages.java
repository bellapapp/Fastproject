package Tema_Lab15_ErrorHandling;

public class Messages {

    public static final String TEXT_RED = "\u001B[31m";

    public static final String TEXT_RESET = "\u001B[0m";

    public static final String HELLO = """
            Hello,
            if you want to enjoy the Program Java please log in.""";

    public static final String ENTER_NUMBER = "Enter a number: ";

    public static final String ENTER_OPTION = "Enter the number of the option: ";

    public static final String INCORRECT_VALUE = TEXT_RED + "Incorrect value! Try again." + TEXT_RESET;

    public static final String ENTER_STRING = "Enter a String:";

    public static final String ENTER_ARRAY_NUMBERS = "Enter the numbers of the Array:";

    public static final String ENTER_ARRAY_STRINGS = "Enter the Strings of the Array:";

    public static final String ENTER_LIST_VALUES = "Enter the numbers of the List. " +
            "To finish the List enter anything else than a number.";

    public static final String FINISHED_LIST = "Finished List. ";

    public static final String BYE = "Sorry to see you go... :(";

    public static final String INCORRECT_OPTION = TEXT_RED + "Incorrect option, try again!" + TEXT_RESET;

    public static final String SLEEPING = "Sleeping for: ";

    public static final String SUCCESS_LOGIN = "Login Success!";

    public static final String FAILED_LOGIN = TEXT_RED + "Failed Login!" + TEXT_RESET;

    public static final String ENTER_USERNAME = "\n" +
            "Enter the username: ";

    public static final String ENTER_PASSWORD = "Enter the password: ";

    public static final String MAIN_MENU = """
                        
            Please select an option:
            1. Mathematical operations
            2. Logical Operations
            0. Exit""";

    public static final String MATHEMATICAL_MENU = """
                        
            Please select an option:
            1. Sum
            2. Subtraction
            3. Multiplication
            4. Division
            5. Modulo
            6. Get average from a List
            7. Sum to 100
            8. Average to 100
            0. Back to the Main menu""";

    public static final String LOGICAL_MENU = """
                        
            Please select an option:
            1. Fahrenheit temperature to Celsius
            2. Inch to meter
            3. Speed in m/s, km/h, m/h
            4. Check the bigger number
            5. Is Number even?
            6. Is Eligible to vote?
            7. Sort a List
            8. Return the positions and the values from a List
            9. Check the smallest and the biggest number from an Array
            0. Back to the Main menu""";

    public static final String SUM_HELLO = "You will enter 2 numbers, then we return the sum of them.";

    public static final String SUM = "The sum of the two numbers is: ";

    public static final String SUBTRACTION_HELLO = "You will enter 2 numbers, " +
            "then we return the subtract the second entered number from the first.";

    public static final String SUBTRACTION = "The subtraction of the two numbers is: ";

    public static final String MULTIPLICATION_HELLO = "You will enter 2 numbers, " +
            "then we return the multiplication of them.";

    public static final String MULTIPLICATION = "The multiplication of the two numbers is: ";

    public static final String DIVISION_HELLO = "You will enter 2 numbers, " +
            "then we return the division of the first entered number to the second.";

    public static final String DIVISION = "The division of the two numbers is: ";

    public static final String MODULO_HELLO = "You will enter 2 numbers, then we return the rest from the division.";

    public static final String MODULO = "The rest is: ";

    public static final String AVERAGE_FROM_LIST_HELLO = "You will enter a List, " +
            "than we return the average from the entered List. ";

    public static final String AVERAGE_FROM_LIST = "The average from the list is: ";

    public static final String SUM_TO_ONE_HUNDRED_HELLO = "You will enter a number from 1 to 100, " +
            "than we return the sum from the entered number to 100.";

    public static final String SUM_TO_ONE_HUNDRED = "The sum is: ";

    public static final String AVERAGE_TO_ONE_HUNDRED_HELLO = "You will enter a number from 1 to 100, " +
            "than we return the average from the entered number to 100.";

    public static final String AVERAGE_TO_ONE_HUNDRED = "The average is: ";

    public static final String TEMP_CELSIUS_HELLO = "You will enter the temperature in Fahrenheit, " +
            "then we return the temperature in Celsius.";

    public static final String TEMP_CELSIUS = "The temperature in Celsius is: ";

    public static final String INCH_TO_METER_HELLO = "You will enter the distance in inch, " +
            "than we return the distance in meter.";

    public static final String INCH_TO_METER = "The distance in meter is: ";

    public static final String KM_PER_HOUR_HELLO = """
            You will enter 4 numbers:\s
            1. The distance in meter,\s
            and the time in 3 numbers:
            2. Hours
            3. Minutes
            4. Seconds
            We will return you in meter per second, kilometer per hour and mile per hour.""";

    public static final String CHECK_BIGGER_HELLO = "You will enter two numbers, " +
            "than we return the bigger number.";

    public static final String CHECK_BIGGER_NUMBER = "The bigger number is: ";

    public static final String IS_NUMBER_EVEN_HELLO = "You will enter a number, " +
            "if it's even we return true, if it's not we return false.";

    public static final String IS_NUMBER_EVEN = "The number is even: ";

    public static final String IS_ELIGIBLE_TO_VOTE_HELLO = "You will enter a number of Age, " +
            "if it's eligible to vote we return true, if it's not we return false.";

    public static final String IS_ELIGIBLE_TO_VOTE = "It's eligible to vote: ";

    public static final String SORT_LIST_HELLO = "You will enter a List, than we return you in ascending order.";

    public static final String SORT_LIST = "The sorted list is: ";

    public static final String RETURN_POSITIONS_FROM_A_LIST_HELLO = "You will enter a list, " +
            "than we return the values and their positions.";

    public static final String RETURN_POSITIONS_FROM_A_LIST = "The positions and their values: ";

    public static final String CHECK_BIGGEST_AND_SMALLEST_ARRAY_HELLO = "You will enter an Array, " +
            "than we return the biggest and the smallest number from the entered Array.\n" +
            "First of all enter the Array length, than the Array values.";

    public static final String CHECK_BIGGEST_AND_SMALLEST_ARRAY_LENGTH = "The length of the Array is :";

}
