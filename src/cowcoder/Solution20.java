 package cowcoder;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * Author: Al-assad 余林颖
 * E-mail: yulinying_1994@outlook.com
 * Date: 2018/4/25 14:37
 * Description: 输出字符串的所有排列
 * URL：https://www.nowcoder.com/practice/fe6b651b66ae47d7acce78ffdd9a96c7?tpId=13&tqId=11180&tPage=2&rp=2&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Solution20 {
    public ArrayList<String> Permutation(String str) {
        //使用字典回溯生成法
        ArrayList<String> resultList = new ArrayList<>();
        if(str == null || str.isEmpty())
            return resultList;

        TreeSet<String> set = new TreeSet<>();
        buildDirctory(set,str.toCharArray(),0);
        resultList.addAll(set);
        return resultList;
    }

    private void buildDirctory(TreeSet<String> set,char[] chars,int cur){
        if( cur == chars.length) {
            set.add(String.valueOf(chars));
            return;
        }
        for(int i = cur; i < chars.length; i++){
            swap(chars,i,cur);
            buildDirctory(set,chars,cur+1);
            swap(chars,i,cur);
        }
    }
    private void swap (char[] chars, int i,int k){
        if(i != k){
            char tmp  = chars[i];
            chars[i] = chars[k];
            chars[k] = tmp;
        }
    }
}
