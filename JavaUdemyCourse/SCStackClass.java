import java.util.*;

class StackOverFlow extends Exception {
    public String toString(){
        return "Stack is Full!";
    }
}

class StackUnderFlow extends Exception {
    public String toString(){
        return "Stack is Empty!";
    }
}

public class SCStackClass {
    public int[] stack;
    public int top;
    public int size;

    public SCStackClass(int size){
        this.size = size;
        this.top = -1;
        this.stack = new int[size];
    }

    public void push(int i) throws StackOverFlow {
        if(top == stack.length-1){
            throw new StackOverFlow();
        }
        top++;
        stack[top]=i;
        System.out.println("Push -> " + stack[top]);
        System.out.println("Top -> " + top);
        System.out.println("Stack -> " + Arrays.toString(stack));
    }

    public void pop() throws StackUnderFlow {
        if(top == -1){
            throw new StackUnderFlow();
        }
        System.out.println("Pop -> " + stack[top]);
        stack[top] = 0;
        top--;
        System.out.println("Top -> " + top);
        System.out.println("Stack -> " + Arrays.toString(stack));
    }

    public static void main(String[] args) throws Exception {
        try {
            SCStackClass sc1 = new SCStackClass(5);
            sc1.push(1);
            sc1.push(2);
            sc1.push(3);
            sc1.push(4);
            sc1.push(5);
//            sc1.push(6); // StackOverFlow Exception
            sc1.pop();
            sc1.pop();
            sc1.pop();
            sc1.pop();
            sc1.pop();
//            sc1.pop(); // StackUnderFlow Exception
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
