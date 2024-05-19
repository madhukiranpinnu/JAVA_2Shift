package Basic_PRO.TestingQAPrograms;

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        //Swap without temporary variables
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
    }
}
