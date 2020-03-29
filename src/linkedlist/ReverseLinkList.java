package linkedlist;

import common.Node;

public class ReverseLinkList  extends  SinglyLinkList{

    /**
     * Reverse the list
     */
    public  void reverse(){
        root = reverseList(root);
    }

    /**
     * @param node
     * @return
     */
    private Node reverseList(Node node) {
        if (node == null || node.getNext() == null) {
            return node;
        }
        Node rem = reverseList(node.getNext());
        node.getNext().setNext(node);
        node.setNext(null);
        return rem;
    }
}
