package Basic_PRO.CollectionsPractice.SetPractice.Hashsetpractice;

import java.util.HashSet;

public class HashSetInitialization {
    public static void main(String[] args) {
        HashSet hs=new HashSet<>();
        HashSet hs1=new HashSet<>(hs);
        HashSet hs2=new HashSet<>(20);
        HashSet hs3=new HashSet<>(20,0.76f);
    }
}
