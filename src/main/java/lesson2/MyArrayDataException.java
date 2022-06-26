package lesson2;

public class MyArrayDataException extends Exception {

    public MyArrayDataException(int i, int j) {
        super (String.format("Incorrect data in cell [%s][%s]", i, j ));
    }
}
