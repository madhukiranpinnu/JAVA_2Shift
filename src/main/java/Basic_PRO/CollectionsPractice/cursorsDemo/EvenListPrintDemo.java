package Basic_PRO.CollectionsPractice.cursorsDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class EvenListPrintDemo {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        ListIterator<Integer> listIterator=list.listIterator();
        while (listIterator.hasNext()){
            int a=listIterator.next();
            if(a%2==0){
               listIterator.set(a);
            }
            else{
                listIterator.remove();
            }
        }
        System.out.println(list);
    }
}
