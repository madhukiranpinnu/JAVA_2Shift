package Basic_PRO.StringPractice;

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char[] chars=sc.next().toCharArray();
        String rev="";
        for (int i=chars.length-1;i>=0;i--){
            rev=rev+chars[i];
        }
        System.out.println(rev);
    }
}
