package JC2;

public class MyArrayDataException extends NumberFormatException {
    int x, y;

    public MyArrayDataException(int x, int y) {
        super(String.format ("Symbol or text instead of number in %d i, %d j  " + "x" + x + ", y " + y));
        this.x = x;
        this.y = y;
    }


}
