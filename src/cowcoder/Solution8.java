package cowcoder;

/**
 * Author: Al-assad 余林颖
 * E-mail: yulinying_1994@outlook.com
 * Date: 2018/4/19 20:55
 * Description: 矩形覆盖
 * URL:https://www.nowcoder.com/practice/72a5a919508a4251859fb2cfb987a0e6?tpId=13&tqId=11163&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Solution8 {
    public int RectCover(int target) {
        if(target <= 2)
            return target;
        int f1 = 1;
        int f2 = 2;
        int fn = 0;
        for(int i = 3; i <= target;i++){
            fn = f1 + f2;
            f1 = f2;
            f2 = fn;
        }
        return target;
    }
}
