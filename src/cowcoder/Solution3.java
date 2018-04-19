package cowcoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Author: Al-assad 余林颖
 * E-mail: yulinying_1994@outlook.com
 * Date: 2018/4/19 19:00
 * Description: 从头到尾打印链表
 * URL:https://www.nowcoder.com/practice/d0267f7f55b3412ba93bd35cfa8e8035?tpId=13&tqId=11156&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
 */
public class Solution3 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        if(listNode == null)
            return list;
        list.add(listNode.val);
        while((listNode = listNode.next) != null){
            list.add(listNode.val);
        }
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i=list.size()-1;i>=0;i--){
            list2.add(list.get(i));
        }

        return list2;
    }



    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
     }
}


