package Basic_PRO.TestingQAPrograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program12 {
    public static void main(String[] args) {
        //Remove duplicates in a string
        String str=new String("java java JAVA java");
        char[] chr=str.toCharArray();
        Set<Character> set=new LinkedHashSet<>();
        for (char ch:chr){
            set.add(ch);
        }
        int i=0;
        char[] chl = new char[set.size()];
        for (char cl:set){
            chl[i]=cl;
            i++;
        }
        String string=new String(chl);
        System.out.println(string);
    }
}
