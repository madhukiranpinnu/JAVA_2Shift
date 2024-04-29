package Basic_PRO.CollectionsPractice.SetPractice.Hashsetpractice;

import java.util.HashSet;
import java.util.Objects;

public class Examples
{
    public static void main(String[] args) {
        HashSet<Object> hs=new HashSet<>();
        hs.add(1);
        hs.add("Madhukiran");
        System.out.println(hs.add(1));
        System.out.println(hs);
    }
}
