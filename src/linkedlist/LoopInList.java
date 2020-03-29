package linkedlist;

import common.Node;

public class LoopInList extends SinglyLinkList {

    /**
     * Insert node in the last
     *
     * @param node
     */
    public void insertNodeToLast(Node node) {
        if (root == null) {
            root = node;
            return;
        }
        Node temp = root;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(node);
    }

    /**
     * This method is used to find whether there is an loop
     *
     * @return
     */
    public boolean detectTheLoop() {
        Node firstPtr = root;
        Node secondPtr = root;
        while (firstPtr.getNext() != null && firstPtr.getNext().getNext() != null) {
            firstPtr = firstPtr.getNext().getNext();
            secondPtr = secondPtr.getNext();
            if (firstPtr == secondPtr) {
                return true;
            }
        }
        return false;
    }


    public void startNodeOfTheLoop(){
        boolean loopExists = false;
        Node firstPtr = root;
        Node secondPtr = root;
        while (firstPtr.getNext() != null && firstPtr.getNext().getNext() != null) {
            firstPtr = firstPtr.getNext().getNext();
            secondPtr = secondPtr.getNext();
            if (firstPtr == secondPtr) {
                loopExists= true;
                break;
            }
        }

        if(loopExists){
            secondPtr = root;
            while (firstPtr!=secondPtr){
                firstPtr=firstPtr.getNext();
                secondPtr=secondPtr.getNext();
            }
            System.out.println(
                    "Starting Node : "+secondPtr
            );
        }else{
            System.out.println("No Loop Exist");
        }
    }
}
