package lesson2;
import java.util.Arrays;

public class Main {

    static int sqrArrSize = 4;

    public static void main(String[] args) throws MyArraySizeException {

    String[][] str = {
            {"45","20", "1", "21"},
            {"32", "43", "2", "55"},
            {"17", "29", "9", "5"},
            {"78", "3", "2", "q"},
            };

check(str);
    }

static void check (String[][] str) throws MyArraySizeException, MyArrayDataException {
        int amount =0;
   for (int i=0; i<str.length; i++) {
    if ((str.length != sqrArrSize)||(str[i].length != sqrArrSize)){
    throw new MyArraySizeException(str);
    }
       System.out.println(Arrays.toString(str[i]));

       for (int j = 0; j < str[i].length; j++) {
           try {
               int x =  Integer.parseInt(str[i][j]);
               amount += x;
           } catch (NumberFormatException e){
               System.out.println(" Элемент " + str[i][j] + " в " + i + " строке " + j + " столбца нельзя преобразовать в число");
               throw new MyArrayDataException(str[i][j]);
           }

       }
    }
    System.out.println(" Сумма элементов массива равна " + amount);

}


        }



