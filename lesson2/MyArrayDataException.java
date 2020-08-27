package lesson2;

public class MyArrayDataException extends NumberFormatException{
    private String s;

    public MyArrayDataException(String s) {
        this.s = s;
        System.out.println(" Не удалось преобразовать в число! ");
    }
}