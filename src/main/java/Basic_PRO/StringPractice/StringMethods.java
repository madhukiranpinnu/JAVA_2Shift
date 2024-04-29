package Basic_PRO.StringPractice;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        String s=new String("Madhukiran");
        for (int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));
        }
        String s1=new String("MadhukiranPinnu");
        System.out.println(s1.substring(0,4));
        System.out.println(s1.contains("Pi"));
        System.out.println(s1.contains("z"));
        String s2=new String("madhukiranpinnu");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        String s3= new String("Madhu kiran pinnu");
        String[] strings=s3.split(" ");
        for (String sl:strings){
            System.out.println(sl);
        }
        String d=new String("madhukiranpinnuhere");
        System.out.println(d.indexOf("e"));
        System.out.println(d.lastIndexOf('e'));
        String so=new String("  LKLK    ");
        System.out.println(so);
        System.out.println(so.trim());
        String sp="MADHU";
        System.out.println(sp);
        System.out.println(sp.toLowerCase());
        System.out.println(sp.toUpperCase());
        System.out.println(sp.startsWith("MA"));
        System.out.println(sp.endsWith("HU"));
        System.out.println(sp);
        String sd=new String("MADHU");
        String sf=sd.replace('A','D');
        System.out.println(sf);
    }
}
