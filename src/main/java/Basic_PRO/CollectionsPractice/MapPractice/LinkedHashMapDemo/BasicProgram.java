package Basic_PRO.CollectionsPractice.MapPractice.LinkedHashMapDemo;

import java.util.*;

public class BasicProgram {
    public static void main(String[] args) {
        LinkedHashMap lhm=new LinkedHashMap<>();
        lhm.put(1,"madhu");
        lhm.put(2,"kiran");
        lhm.put(3,"pinnu");
        Collection<String> values=lhm.values();
        System.out.println(values);
        Set<Integer> set=lhm.keySet();
        System.out.println(set);
        Set<Map.Entry<Integer,String>> map=lhm.entrySet();
        Iterator iterator=map.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
