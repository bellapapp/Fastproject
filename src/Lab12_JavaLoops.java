public class Lab12_JavaLoops {
    public static void main(String[] args) {
        /*show(1, 6);
        show2(89);
        show3(27,22);
        System.out.println(getAverage(2, 7));
        System.out.println(getAv2(1, 100));
        System.out.println(getAv3(1, 100));*/
        int arr[] = {2, 11, 45, 9};
        //i starts with 0 as array index starts with 0 too
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }

    public static void show(int x, int y) {
        for (int i = y; i > x; i--) {
            System.out.println(i);
        }
    }

    public static void show2(int x) {
        for (int i = x; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public static void show3(int x, int y) {
        if (x > y) {
            int aux = x;
            x = y;
            y = aux;
        }
        for (int i = x; i <= y; i++) {
            System.out.println(i);
        }
    }

    public static float getAverage(int first, int second) {
        int sum = 0;
        for (int i = first; i <= second; i++) {
            sum = sum + i;
        }
        return (float) sum / (second - first + 1);
    }

    public static float getAv2(int first, int second) {
        float sum = 0;
        int count = 0;

        while (first <= second) {
            if (first % 7 == 0) {
                sum = sum + first;
                count++;
            }
            first++;
        }
        return (sum / count);
    }

    public static float getAv3(int first, int second) {
        float sum = 0;
        int count = 0;
        for (int i = first; i <= second; i++) {
            if (i % 7 == 0) {
                sum = sum + i;
                count++;
            }
        }
        return sum / count;
    }

    public static void show4(int first) {
        while (first <= 100) {

            System.out.println(first);
            first++;
        }

    }

    public static void show5(int first) {
        do {
            System.out.println(first);
            first++;
        } while (first <= 100);
    }


    public static void perechi(int n) {
        for (int i = 0, j = n; i <= j; i++, j--) {
            System.out.println(i + " " + j);
        }
    }


    private static void numere(int n) {
        int i;
        for (i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    public static void stelute(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void steaua() {
        int n = 7;
        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

    public static void szamok() {
        int i;
        int j;
        for (i = 1; i <= 3; i++)
            for (j = 1; j <= 3; j++) {
                System.out.println(i + " " + j);
            }

    }

    public static void vooa() {
        int count = 0;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                for (int k = 1; k <= 3; k++) {
                    System.out.println(i + " " + j + " " + k);
                }
            }

            if (count < 2) {
                System.out.println("Next number");
            }
            count++;
        }
    }

    public void exercise9Zoli() {
        String output = "";
        for (int row = 7; row > 0; row--) {
            for (int i = 1; i <= row; i++) {
                System.out.print(output + "*");
            }
            System.out.println();
        }
    }

    public void exercise10() {

        for (int row = 1; row < 7; row++) {

            for (int i = 0; i < row; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void nnnn() {
        int n = 2457;

        while (n > 0) {
            System.out.println(n % 10);
            n /= 10;
        }
    }
}








        /*if(y < x){
            for( int i = y; i <= x; i++){
                System.out.println(i);
            }
        }
        else if(x < y ){
            for (int  i = x; i <= y; i++){
                System.out.println(i);
            }
        }*/



