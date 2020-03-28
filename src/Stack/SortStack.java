package Stack;

public class SortStack {
    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray(4);
        stack.push(10);
        stack.push(40);
        stack.push(20);
        stack.push(30);
        StackUsingArray tempStack = new StackUsingArray(4);
        while (!stack.isEmpty()){
            int currentData = stack.pop();
            while (!tempStack.isEmpty() && tempStack.peek()>currentData){
                stack.push(tempStack.pop());
            }
            tempStack.push(currentData);
        }
        tempStack.display();
    }
}
