package cowcoder;

/**
 * Author: Al-assad 余林颖
 * E-mail: yulinying_1994@outlook.com
 * Date: 2018/4/19 22:55
 * Description: 获取链表倒数第K个节点
 * URL：https://www.nowcoder.com/practice/529d3ae5a407492994ad2a246518148a?tpId=13&tqId=11167&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Solution12 {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head == null || k <=0)
            return null;

        ListNode node1 = head;
        ListNode node2 = head;

        for(int i = 1; i < k ; i++){
            if(node1.next != null)
                node1 = node1.next;
            else
                return null;
        }
        while(node1.next != null){
            node1 = node1.next;
            node2 = node2.next;

        }
        return node2;
    }

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

}
