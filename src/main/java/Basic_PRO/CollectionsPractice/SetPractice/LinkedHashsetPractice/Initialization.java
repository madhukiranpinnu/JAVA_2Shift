package Basic_PRO.CollectionsPractice.SetPractice.LinkedHashsetPractice;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Initialization {
    public static void main(String[] args) {
        LinkedHashSet lhs=new LinkedHashSet<>();
        LinkedHashSet lhs1=new LinkedHashSet<>(lhs);
        LinkedHashSet lhs2=new LinkedHashSet<>(20);
        LinkedHashSet lhs3=new LinkedHashSet<>(20,0.65f);
    }
}
