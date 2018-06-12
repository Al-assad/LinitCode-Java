package cowcoder;

import java.util.Scanner;

/**
 * Author: Al-assad 余林颖
 * E-mail: yulinying_1994@outlook.com
 * Date: 2018/6/12 20:05
 * Description: 句子反转
 * URL：https://www.nowcoder.com/practice/0ae4a12ab0a048ee900d1536a6e98315?tpId=85&&tqId=29896&rp=1&ru=/activity/oj&qru=/ta/2017test/question-ranking
 */
public class Solution26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = input.nextLine().trim().split(" ");
        StringBuilder result = new StringBuilder();
        for(int i = words.length - 1; i >= 1; i--)
            result.append(words[i]).append(" ");
        result.append(words[0]);
        System.out.println(result.toString());
    }
}
