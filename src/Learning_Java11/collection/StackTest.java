package Learning_Java11.collection;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack s= new Stack();
        s.push("A");
        s.push("B");
        s.push("C");
        System.out.println(s);

        // C last m add kiya hai pr pehle pop hoga
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.peek()); // it returns top value
        System.out.println(s.search("A"));
        System.out.println(s.search("Z"));
        System.out.println(s.empty());
    }
}
