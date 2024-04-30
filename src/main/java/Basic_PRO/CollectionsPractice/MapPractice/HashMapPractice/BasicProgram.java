package Basic_PRO.CollectionsPractice.MapPractice.HashMapPractice;

import javax.swing.text.html.parser.Entity;
import java.util.*;

public class BasicProgram {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1,"mkpinnu");
        hm.put(2,"Janaki Ramudu");
        hm.put(3,"seetha ram");
        hm.put(4,"lava kusa");
        hm.put(5,"sanatanam");
        System.out.println(hm);
        Collection<String> values=hm.values();
        System.out.println(values);
        Set<Integer> hashSet=hm.keySet();
        System.out.println(hashSet);
        Set<Map.Entry<Integer,String>> entries=hm.entrySet();
        Iterator<Map.Entry<Integer,String>> entryIterator=entries.iterator();
        while (entryIterator.hasNext()){
            Map.Entry<Integer,String> entrySet=entryIterator.next();
            System.out.println(entrySet.getKey()+"-----------"+entrySet.getValue());
        }
    }
}
