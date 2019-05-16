package android.matrix.ooredoo.qa.problems.java;

public class PrinElementsLinkedList {

    static void printLinkedList(SinglyLinkedListNode head) {

        SinglyLinkedListNode node = head;
        while(true){
            System.out.println(node.data);
            if(node.next != null) {
                node = node.next;
            } else{
                break;
            }
        }



    }
}
