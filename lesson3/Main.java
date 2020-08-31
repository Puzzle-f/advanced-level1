package lesson3;
import java.util.HashMap;
import java.util.Map;
public class Main {

    static String literacy(int n){
    if (n>1 && n<5){
        return " раза ";
    } else return " раз ";
    };

    public static void main(String[] args) {

        String[] arr = {"груша", "абрикос", "яблоко", "арбуз", "дыня", "абрикос", "дыня",
                "яблоко", "дыня",   "яблоко", "яблоко", "яблоко",  "груша", "абрикос", "арбуз"};

        Map <String, Integer> map = new HashMap<>();

        for (String s : arr) {
            Integer value = map.getOrDefault(s, 0);
            map.put(s, value + 1);
        }
     map.forEach((k,v) ->{
         System.out.println(k + " встречается " + v + literacy(v));
     });
    }
}
