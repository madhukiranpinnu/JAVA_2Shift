package Basic_PRO.CollectionsPractice.cursorsDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        ListIterator<Integer> listIterator=list.listIterator();
        while (listIterator.hasNext()){
            System.out.println("Element: "+listIterator.next());
            System.out.println("Next index: "+listIterator.nextIndex());
        }
        while (listIterator.hasPrevious()){
            System.out.println("Element: "+listIterator.previous());
            System.out.println("Previous index : "+listIterator.previousIndex());
        }
    }
}
