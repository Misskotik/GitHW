package JC3;
import java.util.Arrays;
import java.util.List;

public class JC3 {
    public static void main (String[]args) {
        String [] array = {"cat", "dog", "horse", "wombat", "koala"};
        System.out.println(Arrays.toString(array));
        swapWords (array, 1,3);
        System.out.println(Arrays.toString(array));
        System.out.println( "*****************************" );

        Orange orange = new Orange();
        Apple apple = new Apple ();
        Box <Orange> boxOrange = new Box();
        Box <Orange> boxOrange2 = new Box ();
        Box <Apple> boxApple = new Box ();

        // adding Oranges to the box
        boxOrange.add (new Orange());
        // adding Oranges to another box
        for (int i = 0; i<3; i++) {
            boxOrange2.add (new Orange ());
        }
        // adding Apples to the box
        for (int i = 0; i<10; i++) {
            boxApple.add (new Apple ());
        }
        boxOrange.printInfo();
        boxOrange2.printInfo();
        boxApple.printInfo();


        Float orangeWeight = boxOrange.getWeight();
        Float orange2Weight = boxOrange2.getWeight();
        Float appleWeight = boxApple.getWeight();
        System.out.println("1st box with oranges weighs: " + orangeWeight);
        System.out.println("2nd box weighs: " + orange2Weight);
        System.out.println("Box with apples weighs: " + appleWeight);

        System.out.println("1st Orange box weight = Apple box weight: " + boxOrange.compare(boxApple));
        System.out.println("2nd Orange box weight = Apple box weight: " + boxOrange2.compare(boxApple));

        boxOrange.changeBox(boxOrange2);

        boxOrange.printInfo();
        boxOrange2.printInfo();
        boxApple.printInfo();
    }

    private static <T> void swapWords (T[]arr, int x, int y) {
        T a = arr [x];
        arr [x] = arr [y];
        arr [y] = a;
    }
}
