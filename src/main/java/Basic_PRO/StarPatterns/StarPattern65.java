package Basic_PRO.StarPatterns;

import java.util.Scanner;

public class StarPattern65 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            for (int j=n;j>=i;j--){
                System.out.print("  ");
            }
            for (int j=1;j<=2*i-1;j++){
                if(j==1||j==2*i-1){
                    System.out.print((char)(j+64)+" ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i=n;i>=1;i--){
            for (int j=n;j>=i;j--){
                System.out.print("  ");
            }
            for (int j=1;j<=2*i-1;j++){
                if(j==1||j==2*i-1){
                    System.out.print((char)(j+64)+" ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}