import java.util.HashMap;
import java.util.Map;

public class PhoneDirectory {
    Map<String, String> namesPhones = new HashMap<>();

    public void add(String name, String phone){

        namesPhones.put(phone, name);

    }

    public void get(String name){

        namesPhones.get(name);


        namesPhones.put("name", "903948120934890");
        namesPhones.put("lame", "903948120934890");
        namesPhones.put("Gun", "903948120934890");
        namesPhones.put("Gun", "89202989299");
        System.out.println( namesPhones.get(name));

    }

}
