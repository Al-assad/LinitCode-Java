package cowcoder;

/**
 * Author: Al-assad 余林颖
 * E-mail: yulinying_1994@outlook.com
 * Date: 2018/4/19 21:16
 * Description: 调整数据顺序
 * URL：https://www.nowcoder.com/practice/beb5aa231adc45b2a5dcc5b62c93f593?tpId=13&tqId=11166&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
 */
public class Solution11 {
    public void reOrderArray(int [] array) {
        for(int k = 0; k < array.length -1 ; k++){
            for(int i = 0; i< array.length - k -1; i++){
                if(isEven(array[i]) && !isEven(array[i+1])){
                    int tmp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = tmp;
                }

            }
        }
    }
    private boolean isEven(int num){
        return num % 2 == 0;
    }
}
