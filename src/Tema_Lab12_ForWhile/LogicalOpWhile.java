package Tema_Lab12_ForWhile;

public class LogicalOpWhile {
    public void exercise1(int number) {
        while (number <= 100) {
            System.out.println(number);
            number++;
        }
    }

    public void exercise2(int number) {
        if (number > -100) {
            while (number >= -100) {
                System.out.println(number);
                number--;
            }
        } else if (number <= -100) {
            while (number <= -100) {
                System.out.println(number);
                number++;
            }
        }
    }

    public void exercise3(int x, int y) {
        if (x <= y) {
            while (x <= y) {
                System.out.println(x);
                x++;
            }
        } else if (x > y) {
            while (x >= y) {
                System.out.println(x);
                x--;
            }
        }
    }

    public void exercise4(int x, int y) {
        if (x <= y) {
            while (x <= y) {
                System.out.println(x);
                x++;
            }
        } else if (y < x) {
            while (y <= x) {
                System.out.println(y);
                y++;
            }
        }
    }

    public void exercise5() {
        int x = 1;
        while (x <= 100) {
            if (x % 2 == 0) {
                System.out.println(x);
            }
            x++;
        }
    }

    public void exercise6() {
        int x = 1;

        while (x <= 100) {
            if (x % 2 != 0) {
                System.out.println(x);
            }
            x++;
        }
    }


    public void exercise7() {
        int x = 111;
        int sum = 0;
        int count = 0;

        while (x <= 8899) {
            sum = sum + x;
            x++;
            count++;
        }
        System.out.println(sum);
        System.out.println((float) sum / count);
    }

    public void exercise8(int x, int y) {
        int sum = 0;
        int count = 0;

        while (x <= y) {
            if (x % 7 == 0) {
                sum = sum + x;
                count++;
            }
            x++;
        }
        System.out.println((float) sum / count);
    }

    public void numberFibonacci() {
        int first = 0;
        int second = 1;
        int count = 0;
        int third;

        System.out.println(first);
        System.out.println(second);

        while (count < 18) {
            third = first + second;
            System.out.println(third);
            first = second;
            second = third;
            count++;
        }
    }

    public void CozaLozaWoza() {
        int x = 1;
        int count = 0;
        String output;

        while (x <= 110) {
            if (x % 3 == 0 && x % 5 == 0 && x % 7 == 0) {
                output = "CozaLozaWoda";
            } else if (x % 5 == 0 && x % 7 == 0) {
                output = "WozaLoza";
            } else if (x % 3 == 0 && x % 7 == 0) {
                output = "CozaWoza";
            } else if (x % 3 == 0 && x % 5 == 0) {
                output = "CozaLoza";
            } else if (x % 7 == 0) {
                output = "Woza";
            } else if (x % 5 == 0) {
                output = "Loza";
            } else if (x % 3 == 0) {
                output = "Coza";
            } else {
                output = String.valueOf(x);
            }

            System.out.print(output + " ");

            x++;
            count++;
            if (count % 11 == 0) {
                System.out.println();
            }
        }

    }

}
