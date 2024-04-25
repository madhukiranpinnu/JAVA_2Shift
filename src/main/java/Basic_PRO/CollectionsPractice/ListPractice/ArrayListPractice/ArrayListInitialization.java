package Basic_PRO.CollectionsPractice.ListPractice.ArrayListPractice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListInitialization {
    public static void main(String[] args) {
        //List initialization
        //initial capacity is 10
        List lis=new ArrayList();
        lis.add(20);
        lis.add(21);
        lis.add(1);
        lis.add(23);
        lis.add(45);
        lis.add(56);
        lis.add(345);
        System.out.println(lis);
        //List with specific initial capacity
        List list=new ArrayList<>(34);
        //List with another list as argument
        List list1=new ArrayList<>(list);
    }
}
