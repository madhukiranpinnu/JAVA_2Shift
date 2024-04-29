package Basic_PRO.CollectionsPractice.SetPractice.TreesetPractice;

import com.sun.source.tree.Tree;

import java.util.TreeSet;

public class TreeSetMethods {
    public static void main(String[] args) {
        TreeSet treeSet=new TreeSet<>();
        treeSet.add(1);
        treeSet.add(2);
        System.out.println(treeSet);
       // treeSet.add("madhu"); heterogenous insertion not allowed
       // treeSet.add(null); null insertion not possible
        treeSet.add(1);
        System.out.println(treeSet);
    }
}
