package cowcoder;

/**
 * Author: Al-assad 余林颖
 * E-mail: yulinying_1994@outlook.com
 * Date: 2018/4/19 18:08
 * Description: 替换空格
 * URL:https://www.nowcoder.com/practice/4060ac7e3e404ad1a894ef3e17650423?tpId=13&tqId=11155&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
 */
public class Solution2 {
    public String replaceSpace(StringBuffer str) {
        StringBuilder bf = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == ' ')
                bf.append("%20");
            else
                bf.append(ch);
        }
        return bf.toString();
    }
}
