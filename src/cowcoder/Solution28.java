package cowcoder;

import java.util.Scanner;

/**
 * Author: Al-assad 余林颖
 * E-mail: yulinying_1994@outlook.com
 * Date: 2018/6/12 20:40
 * Description: 水仙花数
 * URL：https://www.nowcoder.com/practice/dc943274e8254a9eb074298fb2084703?tpId=85&&tqId=29894&rp=1&ru=/activity/oj&qru=/ta/2017test/question-ranking
 */
public class Solution28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] params = input.nextLine().trim().split(" ");
        int m = Integer.parseInt(params[0]);
        int n = Integer.parseInt(params[1]);
        StringBuilder result = new StringBuilder();
        for(int i = m ; i <= n; i++){
            if(isTarget(i))
                result.append(i).append(" ");
        }
        System.out.println(result.toString().isEmpty()? "no" : result.toString().trim());

    }
    private static boolean isTarget(int num){
        String numStr = String.valueOf(num);
        int result = 0;
        int curNum = num;
        while(curNum > 10){
            int curDigit = curNum % 10;
            curNum /= 10;
            result += Math.pow(curDigit,3);
        }
        result += Math.pow(curNum,3);
        return result == num;
    }
}
