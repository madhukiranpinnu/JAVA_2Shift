package Basic_PRO.StarPatterns;

import java.util.Scanner;

public class StarPattern73 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            for (int j=1;j<i;j++){
                System.out.print("  ");
            }
            for (int j=n;j>=i;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for (int i=1;i<=n;i++){
            for (int j=n;j>i;j--){
                System.out.print("  ");
            }
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
