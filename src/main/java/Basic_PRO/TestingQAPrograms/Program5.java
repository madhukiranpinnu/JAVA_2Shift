package Basic_PRO.TestingQAPrograms;

public class Program5 {
    public static void main(String[] args) {
        //Max two values in array
        int[] ints={1,2,4,6,90,87,54,123,67,54,98,99,678,890,897};
        int max1=0;
        int max2=0;
        for(int n:ints){
            if(max1<n){
                max2=max1;
                max1=n;
            }
            else if(max2<n) {
                max2=n;
            }
        }
        System.out.println(max1);
        System.out.println(max2);
    }
}
