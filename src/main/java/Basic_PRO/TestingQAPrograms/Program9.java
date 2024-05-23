package Basic_PRO.TestingQAPrograms;

import java.util.HashMap;
import java.util.Map;

public class Program9 {
    public static void main(String[] args) {
        //To get the char occurance in a string
        String str="madhukiran";
        Map<Character,Integer> map=new HashMap<>();
        char[] chr=str.toCharArray();
        for(char ch:chr){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else {
                map.put(ch,1);
            }
        }
        System.out.println(map);
    }
}
