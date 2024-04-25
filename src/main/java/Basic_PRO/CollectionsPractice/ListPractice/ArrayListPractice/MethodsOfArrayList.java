package Basic_PRO.CollectionsPractice.ListPractice.ArrayListPractice;

import java.util.ArrayList;

public class MethodsOfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        for (int i=0;i<=10;i++){
            //add method is used to add the elements to the arraylist
            al.add(i);
        }
        System.out.println(al);
        ArrayList<Integer> al2=new ArrayList<>();
        //Method to add all elements of one arraylist to another list
        al2.addAll(al);
        System.out.println(al2);
        //method to get element of list based on the index
        System.out.println(al2.get(2));
        //Method to set the element at a particular index
        //it will replaces the old value
        al2.set(3,123);
        System.out.println(al2);
        //Remove a element based on index
        al2.remove(2);
        System.out.println(al2);
        // to find index of first from left  to right
        ArrayList al3=new ArrayList<>();
        al3.add(1);
        al3.add(2);
        al3.add(4);
        al3.add(5);
        al3.add(4);
        al3.add(6);
        al3.add(4);
        System.out.println(al3);
        System.out.println("Index of 4: "+al3.indexOf(4));
        System.out.println("Last index of 4 :"+al3.lastIndexOf(4));

    }
}
