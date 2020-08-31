package lesson3;

import java.util.*;

public class PhoneDirectory {

    static TreeMap<String, Set<String>> directory = new TreeMap<>();


    public static void add(String name, String tel){
        Set<String> num = directory.getOrDefault(name, new TreeSet<>());
        num.add(tel);
        directory.put(name, num);
    }

    public static Set<String> get(String name){
        System.out.println(directory.get(name));
        return directory.get(name);
    }

    public static void main(String[] args) {

//        Написать простой класс ТелефонныйСправочник, который хранит в себе
//        список фамилий и телефонных номеров. В этот телефонный справочник с помощью
//        метода add() можно добавлять записи. С помощью метода get() искать номер телефона
//        по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов
//                (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.


        add("Петров", "89521235665");
        add("Иванов", "8952654885");
        add("Васильев", "79586549878");
        add("Петров", "555135");
        add("Мамонт", "351552");
        System.out.println(directory + "\n");

        get("Петров");


    }
}
