package Basic_PRO.CollectionsPractice.SetPractice.SortedsetPractice;

import java.util.SortedSet;
import java.util.TreeSet;

public class Examples {
    public static void main(String[] args) {
        SortedSet s1=new TreeSet();
        s1.add(1);
        s1.add(4);
        s1.add(0);
        s1.add(45);
        s1.add(23);
        s1.add(5);
        s1.add(21);
        System.out.println(s1);
        System.out.println(s1.first());
        System.out.println(s1.last());
        System.out.println(s1.tailSet(23));
        System.out.println(s1.headSet(23));
    }
}
