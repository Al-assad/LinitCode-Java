 package cowcoder;

import java.util.Scanner;

/**
 * Author: Al-assad 余林颖
 * E-mail: yulinying_1994@outlook.com
 * Date: 2018/4/25 16:18
 * Description:倒置字符串
 * URL：https://www.nowcoder.com/practice/ee5de2e7c45a46a090c1ced2fdc62355?tpId=85&tqId=29867&tPage=2&rp=2&ru=/ta/2017test&qru=/ta/2017test/question-ranking
 *
 */
public class Solution22 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        if(str == null || str.trim().isEmpty())
            return;

        String[] words = str.trim().split(" ");

        for(int i = words.length - 1; i >0 ; i--){
            System.out.print(words[i]+" ");
        }
        System.out.println(words[0]);
    }
}
