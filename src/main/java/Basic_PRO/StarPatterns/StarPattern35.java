package Basic_PRO.StarPatterns;

import java.util.Scanner;

public class StarPattern35 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print("  ");
            }
            for(int j=1;j<i*2;j++){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=n;j>i;j--){
                System.out.print("  ");
            }
            for (int j=1;j<i*2;j++){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
}
