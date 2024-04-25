package Basic_PRO.CollectionsPractice;

import java.util.ArrayList;

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
    }
}
