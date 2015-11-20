package stack;

public class Stack <T> {
    
    public static void main(String[] args){
        Stack<Double> stack = new Stack<Double>(5);
        stack.push(10.0);
        stack.push(20.0);
        stack.push(30.0);
        stack.push(40.0);
        
        while(!stack.isEmpty()){
            Double value = stack.pop();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println();
        
    }
    
    private Object[] stackArray;
    private int top;
    
    public Stack(int dataSize){
        stackArray = new Object[dataSize];
        top = -1;
    }
    
    public void push(T a){
        stackArray[++top] = a;
    }
    
    public T pop(){
        return (T)stackArray[top--];
    }
    
    public T peek(){
        return (T)stackArray[top];
    }
    
    public boolean isEmpty(){
        return top==-1;
    }
    
    public boolean isFull(){
        return top==stackArray.length-1;
    }
    
}
