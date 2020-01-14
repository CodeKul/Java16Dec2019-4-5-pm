package collectionandmap;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {
        Map<String,Object> company=new HashMap<>();
        company.put("name","codekul");

        Map<String,Object> map=new HashMap<>();
        map.put("name","abcd");
        map.put("age","4");
        map.put("address","kothrud depot");
        map.put("city","pune");
        map.put("company",company);

        System.out.println(map);

    }

}
