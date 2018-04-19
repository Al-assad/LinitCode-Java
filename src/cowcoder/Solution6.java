package cowcoder;

/**
 * Author: Al-assad 余林颖
 * E-mail: yulinying_1994@outlook.com
 * Date: 2018/4/19 20:10
 * Description:斐波那契数列
 * URL:https://www.nowcoder.com/practice/c6c7742f5ba7442aada113136ddea0c3?tpId=13&tqId=11160&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
 */
public class Solution6 {
    public int Fibonacci(int n) {
        if(n <= 1)
            return n;
        int f1 = 0;
        int f2 = 1;
        int target = 0;
        for(int i = 2; i < n; i++){
            target = f1 + f2;
            f1 = f2;
            f2 = target;
        }
        return target;
    }
}
