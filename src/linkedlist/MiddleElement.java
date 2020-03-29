package linkedlist;

import common.Node;

/**
 * 
 */
public class MiddleElement extends  SinglyLinkList{

    /**
     * This method will return the middle element
     * @return
     */
    public Node middleElement(){
        Node fast = root;
        Node slow = root;
        while (fast.getNext()!=null && fast.getNext().getNext()!=null){
            fast = fast.getNext().getNext();
            slow = slow.getNext();
        }
        return slow;
    }

}
