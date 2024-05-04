package Basic_PRO.StringPractice;

import java.util.Scanner;

public class Program3 {
    //Insert a string inside the other string
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String  mainStr=sc.nextLine();
        String sub= sc.next();
        int inside= sc.nextInt();
        String art=mainStr.substring(0,inside)+sub+mainStr.substring(inside+1);
        System.out.println(art);
    }
}
