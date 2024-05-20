package Basic_PRO.TestingQAPrograms;

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
      //ArmStrong Number
        Scanner sc=new Scanner(System.in);
        int input= sc.nextInt();
        int te=input;
        int rev=0;
        while (input%10!=0){
            int temp=input%10;
            rev=rev+temp*temp*temp;
            input=input/10;
        }
        if(rev==te){
            System.out.println("armstrong number");
        }
        else {
            System.out.println("Not Armstrong");
        }
    }
}
