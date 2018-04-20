package cowcoder;

import java.util.Stack;

/**
 * Author: Al-assad 余林颖
 * E-mail: yulinying_1994@outlook.com
 * Date: 2018/4/20 17:29
 * Description:栈的压入、弹出序列
 * URL:https://www.nowcoder.com/practice/d77d11405cc7470d82554cb392585106?tpId=13&tqId=11174&tPage=2&rp=2&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Solution18 {

    public boolean IsPopOrder(int [] pushA,int [] popA) {

        if(pushA.length == 0 || popA.length == 0)
            return false;
        int curPop = 0;
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = 0; i < pushA.length; i++){
            stack.push(pushA[i]);
            while(!stack.empty() && stack.peek() == popA[curPop]){
                stack.pop();
                curPop++;
            }
        }
        return stack.empty();


    }
}
