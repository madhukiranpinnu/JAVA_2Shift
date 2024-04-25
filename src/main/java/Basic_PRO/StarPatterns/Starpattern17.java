package Basic_PRO.StarPatterns;

import java.util.Scanner;

public class Starpattern17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=n;i>0;i--){
            for (int j=n;j>i;j--){
                System.out.print("  ");
            }
            for (int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
