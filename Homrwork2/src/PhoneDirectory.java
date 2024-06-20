import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class PhoneDirectory {
    Map<String, HashSet<String>> namesPhones = new HashMap<>();

    public void add(String name, String phone){

        if(!namesPhones.containsKey(name)) {
            namesPhones.put(name, new HashSet<>());
        }
        namesPhones.get(name).add(phone);
    }

    public void get(String name){

        if(!namesPhones.containsKey(name)){
            return;
        }

        HashSet<String> currentPhones = namesPhones.get(name);

        for (String element: currentPhones){
            System.out.println(element);
        }


    }

}

