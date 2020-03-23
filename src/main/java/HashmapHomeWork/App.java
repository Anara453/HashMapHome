package HashmapHomeWork;

import java.util.HashMap;
import java.util.Random;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) {
        //task1
        HashMap<Integer,String> digitsMap = new HashMap<>();
        digitsMap.put(1,"One");
        digitsMap.put(2,"Two");
        digitsMap.put(3,"Three");
        digitsMap.put(4,"Four");
        digitsMap.put(5,"Five");
        for (int key : digitsMap.keySet()) {
            System.out.println(digitsMap.get(key));
        }
        //Task2
        Random rnd = new Random();
        int a = rnd.nextInt(1+10)-1;
        HashMap<Integer,String> num = new HashMap<>();
        num.put(1,"Digit- "+a);
        for (int keys :num.keySet()) {
            System.out.println(num.get(keys));
        }
        //Task3
        Set<Integer>setKeys = digitsMap.keySet();
        for (Integer b : digitsMap.keySet()) {
            if (b<=5) digitsMap.put(b,"Digit"+b);
        System.out.println(digitsMap.get(setKeys));
    }
        //Task4
        HashMap<String,Integer> digitsMap2 = new HashMap<>();
        digitsMap2.put("digit",1);
        for (String k : digitsMap2.keySet()) {
            System.out.println(digitsMap2.get(k)+":"+digitsMap2.values());
        }
        //Task5
        System.out.println(digitsMap.size());
        System.out.println(digitsMap.keySet());
        System.out.println(digitsMap.values());
}
}
