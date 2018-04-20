package cowcoder;
import java.util.Objects;
import java.util.Stack;
/**
 * Author: Al-assad 余林颖
 * E-mail: yulinying_1994@outlook.com
 * Date: 2018/4/20 17:07
 * Description: 包含 min 函数的栈
 * URL：https://www.nowcoder.com/practice/4c776177d2c04c2494f2555c9fcc1e49?tpId=13&tqId=11173&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */

public class Solution17 {

    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    public void push(int node) {
        stack.push(node);
        if(minStack.empty())
            minStack.push(node);
        else if(minStack.peek() > node)
            minStack.push(node);
    }

    public void pop() {
        int num1 = stack.pop();
        int num2 = minStack.pop();
        if(num1 != num2)
            minStack.push(num2);
    }

    public int top() {
        int num = stack.pop();
        stack.push(num);
        return num;
    }

    public int min() {
        int num = minStack.pop();
        minStack.push(num);
        return num;
    }
}
