package cowcoder;

import java.util.Scanner;

/**
 * Author: Al-assad 余林颖
 * E-mail: yulinying_1994@outlook.com
 * Date: 2018/4/25 16:34
 * Description: 统计字符
 * URL:https://www.nowcoder.com/practice/e3f67da21c3f45bfb091cf0cabb9bb0f?tpId=85&tqId=29889&tPage=3&rp=3&ru=/ta/2017test&qru=/ta/2017test/question-ranking
 */
public class Solution23 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine().trim();
        if(str.isEmpty())
            return;

        int[] record = new int[52]; //记录字母出现的次数；
        for(char ch : str.toCharArray()){
            if(!Character.isLetter(ch))
                continue;
            int index = ch < 'a' ? ch - 'A' : ch - 'a' + 26;
            record[index] += 1;
            if(record[index] >=3 ){
                System.out.println(index >= 26 ? (char)('a' -26 + index) : (char)('A' + index));
                return;
            }
        }
    }
}
