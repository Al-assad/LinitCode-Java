package cowcoder;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Author: Al-assad 余林颖
 * E-mail: yulinying_1994@outlook.com
 * Date: 2018/6/12 18:47
 * Description: 数串
 * URL：https://www.nowcoder.com/practice/a6a656249f404eb498d16b2f8eaa2c60?tpId=85&&tqId=29898&rp=1&ru=/activity/oj&qru=/ta/2017test/question-ranking
 */
public class Solution25 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine().trim());
        //比较重排数组
        List<String> list = Arrays.asList(input.nextLine().trim().split(" "));
        list.sort(new MyComparator());  //max->min
        System.out.println(list.stream().collect(Collectors.joining("")));

    }

    private static class MyComparator implements Comparator<String>{
        @Override
        public int compare(String o1, String o2) {
            int num1 = Integer.parseInt(o1+o2);
            int num2 = Integer.parseInt(o2+o1);
            return num2 - num1;
        }
    }
}
