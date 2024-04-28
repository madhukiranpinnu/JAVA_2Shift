package Basic_PRO.CollectionsPractice.ListPractice.LinkedListPractice;

import java.util.LinkedList;

public class LinkedListMethods {
    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<>();
        l1.addFirst(1);
        System.out.println(l1);
        l1.addFirst(2);
        System.out.println(l1);
        l1.addLast(3);
        l1.addLast(4);
        System.out.println(l1);
        System.out.println(l1.getFirst());
        System.out.println(l1.getLast());
        l1.removeFirst();
        System.out.println(l1);
        l1.removeLast();
        System.out.println(l1);
    }
}
