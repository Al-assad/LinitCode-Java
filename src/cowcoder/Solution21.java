package cowcoder;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Author: Al-assad 余林颖
 * E-mail: yulinying_1994@outlook.com
 * Date: 2018/4/25 15:18
 * Description:第一个只出现一次的字母
 * URL：https://www.nowcoder.com/practice/1c82e8cf713b4bbeb2a5b31cf5b0417c?tpId=13&tqId=11187&tPage=2&rp=2&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Solution21 {

    public static int FirstNotRepeatingChar(String str) {

        if(str == null)
            return -1;
        str = str.trim();
        if(str.isEmpty())
            return -1;

        int[] record = new int[52];
        record = Arrays.stream(record).map(x -> -1).toArray();
        boolean[] repet = new boolean[52];

        for(int i = 0; i < str.length(); i++ ){
            char ch = str.charAt(i);
            int index = ch < 'a' ? ch - 'A' : ch - 'a' + 26;
            if(record[index] == -1){
                record[index] = i;
            }else{
                repet[index] = true;
            }
        }

        boolean allRepeat = true;
        for(boolean flag : repet){
            if(!flag){
                allRepeat = false;
                break;
            }
        }
        if(allRepeat)
            return -1;

        int minCur = 10000;
        for(int i = 0; i < 52; i++){
            if(repet[i] || record[i] == -1)
                continue;
            if(minCur > record[i])
                minCur = record[i];
        }
        return minCur;
    }

    public static void main(String[] args){
        System.out.println(FirstNotRepeatingChar("google"));
    }
}
