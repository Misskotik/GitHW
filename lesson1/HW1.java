package lesson1;


    public class HW1 {
        public static void main(String[] args) {
            printThreeWords();
            checkSumSign();
            printColor();
            compareNumbers();
        }

        public static void printThreeWords() {
            System.out.println("Orange");
            System.out.println("Banana");
            System.out.println("Apple");
        }

        public static void checkSumSign() {
            int a = 5;
            int b = -5;
            int c = a + b;
            if (c >= 0) {
                System.out.println("Сумма положительная");
            } else {
                System.out.println("Сумма отрицательная");
            }
        }

        public static void printColor() {
            int value = 101;
            if (value <= 0) {
                System.out.println("Красный");
            } else if (value > 100) {
                System.out.println("Зеленый");
            } else if (value <=100 ) {
                System.out.println("Желтый");
            }


        }

        public static void compareNumbers() {
            int a = 0;
            int b = 5;
            if (a>=b) {
                System.out.println("a>=b");
            } else {
                System.out.println("a<b");
            }
        }



    }


