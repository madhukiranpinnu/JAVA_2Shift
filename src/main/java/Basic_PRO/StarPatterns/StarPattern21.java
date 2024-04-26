package Basic_PRO.StarPatterns;

import java.util.Scanner;

public class StarPattern21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int k=1;
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n-1;j++){
                System.out.print("  ");
            }
            for (int j=1;j<=k;j++){
                System.out.print("* ");
            }
            k+=2;
            System.out.println();
        }
    }
}
