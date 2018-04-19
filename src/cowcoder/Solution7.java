package cowcoder;

/**
 * Author: Al-assad 余林颖
 * E-mail: yulinying_1994@outlook.com
 * Date: 2018/4/19 20:31
 * Description: 跳台阶
 * https://www.nowcoder.com/practice/8c82a5b80378478f9484d87d1c5f12a4?tpId=13&tqId=11161&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
 */
public class Solution7 {
    public int JumpFloor(int target) {
        if(target <= 2)
            return target;
        int f1 = 1;
        int f2 = 2;
        int t = 0;
        for(int i = 3; i <= target; i++){
            t = f1 + f2;
            f1 = f2;
            f2 = t;
        }
        return t;
    }

}
