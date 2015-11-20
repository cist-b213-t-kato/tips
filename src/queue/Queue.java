package queue;

public class Queue <T> {

    public static void main(String[] args){
        Queue<Double> que = new Queue<Double>(10);

        que.insert(10.0);
        que.insert(20.0);
        que.insert(30.0);
        que.insert(40.0);
        while(!que.isEmpty()){
            Double value = que.remove();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println();

    }

    private Object[] stackArray;
    private int front = 0;
    private int rear = -1;
    private int number = 0;

    public Queue(int dataSize){
        stackArray = new Object[dataSize];
    }

    public void insert(T a){
        stackArray[++rear] = a;
        number++;
    }

    public T remove(){
        T temp = (T)stackArray[front++];
        number--;
        return temp;
    }

    public T peek(){
        return (T)stackArray[front];
    }

    public boolean isEmpty(){
        return number==0;
    }

    public boolean isFull(){
        return number==stackArray.length;
    }
}
