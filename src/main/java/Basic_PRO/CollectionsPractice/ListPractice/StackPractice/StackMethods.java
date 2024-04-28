package Basic_PRO.CollectionsPractice.ListPractice.StackPractice;

import java.util.Stack;

public class StackMethods {
    public static void main(String[] args) {
        Stack s=new Stack<>();
        s.push(1);
        for(int i=0;i<=10;i++){
            s.push(i);
        }
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s);
        s.pop();
        System.out.println(s);
        System.out.println(s.get(4));
        System.out.println(s.search(9));
    }
}
