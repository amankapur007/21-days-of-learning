package Stack;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Queue FIFO
 * So LIFO is required
 */
public class StackUsingQueues {
    Queue<Integer> queue1 = new LinkedList();
    Queue<Integer> queue2 = new LinkedList();

    public void push(Integer data){
        //If Queue is empty then push to Q1, else copy all to Q2 (while removing from q1)
        //add current data to q1 , copy all from q2 to q1(removing from q2)
        if(queue1.size()==0){
            queue1.add(data);
        }else{
            int size = queue1.size();
            for(int i=0;i<size;i++){
                queue2.add(queue1.remove());
            }
            queue1.add(data);
            for(int i=0;i<size;i++){
                queue1.add(queue2.remove());
            }
        }
        System.out.println("Data pushed");
        System.out.println(Arrays.toString(queue1.toArray()));
    }

    public  void pop(){
        System.out.println("Data removed :: "+queue1.remove());
    }

    public static void main(String[] args) {
        StackUsingQueues stackUsingQueues = new StackUsingQueues();
        stackUsingQueues.push(1);
        stackUsingQueues.push(2);
        stackUsingQueues.push(3);
        stackUsingQueues.pop();
        stackUsingQueues.push(4);
        stackUsingQueues.pop();
    }
}
