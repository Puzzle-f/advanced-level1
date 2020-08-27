package lesson2;

public class MyArraySizeException extends IllegalAccessException {
    private String[][] str;

    public MyArraySizeException(String[][] str) {
        this.str = str;
        System.out.println(" Размер массива отличается от 4х4 ");
    }
}



