package queue;

import java.util.Arrays;

/**
 * FIFO
 */
public class QueueUsingArray {

    Integer arr[];
    int size;
    int currentSize=0;
    int head=-1;
    int tail=-1;

    QueueUsingArray(int size){
        arr= new Integer[size];
        this.size=size;
    }

    public void queue(Integer data){
        if(isFull()){
            System.out.println("Queue is full");
        }else{
            tail++;
            if(tail==size){
                tail=0;
            }
            arr[tail]=data;
            currentSize++;
        }
    }

    public Integer dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }else{
            head++;
            if(head==size){
                head=0;
            }
            currentSize--;
            int element = arr[head];
            arr[head]=null;
            return element;
        }
    }

    public boolean isEmpty(){
        return currentSize<=0;
    }

    public boolean isFull(){
        return currentSize>size;
    }

    public  void display(){
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        QueueUsingArray queueUsingArray = new QueueUsingArray(5);
        queueUsingArray.queue(1);
        queueUsingArray.display();
        queueUsingArray.queue(2);
        queueUsingArray.display();
        queueUsingArray.queue(3);
        queueUsingArray.display();
        queueUsingArray.queue(4);
        queueUsingArray.display();
        queueUsingArray.queue(5);
        queueUsingArray.display();
        queueUsingArray.dequeue();
        queueUsingArray.display();
        queueUsingArray.queue(7);
        queueUsingArray.display();

    }
}
