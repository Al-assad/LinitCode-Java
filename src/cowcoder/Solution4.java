package cowcoder;

import java.util.Stack;

/**
 * Author: Al-assad 余林颖
 * E-mail: yulinying_1994@outlook.com
 * Date: 2018/4/19 19:19
 * Description:使用两个栈实现一个队列
 * URL:https://www.nowcoder.com/practice/54275ddae22f475981afa2244dd448c6?tpId=13&tqId=11158&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
 */
public class Solution4 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if(stack1.empty())
            return 0;
        int target = 0;
        while(!stack1.empty())
            stack2.push(stack1.pop());
        target = stack2.pop();
        while(!stack2.empty())
            stack1.push(stack2.pop());
        return target;
    }
}
