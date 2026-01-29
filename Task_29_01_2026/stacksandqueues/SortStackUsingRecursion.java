package stacksandqueues;

import java.util.Stack;

public class SortStackUsingRecursion {
    public static void sortStack(Stack<Integer> stack)
    {
        if(stack.isEmpty())
        {
            return;
        }

        int top=stack.pop();

        sortStack(stack);
        insert(stack,top);
    }
    public static void insert(Stack<Integer>stack,int top)
    {
        if(stack.isEmpty()||stack.peek()<=top)
        {
            stack.push(top);
            return;
        }

        int front=stack.pop();
        insert(stack,front);
        stack.push(front);
    }
}
