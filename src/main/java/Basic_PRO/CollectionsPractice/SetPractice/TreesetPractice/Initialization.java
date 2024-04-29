package Basic_PRO.CollectionsPractice.SetPractice.TreesetPractice;

import java.util.SortedSet;
import java.util.TreeSet;

public class Initialization {
    public static void main(String[] args) {
        TreeSet treeSet=new TreeSet<>();
        TreeSet treeSet1=new TreeSet<>(treeSet);
        SortedSet st=new TreeSet();
        TreeSet treeSet2=new TreeSet<>(st);
    }
}
