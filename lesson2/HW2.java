package lesson2;

public class HW2 {
    public static void main(String[] args) {
        System.out.println (methodSum (5, -10));
        positiveOrNegative(-11);
        System.out.println (negativePositive(-1));
        printString ("Happy Haloween", 3);

    }

        public static boolean methodSum (int a, int b) {
            int sum = a + b;
            return sum >=10 && sum <=20;
        }
    public static void positiveOrNegative (int a) {
        if ( a >=0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }

        }

    public static boolean negativePositive (int a) {
        return a < 0;
    }

    public static void printString (String phrase, int number) {
        for ( int i=0; i<number; i++) {
            System.out.println(phrase);
        }
        }


    }


