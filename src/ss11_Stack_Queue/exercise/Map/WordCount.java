package ss11_Stack_Queue.exercise.Map;

import java.util.*;
import java.util.TreeMap;


public class WordCount {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi:");
        String str = scanner.nextLine();
        String[] words = str.split(" ");

        TreeMap<String,Integer> map = new TreeMap<>();

        for (String word : words){
            word = word.toLowerCase();
            if (map.containsKey(word)){
                map.put(word, map.get(word) + 1);
            }else {
                map.put(word,1);
            }
        }

        for(String key:  map.keySet()){
            System.out.println(key + ":" + map.get(key));
        }
    }

}
