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

public class SCStackClass<T> {
    public T[] stack;
    public int top;
    public int size;

    public SCStackClass(int size){
        this.size = size;
        this.top = -1;
        this.stack = (T[]) new Object[size];
    }

    public void push(T i) throws StackOverFlow {
        if(top == stack.length-1){
            throw new StackOverFlow();
        }
        stack[++top]=i;
        System.out.println("Push -> " + stack[top]);
        System.out.println("Top -> " + top);
        System.out.println("Stack -> " + Arrays.toString(stack));
    }

    public static void main(String[] args) throws Exception {
        try {
            SCStackClass sc1 = new SCStackClass(1);
//            sc1.stkPop();
            sc1.push(1);
            sc1.push(2);

        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
