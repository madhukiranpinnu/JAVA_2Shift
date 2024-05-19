package Basic_PRO.TestingQAPrograms;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        //Prime or not
        Scanner sc=new Scanner(System.in);
        int input= sc.nextInt();
        int count=0;
        for(int i=1;i<input;i++){
            if(input%i==0){
               count++;
            }
        }
        System.out.println(count);
        if(count>=2){
            System.out.println(input+"is not prime");
        }
        else {
            System.out.println(input+" is prime ");
        }
    }
}
