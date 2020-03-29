package linkedlist;

import common.Node;

public class SinglyLinkList {
    public Node root;

    /**
     * Insert from the front
     * @param data
     */
    public void insertFirst(Integer data){
        if(this.root==null){
            this.root = new Node(data);
            return;
        }
        Node newNode =  new Node(data);
        newNode.setNext(this.root);
        this.root = newNode;
    }

    /**
     * Delete from the first
     */
    public void deleteFirst(){
        if(root==null){return;}
        Node temp = root.getNext();
        root.setNext(null);
        root = temp;
    }

    /**
     * Insery in the last
     * @param data
     */
    public void insertLast(Integer data){
        if(root==null){
            this.root = new Node(data);
            return;
        }
        insert(root, data);
    }

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
     * insert
     * @param node
     * @param data
     */
    private void insert(Node node, Integer data) {
        if(node.getNext()==null){
            Node newNode = new Node(data);
            node.setNext(newNode);
        }else{
            insert(node.getNext(), data);
        }
    }

    /**
     * Deleet from the last
     */
    public void deleteLast(){
        if(root==null){return;}
        if(root.getNext()==null){root=null;return;}
        remove(root);

    }

    /**
     *
     * @param node
     */
    private void remove(Node node) {
        if(node.getNext().getNext()==null){
            node.setNext(null);
        }else{
            remove(node.getNext());
        }
    }

    /**
     * Display
     */
    public void display(){
        Node temp = root;
        while (temp.getNext()!=null){
            System.out.print(temp.getData()+" | ");
            temp = temp.getNext();
        }
        System.out.print(temp.getData());
        System.out.println();
    }

}
