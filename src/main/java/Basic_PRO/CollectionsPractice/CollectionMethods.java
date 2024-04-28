package Basic_PRO.CollectionsPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class CollectionMethods {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        //Checks whether the collection is empty or not
        System.out.println(al.isEmpty());
        al.add(1);
        System.out.println(al.isEmpty());
        for(int i=0;i<=10;i++){
            al.add(i);
        }
        ArrayList<Integer> al2=new ArrayList<>();
        //adds all the elements to the other list
        al2.addAll(al);
        System.out.println(al);
        System.out.println(al2);
        ArrayList alp1=new ArrayList<>();
        alp1.add(1);
        alp1.add(2);
        alp1.add(3);
        alp1.add(4);
        alp1.add(5);
        ArrayList alp2=new ArrayList<>();
        alp2.add(6);
        alp2.add(7);
        alp2.add(8);
        alp2.add(9);
        alp2.add(10);
        alp2.add(1);
        alp2.removeAll(alp1);
        System.out.println(alp2);
        ArrayList at1=new ArrayList<>();
        at1.add(1);
        at1.add(2);
        at1.add(3);
        at1.add(4);
        at1.add(5);
        ArrayList at2=new ArrayList<>();
        at2.add(6);
        at2.add(7);
        at2.add(8);
        at2.add(9);
        at2.add(10);
        at2.add(1);
        at2.retainAll(at1);
        System.out.println(at2);
        ArrayList a=new ArrayList<>();
        for (int i=0;i<=10;i++){
            a.add(i);
        }
        Iterator<Integer> it=a.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        ArrayList m=new ArrayList<>();
        m.add(1);
        m.add(2);
        m.add(3);
        System.out.println(m.contains(1));
        ArrayList n=new ArrayList<>();
        n.add(1);
        n.add(2);
        n.add(3);
        System.out.println(n.equals(m));
        ArrayList k=new ArrayList<>();
        k.add(1);
        k.add(2);
        System.out.println(m.containsAll(k));
        System.out.println(m.size());
        System.out.println(m.hashCode());
        System.out.println(m.size());
        m.clear();
        System.out.println(m.size());
        Object[] no= n.toArray();
        System.out.println(no.length);
    }
}
