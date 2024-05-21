package Basic_PRO.CollectionsPractice.cursorsDemo;

import java.util.Enumeration;
import java.util.Vector;

public class EnumeratorDemo {
    public static void main(String[] args) {
        Vector  v=new Vector<>();
        v.add(1);
        v.addElement(2);
        v.add(3);
        Enumeration enumeration=v.elements();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
    }
}
