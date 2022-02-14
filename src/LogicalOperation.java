

public class LogicalOperation {
    public String exercise2(String text) {
        if (text.equals("FastTrack")) {
            return "Learning text comparison";
        }
        return "Got to try some more";
    }

    public int exercise3(int number) {
        if (number >= 2 && number <= 8) {
            return number;
        }else{
            return -1;}

    }
    public String exercise5(int number) {
        if (number > 8 || number == 6) {
           return "The amount of snow this winter was(cm): " + number;
        } else {
            return "The forecast snow is(cm):";
        }
    }
}
