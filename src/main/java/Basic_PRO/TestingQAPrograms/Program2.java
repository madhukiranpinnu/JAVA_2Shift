package Basic_PRO.TestingQAPrograms;

import java.util.Arrays;

public class Program2 {
    public static void main(String[] args) {
        //Sort the List of Strings
        String[] strs={"madhu","kiran","pinnu","sree","Ram","Janaki"};
        Arrays.sort(strs);
        Arrays.sort(strs,String.CASE_INSENSITIVE_ORDER);
        for(String str:strs){
            System.out.println(str);
        }
    }
}
