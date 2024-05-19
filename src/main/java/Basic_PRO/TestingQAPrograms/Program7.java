package Basic_PRO.TestingQAPrograms;

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        //polindrome or not
        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();
        int main=number;
        int rev = 0;
        while (number%10!=0){
            rev=rev*10+number%10;
            number=number/10;
        }
        if(rev == main){
            System.out.println("Polindrome");
        }
        else {
            System.out.println("Not Polindrome");
        }
    }
}
