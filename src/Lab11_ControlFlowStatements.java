public class Lab11_ControlFlowStatements {
    public static void main(String[] args) {
//        LogicalOperation logop = new LogicalOperation();
//        System.out.println(logop.exercise2("FastTrack"));
//        logop.exercise3(15);
//        System.out.println(logop.exercise5(15));
        factorial();
        int[] vector = {1, 2, 3, 4, 5};
        int suma = 0;
        for (int j = 0; j < vector.length; j++)
            suma += vector[j];
            System.out.println("Suma este " + suma);


    }
        public static void factorial () {
            int number = 1;
            int i = 0;
            int factorialNumber = 5;

            while (i < factorialNumber) {
                i++;
                number = number * i;
            }
            System.out.println(number);

        }
    }
