package Basic_PRO.CollectionsPractice.MapPractice.LinkedHashMapDemo;

import java.util.LinkedHashMap;
import java.util.List;

public class Constructors {
    public static void main(String[] args) {
        LinkedHashMap<String,String> linkedHashMap=new LinkedHashMap<>();
        LinkedHashMap<String,String> lhm=new LinkedHashMap<>(linkedHashMap);
        LinkedHashMap lhm1=new LinkedHashMap<>(30);
        LinkedHashMap linkedHashMap1=new LinkedHashMap<>(45,0.89f);
    }
}
