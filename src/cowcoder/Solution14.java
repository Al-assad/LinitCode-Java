package cowcoder;

/**
 * Author: Al-assad 余林颖
 * E-mail: yulinying_1994@outlook.com
 * Date: 2018/4/20 0:14
 * Description: 合并两个排序的列表
 * URL：https://www.nowcoder.com/practice/d8b6b4358f774294a89de2a6ac4d9337?tpId=13&tqId=11169&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Solution14 {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1 == null)
            return list2;
        if(list2 == null)
            return list1;
        ListNode mergeHead = null;
        if(list1.val < list2.val){
            mergeHead = list1;
            mergeHead.next = Merge(list1.next,list2);
        }else{
            mergeHead = list2;
            mergeHead.next = Merge(list1,list2.next);
        }
        return mergeHead;
    }
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
