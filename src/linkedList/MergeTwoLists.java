package linkedList;


public class MergeTwoLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        //new list to store result
        ListNode tempNode = new ListNode(0);

        //to traverse the new list
        ListNode currentNode = tempNode;

        //traversing both lists
        while(list1 != null && list2 != null){

            if(list1.val < list2.val){

                //found smaller value, assign the new list's value to found value
                currentNode.next = list1;

                //setting the pointer of the list that had the smaller value to move up to next
                list1 = list1.next;
            }
            else{
                currentNode.next = list2;
                list2 = list2.next;
            }

            currentNode = currentNode.next;
        }

        //when one list is done
        if (list1 != null){
            currentNode.next = list1;
            list1 = list1.next;
        }

        if (list2 != null){
            currentNode.next = list2;
            list1 = list2.next;
        }
        //next since we started the new list with a 0 default value node
        return tempNode.next;
    }
}
