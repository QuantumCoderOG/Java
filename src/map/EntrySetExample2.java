package src.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EntrySetExample2 {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Banana", 1);
        map.put("Apple", 2);
        map.put("Mango", 3);
        map.put("Orange", 4);


        List<Map.Entry<String,Integer>>entryList= new ArrayList<>(map.entrySet());

        entryList.sort((a,b)->b.getValue().compareTo(a.getValue()));

        for(int i =0 ;i<4;i++){
            System.out.println(entryList.get(i).getKey());
            System.out.println(entryList.get(i).getValue());
        }
    }
}
