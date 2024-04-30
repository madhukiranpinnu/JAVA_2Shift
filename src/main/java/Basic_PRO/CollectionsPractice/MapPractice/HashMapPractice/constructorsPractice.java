package Basic_PRO.CollectionsPractice.MapPractice.HashMapPractice;

import java.util.HashMap;

public class constructorsPractice {
    public static void main(String[] args) {
        HashMap<Integer,String> hm1=new HashMap<>();
        HashMap<Integer,String> hm2=new HashMap<>(34);
        HashMap<Integer,String> hm3=new HashMap<>(34,0.87f);
        HashMap<Integer,String> hm4=new HashMap<>(hm1);
    }
}
