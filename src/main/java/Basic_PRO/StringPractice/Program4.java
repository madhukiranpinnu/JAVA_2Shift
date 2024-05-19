package Basic_PRO.StringPractice;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.next();
        int  strlength=str.length();
        String s;
        if(strlength%2==0){
            s = rev(str.substring(0, str.length() / 2)) + str.charAt(str.length() / 2) + rev(str.substring(str.length() / 2 + 1));
        }
        else {
            s= rev(str.substring(0,str.length()/2))+str.charAt(str.length()/2)+rev(str.substring(str.length()/2+1));
        }
        System.out.println(s);
    }
    public static String rev(String reverse){
       int revlength=reverse.length();
       String rever = "";
       for(int i= revlength-1;i>=0;i--){
           rever=rever+reverse.charAt(i);
       }
       return rever;
    }
}
