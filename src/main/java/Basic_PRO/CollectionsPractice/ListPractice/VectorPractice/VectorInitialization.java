package Basic_PRO.CollectionsPractice.ListPractice.VectorPractice;

import java.util.Vector;

public class VectorInitialization {
    public static void main(String[] args) {
        Vector<Integer> v1=new Vector<>();
        v1.addElement(1);
        System.out.println(v1);
        Vector<Integer> v2=new Vector<>(v1);
        System.out.println(v2);
        Vector<Integer> v3=new Vector<>(10);
        for(int i=0;i<=9;i++){
            v3.addElement(i);
        }
        System.out.println(v3);
        System.out.println(v3.capacity());
        Vector<Integer> v4=new Vector<>(10,35);
        for(int i=0;i<=19;i++){
            v4.addElement(i);
        }
        System.out.println(v4);
        System.out.println(v4.capacity());

    }
}
