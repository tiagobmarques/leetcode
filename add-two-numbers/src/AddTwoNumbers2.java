public class AddTwoNumbers2 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);

        ListNode l2 = new ListNode(1, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))))))));
        ListNode listNode = addTwoNumbers(l1, l2);

    }
    public static  ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int soma;
        int sobra = 0;
        ListNode listNode = new ListNode(0);
        ListNode listNodeCopy = listNode;

        while (l1 != null || l2 != null || sobra > 0) {

            int valor1 = (l1 != null) ? l1.val : 0;
            int valor2 = (l2 != null) ? l2.val : 0;

            soma = valor1 + valor2 + sobra;
            sobra = 0;
            if (soma > 9) {
                sobra = 1;
                soma -= 10;
            }

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;

            listNodeCopy.val = soma;
            if (l1 != null || l2 != null || sobra > 0) {
                listNodeCopy.next = new ListNode();
                listNodeCopy = listNodeCopy.next;
            }
        }

        return listNode;
    }
}
