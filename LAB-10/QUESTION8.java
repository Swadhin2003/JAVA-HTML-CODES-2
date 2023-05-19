class StackFullException extends Exception 
{
    public StackFullException() 
    {
        super("Stack is full!");
    }
}
class StackEmptyException extends Exception 
{
    public StackEmptyException() 
    {
        super("Stack is empty!");
    }
}
class Stack 
{
    private int[] arr;
    private int top;
    private int maxSize;
    public Stack(int size) 
    {
        arr = new int[size];
        maxSize = size;
        top = -1;
    }
    public void push(int val) throws StackFullException 
    {
        if (top == maxSize - 1) 
        {
            throw new StackFullException();
        } 
        else 
        {
            arr[++top] = val;
        }
    }
    public int pop() throws StackEmptyException 
    {
        if (top == -1) 
        {
            throw new StackEmptyException();
        } 
        else 
        {
            return arr[top--];
        }
    }
}
public class QUESTION8 
{
    public static void main(String[] args) 
    {
        Stack stack = new Stack(10);
        try 
        {
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4);
            stack.push(5);
            stack.push(6);
            stack.push(7);
            stack.push(8);
            stack.push(9);
            stack.push(10);
            stack.push(11); 
        } 
        catch (StackFullException e) 
        {
            System.out.println(e.getMessage()); 
        }
        try 
        {
            while (true) 
            {
                System.out.println(stack.pop());
            }
        } 
        catch (StackEmptyException e) 
        {
            System.out.println(e.getMessage()); 
        }
    }
}
