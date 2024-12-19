public class AddTwoNum {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String args[]) {

        AddTwoNum sol = new AddTwoNum();
        
        ListNode l1 = sol.new ListNode(2);
        l1.next = sol.new ListNode(4);
        l1.next.next = sol.new ListNode(3);

        ListNode l2 = sol.new ListNode(5);
        l2.next = sol.new ListNode(6);
        l2.next = sol.new ListNode(4);

        ListNode result = sol.addTwoNumbers(l1, l2);

        System.out.println("result : ");
        printList(result);
        
    }
        
    private static void printList(AddTwoNum.ListNode node) {
        while(node != null){
            System.out.print(node.val);
            if(node.next != null){
                System.out.print(" -> ");
            }
            node = node.next;
        }
        System.out.println();
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0; 
        
        while(l1 != null || l2 != null || carry != 0){
        int sum = carry;
        if(l1 != null){
            sum += l1.val;
            l1 = l1.next;
        }
        if(l2 != null){
            sum += l2.val;
            l2 = l2.next;
        }

        carry = sum / 10;
        current.next = new ListNode(sum % 10);
        current = current.next;
    }
        return dummyHead.next;
    }
    
}
