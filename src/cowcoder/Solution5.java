package cowcoder;

/**
 * Author: Al-assad 余林颖
 * E-mail: yulinying_1994@outlook.com
 * Date: 2018/4/19 19:48
 * Description: 旋转数组的最小数字
 * URL: https://www.nowcoder.com/practice/9f3231a991af4f55b95579b44b7a01ba?tpId=13&tqId=11159&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
 */
public class Solution5 {
    //使用二分查找
    public int minNumberInRotateArray(int [] array) {
        int left = 0;
        int right = array.length - 1;

        while(left < right){
            int mid = (left + right) / 2;
            if(array[mid] > array[right])
                left = mid + 1;
            else
                right = mid;
        }
        return array[left];

    }
}
