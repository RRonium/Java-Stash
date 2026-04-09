import java.util.*;
class StackArray
{
    int maxS;
    int arr[], revarr[];
    int top,i;    
    public StackArray(int size) 
    {
        maxS = size;
        arr = new int[maxS];
        revarr = new int[maxS];
        top = -1;
        i=-1;
    }    
    public void push(int value)
    {
        if (top<maxS-1) 
        {
            arr[++top]=value;
            System.out.println("Pushed " + value + " onto the stack");
        }
        else 
        {
            System.out.println("Stack is full. Cannot push " + value);
        }
    }    
    public int pop()
    {
        i++;
        int pV;
        if (top >= 0)
        {
            pV = arr[top--];
            System.out.println("Popped " + pV + " from the stack");
            revarr[i]=pV;
            return pV;
        } else 
        {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; 
        }               
    }    
    public boolean isEmpty() 
    {
        return (top==-1);
    }    
    public boolean isFull() 
    {
        return (top==maxS-1);
    }    
    public int peek() 
    {
        if (!isEmpty()) 
        {
            return arr[top];
        } 
        else
        {
            System.out.println("Stack is empty. No elements to peek.");
            return -1; 
        }
    }
    public void disp()
    {
        for(int i=0; i<maxS;i++)
        {
            System.out.println(revarr[i]+", ");
        }
    }    
}
public class Main {
    public static void main(String[] args) 
    {
        StackArray stack = new StackArray(5); 
        stack.push(10); 
        stack.push(20); 
        stack.push(30); 
        System.out.println("Top element of the stack: " + stack.peek());
        stack.pop();
        System.out.println("empty? " + stack.isEmpty()); 
        System.out.println("full? " + stack.isFull());
        stack.pop(); 
        stack.pop(); 
        stack.disp();
        stack.pop(); 
        System.out.println("Is stack empty? " + stack.isEmpty()); 
        
    }
}
