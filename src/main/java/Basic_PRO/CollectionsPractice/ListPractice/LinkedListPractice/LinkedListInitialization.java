package Basic_PRO.CollectionsPractice.ListPractice.LinkedListPractice;

import java.util.LinkedList;

public class LinkedListInitialization {
    public static void main(String[] args) {
        LinkedList l1=new LinkedList<>();
        l1.add(1);
        l1.add(2);
        System.out.println(l1);
        LinkedList l2=new LinkedList<>(l1);
        System.out.println(l2);
    }
}
