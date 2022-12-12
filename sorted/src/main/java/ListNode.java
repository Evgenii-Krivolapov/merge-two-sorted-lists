public class ListNode {
    int val;
    ListNode next;
    public ListNode(int val) {
        this.val = val;
    }
}

class Solution {
    ListNode listNode1 = new ListNode(0);
    ListNode listNode2 = listNode1;

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null) return list2;
        if (list2 == null) return list1;

        while (list1 != null && list2 != null) {
            if (list1.val >= list2.val) {
                listNode2.next = list2;
                listNode2 = listNode2.next;
                list2 = list2.next;
            } else {
                listNode2.next = list1;
                listNode2 = listNode2.next;
                list1 = list1.next;
            }
        }

        if (list1 == null) {
            while (list2 != null) {
                listNode2.next = list2;
                listNode2 = listNode2.next;
                list2 = list2.next;
            }
        }
        if (list2 == null) {
            while (list1 != null) {
                listNode2.next = list1;
                listNode2 = listNode2.next;
                list1 = list1.next;
            }
        }
        return listNode1.next;
    }
}
