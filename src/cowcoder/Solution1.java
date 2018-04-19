package cowcoder;

/**
 * Author: Al-assad 余林颖
 * E-mail: yulinying_1994@outlook.com
 * Date: 2018/4/19 16:58
 * Description: 二维数组中的查找
 * URL: https://www.nowcoder.com/practice/abc3fe2ce8e146608e868a70efebf62e?tpId=13&tqId=11154&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Solution1 {

    //暴力遍历 O(n^2)
    public boolean Find(int target, int [][] array) {
        if(array == null || array.length == 0 || (array.length ==1 && array[0].length == 0))
            return false;
        if( target < array[0][0] || target > array[array.length-1][array.length-1] )
            return false;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                if(target == array[i][j])
                    return true;
            }
        }
        return false;
    }

    //二分法查找
    public boolean Find2(int target, int [][] array) {
        if(array == null || array.length == 0 || (array.length ==1 && array[0].length == 0))
            return false;
        for(int i=0;i<array.length;i++){
            if(target > array[i][array.length - 1])
                continue;
            if(target < array[i][0])
                return false;
            int low = 0;
            int high = array[i].length - 1;
            while(low <= high){
                int mid = (low + high) / 2;
                if(target > array[i][mid])
                    low = mid + 1;
                else if(target < array[i][mid])
                    high = mid - 1;
                else
                    return true;
            }
        }
        return false;
    }

}