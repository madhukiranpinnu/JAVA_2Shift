package Basic_PRO.CollectionsPractice.MapPractice;

import java.util.HashMap;

public class MapMethods {
    public static void main(String[] args) {
        HashMap hm=new HashMap<>();
        hm.put(1,"MadhukiranPinnu");
        hm.put(2,"Sri Ram");
        hm.put(3,"Janaki");
        hm.put(4,"Sri Rama Chandra");
        hm.put(5,"urmila");
        System.out.println(hm);
        HashMap hm1=new HashMap<>(hm);
        System.out.println(hm1);
        HashMap hm2=new HashMap<>();
        hm2.putAll(hm);
        System.out.println(hm2);
        System.out.println(hm2.containsKey(4));
        System.out.println(hm2.containsValue("jk"));
        System.out.println(hm2.get(1));
        System.out.println(hm2.isEmpty());
        System.out.println(hm2.size());
        hm2.clear();
        System.out.println(hm2.size());
        System.out.println(hm1);
        hm1.remove(1);
        System.out.println(hm1);
    }
}
