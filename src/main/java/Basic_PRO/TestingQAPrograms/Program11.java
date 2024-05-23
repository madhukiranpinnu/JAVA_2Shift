package Basic_PRO.TestingQAPrograms;

public class Program11 {
    public static void main(String[] args) {
        //sum of numerical values in string
        String so=new String("MK45IO9LO81PO01P7");
        char[] ch=so.toCharArray();
        int count=0;
        for (char c:ch){
            if((int)c<=57 && (int)c>=48){
                count=count+Character.getNumericValue(c);
            }
        }
        System.out.println(count);
    }
}
