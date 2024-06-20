import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordArray {
    public static void wordArray(){
        List<String> newList = new ArrayList<>();

        newList.add("difficulty");
        newList.add("math");
        newList.add("protection");
        newList.add("priority");
        newList.add("football");
        newList.add("math");
        newList.add("consequence");
        newList.add("college");
        newList.add("football");
        newList.add("construction");

        List<String> sortedList = new ArrayList<>();

        for (int i = 0; i < newList.size(); i++){
            if (!sortedList.contains(newList.get(i))){
                sortedList.add(newList.get(i));
            }
        }

        Map<String, Integer> newMap = new HashMap<>();


        for (int i = 0; i < newList.size(); i++){
            int counter = 0;
            for (int j = 0; j < newList.size(); j++){
                if (newList.get(i) == newList.get(j)){
                    counter++;
                }
                newMap.put(newList.get(i), counter);
            }

        }

        System.out.println(sortedList);
        System.out.println(newMap);
    }
}


