package JC2;

import java.util.Scanner;

import static java.lang.String.format;

public class Array {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        int x;
        int y;

        // Entering values for the Array (it should be x = 4 and y = 4)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Array length (X): ");
        x = scanner.nextInt();
        System.out.println("Enter Array height (Y): ");
        y = scanner.nextInt();
        String[][] stringArray = new String[x][y];
        try {
            createArray(stringArray, scanner, x, y);
            printStringArray(stringArray);

        } catch (MyArraySizeException e) {
            System.out.println("ERROR! Array size must be 4x4"); // if array x !=4 and array y !=4, user gets Exception warning!

        }
        changeString(stringArray, x, y);

    }

    // method for entering String values for the Array + MyArraySizeException
    public static void createArray(String[][] stringArray, Scanner scanner, int x, int y) throws MyArraySizeException {
        if (x != 4 || y != 4) throw new MyArraySizeException();
        {
            System.out.println("Array Created: " + x + "x" + y);
            for (int i = 0; i < stringArray.length; i++) {
                for (int j = 0; j < stringArray[i].length; j++) {
                    System.out.println("Enter info for  Array" + " - ");
                    stringArray[i][j] = scanner.next();

                }
            }
        }

    }

    // printing Array with String values
    private static void printStringArray(String[][] stringArray) {

        for (int i = 0; i < stringArray.length; i++) {
            System.out.print(" ");
            System.out.println();
            for (int j = 0; j < stringArray[i].length; j++)
                System.out.print(stringArray[i][j]);
            System.out.println();

        }
    }

    // method for changing String values to integer, if the value has symbol or text instead of number, user gets MyArrayDataException
    private static int changeString(String[][] stringArray, int x, int y) throws MyArrayDataException {
        int sum = 0;
        int[][] intArray = new int[x][y];
        for (
                int i = 0;
                i < stringArray.length; i++) {
            for (int j = 0; j < stringArray[i].length; j++) {
                try {
                    intArray[i][j] = Integer.parseInt(stringArray[i][j]);
                    sum += intArray[i][j];
                } catch (MyArrayDataException e) {
                    throw new MyArrayDataException(i, j);

                }

            }
        }
        printIntArray(intArray);
        return sum;
    }

        private static void printIntArray ( int[][] intArray){
            System.out.println(" Array converted to INTEGER ");
            for (int i = 0; i < intArray.length; i++) {
                for (int j = 0; j < intArray[i].length; j++) {
                    System.out.print(intArray[i][j]);
                }
                System.out.println();
            }
        }
    }




