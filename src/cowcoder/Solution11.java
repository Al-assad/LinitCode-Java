package cowcoder;

/**
 * Author: Al-assad 余林颖
 * E-mail: yulinying_1994@outlook.com
 * Date: 2018/4/19 21:16
 * Description:
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
