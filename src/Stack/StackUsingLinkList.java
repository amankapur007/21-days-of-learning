package Stack;

import common.Node;

public class StackUsingLinkList {
    Node root;

    public void push(int data){
        if(null==root){
            root= new Node(data);
            System.out.println("Data Pushed :: "+root);
            return;
        }
        insertAtEnd(root,data);
    }

    private void insertAtEnd(Node node, int data) {
        if(node.getNext()==null){
            Node newNode = new Node(data);
            node.setNext(newNode);
            System.out.println("Data Pushed :: "+newNode);
        }else{
            insertAtEnd(node.getNext(),data);
        }
    }

    public Node pop(){
        if(root==null)return null;
        if(root.getNext()==null)return null;
        return remove(root);
    }

    private Node remove(Node node) {
        Node temp = node;
        if(node.getNext().getNext()==null){
            node.setNext(null);
            System.out.println("Data removed :: "+temp.getNext());
            return node.getNext();
        }else{
            return remove(node.getNext());
        }
    }

    public void display(){
        Node temp = root;
        while (temp!=null){
            System.out.print(temp.getData()+" | ");
            temp = temp.getNext();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackUsingLinkList list = new StackUsingLinkList();
        list.push(1);
        list.display();
        list.push(2);
        list.display();
        list.push(3);
        list.display();
        list.pop();
        list.display();
        list.push(4);
        list.display();
        list.pop();
        list.display();
    }
}
