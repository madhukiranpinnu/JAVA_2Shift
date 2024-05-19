package Basic_PRO.TestingQAPrograms;

import java.util.*;

public class Program1 {
    public static void main(String[] args) {
        //duplicates from Array
        Scanner scanner=new Scanner(System.in);
        int[] art={11,12,1,2,3,4,5,6,7,8,9,10,1,2,3,5,4};
        ArrayList<Integer> arrayList=new ArrayList<>();
        for(int i:art){
            arrayList.add(i);
        }
        System.out.println(arrayList);
        Set<Integer> set=new HashSet<>(arrayList);
        System.out.println(set);
        SortedSet<Integer> SortedSet=new TreeSet<>(set);
        System.out.println(SortedSet);
    }
}
