package cowcoder;

import java.util.Scanner;

/**
 * Author: Al-assad 余林颖
 * E-mail: yulinying_1994@outlook.com
 * Date: 2018/4/25 16:54
 * Description: 统计回文
 * URL:https://www.nowcoder.com/practice/9d1559511b3849deaa71b576fa7009dc?tpId=85&tqId=29842&tPage=1&rp=1&ru=/ta/2017test&qru=/ta/2017test/question-ranking
 */
public class Solution24 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String strA = input.nextLine().trim();
        String strB = input.nextLine().trim();
        if(strA.isEmpty() || strB.isEmpty())
            return;
        System.out.println(countPalindrome(strA,strB));

    }

    private static int countPalindrome(String strA, String strB){
        int count = 0;
        for(int i = 0; i <= strA.length(); i++){
            String newStr = strA.substring(0,i) + strB + strA.substring(i,strA.length());
            if(isPalindrome(newStr))
                count++;
        }
        return count;

    }

    private static boolean isPalindrome(String str) {
        if(str.length() == 0)
            return false;
        String str1 = "";
        String str2 = "";
        if(str.length() % 2 == 1){
            str1 = str.substring(0,str.length()/2 + 1);
            str2 = str.substring(str.length()/2,str.length());
        }else{
            str1 = str.substring(0,str.length()/2);
            str2 = str.substring(str.length() /2,str.length());
        }
        char[] chs = str2.toCharArray();
        char[] chsR = new char[chs.length];
        int k  = 0;
        for(int i = chs.length - 1; i >= 0; i--){
            chsR[k] = chs[i];
            k++;
        }
        String str2R = String.valueOf(chsR);

        return str1.equals(str2R);
    }


}
