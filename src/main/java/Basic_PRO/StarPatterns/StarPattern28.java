package Basic_PRO.StarPatterns;

import java.util.Scanner;

public class StarPattern28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for (int i=n;i>=1;i--){
            for(int j=n;j>i;j--){
                System.out.print("  ");
            }
            for (int j=i*2-1;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
