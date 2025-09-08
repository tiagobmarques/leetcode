import java.math.BigInteger;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        String valor1 = getValorRecursivo(l1);
        String valor2 = getValorRecursivo(l2);

        BigInteger largeNumber1 = new BigInteger(valor1);
        BigInteger largeNumber2 = new BigInteger(valor2);

        String soma = largeNumber1.add(largeNumber2).toString();

        return montarObjetoRecursivo(soma);
    }

    private String getValorRecursivo(ListNode listNode) {
        StringBuilder stringBuilder = new StringBuilder();

        do {
            stringBuilder.append(listNode.val);
            listNode = listNode.next;
        } while (listNode != null);

        return stringBuilder.reverse().toString();
    }

    private ListNode montarObjetoRecursivo(String soma) {
        ListNode listNode = new ListNode();
        ListNode listNodeAntes = null;
        for (int i = 0; i < soma.length(); i++) {
            int val = Character.getNumericValue(soma.charAt(i));
            if (listNodeAntes == null) {
                listNodeAntes = new ListNode(val);
            } else {
                listNodeAntes = new ListNode(val, listNode);
            }

            listNode = listNodeAntes;
        }

        return listNode;
    }
}
