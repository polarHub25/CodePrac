using System;

public class AddTwoNum {
    public class ListNode {
        public int val;
        public ListNode next;
        public ListNode(){}
        public ListNode(int val) { this.val = val;}
        public ListNode(int val, ListNode next){ this.val = val; this.next = next; }
    }

    public static void main(string[] args){
        AddTwoNum sol = new AddTwoNum();

        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next = new ListNode(3);

        ListNode = l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next = new ListNode(4);

        ListNode result = sol.AddTwoNumbers(l1,l2);

        Console.WriteLine("result: ");
        PrintList(result);
    }

    private static void PrintList(ListNode node){
        while(node != null){
            Console.Write(node.val);
            if(node.next != null){
                Console.Write(" -> ");
            }
            node = node.next;
        }
        Console.WriteLine();
    }
    public ListNode AddTwoNumbers(ListNode l1, ListNode l2){
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        while( l1 != null || l2 != null || carry != 0){
            int sum = carry;
            if(l1 != null){
                sum += l1.val;
                l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2.next;
            }
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
        }

        return dummyHead.next;
    }
}
