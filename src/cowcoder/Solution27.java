package cowcoder;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Author: Al-assad 余林颖
 * E-mail: yulinying_1994@outlook.com
 * Date: 2018/6/12 20:10
 * Description: 保留最大的数
 * URL：https://www.nowcoder.com/practice/7f26bfeccfa44a17b6b269621304dd4a?tpId=85&&tqId=29890&rp=1&ru=/activity/oj&qru=/ta/2017test/question-ranking
 */
public class Solution27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String number = input.nextLine().trim();
        int wipeCount = Integer.parseInt(input.nextLine().trim());
        String result = "";
        for(int i = 0; i < wipeCount; i++)
            result = wipeOne(number);
        System.out.println(result);

    }
    private static String wipeOne(String srcNum){
        BigDecimal maxNum = new BigDecimal(srcNum.substring(1,srcNum.length()));
        for(int i = 1; i < srcNum.length(); i++){
            BigDecimal subNum = new BigDecimal(srcNum.substring(0,i) + srcNum.substring(i + 1,srcNum.length()));
            if(maxNum.compareTo(subNum) < 0)
                maxNum = subNum;
        }
        return String.valueOf(maxNum);
    }
}
