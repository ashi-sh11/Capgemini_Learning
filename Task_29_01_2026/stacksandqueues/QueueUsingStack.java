package stacksandqueues;

import java.util.Stack;

public class QueueUsingStack {
    private Stack<Integer> inStack;
    private Stack<Integer>outStack;

    QueueUsingStack(){
        inStack=new Stack<>();
        outStack=new Stack<>();
    }

    public void enqueue(int num)
    {
        inStack.add(num);
    }
    public int dequeue()
    {
        if(outStack.isEmpty())
        {
            while(!inStack.isEmpty())
            {
                outStack.add(inStack.pop());
            }
        }
        if(outStack.isEmpty())
        {
            System.out.println("Queue is Empty");
            return -1;
        }
        int topEle=outStack.peek();
        outStack.pop();
        return topEle;
    }
    static void main() {

    }
}
