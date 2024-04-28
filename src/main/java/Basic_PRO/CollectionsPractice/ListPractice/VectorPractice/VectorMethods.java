package Basic_PRO.CollectionsPractice.ListPractice.VectorPractice;

import java.util.Vector;

public class VectorMethods {
    public static void main(String[] args) {
        Vector<Integer> v1=new Vector<>();
        for(int i=0;i<=10;i++){
            v1.addElement(i);
        }
        System.out.println(v1);
        System.out.println(v1.firstElement());
        System.out.println(v1.lastElement());
        v1.removeElement(3);
        System.out.println(v1);
        v1.removeElementAt(4);
        System.out.println(v1);
        System.out.println(v1.size());
        System.out.println(v1.capacity());
        v1.removeAllElements();
        System.out.println(v1);
    }
}
