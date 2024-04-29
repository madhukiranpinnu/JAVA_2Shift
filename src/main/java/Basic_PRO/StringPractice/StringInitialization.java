package Basic_PRO.StringPractice;

public class StringInitialization {
    public static void main(String[] args) {
        //When we create a string with the same string literal it will map the same reeference to the old if created
        String s1="Hello";
        String s2="Hello";
        System.out.println(s1==s2);
        //when we create a string with new keyword each time it will create new reference to the object
        String s3=new String("Madhu");
        String s4=new String("Madhu");
        System.out.println(s3==s4);
        // with Concatenation
        String s5="Hello"+"Madhu!";
        System.out.println(s5);
        //With StringBuilder
        StringBuilder sb=new StringBuilder("Madhukiran");
        String s6=sb.toString();
        System.out.println(s6);
        //string format
        String f="Mkpinnu";
        String s7=String.format("Hello, %s",f);
        System.out.println(s7);
        //char array
        char[] ch={'m','a','d','h','u'};
        String s8=new String(ch);
        System.out.println(s8);
        //byte array
        byte[] bk={106,107,89};
        String s9=new String(bk);
        System.out.println(s9);
        int i=1090;
        //value of
        String s10=String.valueOf(i);
        System.out.println(s10);
    }
}
