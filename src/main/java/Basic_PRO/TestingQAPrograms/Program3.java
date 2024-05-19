package Basic_PRO.TestingQAPrograms;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        //Reverse the number
        Scanner sc=new Scanner(System.in);
        int input= sc.nextInt();
        int rev=0;
        while(input%10!=0){
           rev=rev*10+input%10;
           input=input/10;
        }
        System.out.println(rev);
    }
}
