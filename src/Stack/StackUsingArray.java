package Stack;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Implement Stack using array
 * Stack : LIFO
 */
public class StackUsingArray {
    int size;
    int arr[];
    int top;

    StackUsingArray(int size){
        this.size = size;
        arr = new int[size];
        Arrays.fill(arr,-1);//This done so that all empty are referred as -1
        top=-1;
    }
    //Will Add the elements
    public void push(int data){
        if(isFull()) {System.out.println("Stack is full");return;}
        top++;
        arr[top] =  data;
        System.out.println("Element is pushed");
    }

    //Will remove the element and return
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");return -1;}
        int element = arr[top];
        arr[top]=-1;
        top--;
        System.out.println("Element is removed");
        return element;
    }

    //true if stack is empty
    public boolean isEmpty(){
        return top<0;
    }

    //true is stack is full
    public boolean isFull(){
        return top>=size;
    }

    //return element w/o removing
    public int peek(){
        return arr[top];
    }

    public void display(){
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        StackUsingArray stack =  new StackUsingArray(5);
        stack.push(1);
        stack.display();
        stack.push(2);
        stack.push(3);
        stack.display();
        stack.pop();
        stack.display();
    }
}
