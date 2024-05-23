package Basic_PRO.TestingQAPrograms;

import java.util.LinkedList;
import java.util.List;

public class Program14 {
    public static void main(String[] args) {
        String str="MK123TY56abc";
        char []ab=str.toCharArray();
        List<Character> list=new LinkedList<>();
        for(char ch:ab){
            if(!((int)ch>=48 && (int)ch<=57)){
                list.add(ch);
            }
        }
        char []output= new char[list.size()];
        int i=0;
        for (Character c:list){
            output[i]=c;
            i++;
        }
        String out=new String(output);
        System.out.println(out);
    }
}
