package linkedlist;

import common.Node;

public class NthElement extends  SinglyLinkList{
    /**
     * This method will send the node of the n th position where nstarting fromlast refers to 0
     * @param position
     * @return
     */
    public Node elementFromLast(int position){
        Node fast = root;
        Node slow = root;
        for(int i =0;i<position;i++){
            fast = fast.getNext();
        }

        while (fast.getNext()!=null){
            fast = fast.getNext();
            slow = slow.getNext();
        }
        return slow;
    }

}
