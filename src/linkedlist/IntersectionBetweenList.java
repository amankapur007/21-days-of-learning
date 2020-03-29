package linkedlist;

import common.Node;

public class IntersectionBetweenList extends  SinglyLinkList{
    public void intersectingNode(Node list1, Node list2){
        int lengthOf1 = 0;
        int lengthOf2 = 0;
        Node firstList = list1;
        Node secondList = list2;
        while (firstList!=null){
            lengthOf1++;
            firstList = firstList.getNext();
        }
        while (secondList!=null){
            lengthOf2++;
            secondList = secondList.getNext();
        }
        Node ptr1=list1;
        Node ptr2=list2;
        if(lengthOf1>lengthOf2){
            int i=0;
            int diff = lengthOf1- lengthOf2;
            while (i<diff){
                ptr1= ptr1.getNext();
                i++;
            }
        }else{
            int i=0;
            int diff = lengthOf2- lengthOf1;
            while (i<diff){
                i++;
                ptr2=ptr2.getNext();
            }
        }

        while (ptr1!=null && ptr2!=null){
            if(ptr1==ptr2){
                System.out.println("Intersecting node :: "+ptr1);
                return;
            }
            ptr1 = ptr1.getNext();
            ptr2 = ptr2.getNext();
        }
        System.out.println("No intersecting node");
    }
}
