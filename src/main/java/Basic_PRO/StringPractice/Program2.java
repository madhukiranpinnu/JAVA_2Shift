package Basic_PRO.StringPractice;

import java.util.Scanner;

public class Program2 {
    // reverese each word in a string
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] words=str.split(" ");
        String revword="";
        for(String word:words){
            String rev="";
            for(int i=word.length()-1;i>=0;i--){
              rev=rev+word.charAt(i);
            }
            revword=revword+" "+rev;
        }
        System.out.println(revword);
    }
}
