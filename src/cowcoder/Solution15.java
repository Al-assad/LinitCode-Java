package cowcoder;

/**
 * Author: Al-assad 余林颖
 * E-mail: yulinying_1994@outlook.com
 * Date: 2018/4/20 16:38
 * Description: 判断树的子树
 * URL:https://www.nowcoder.com/practice/6e196c44c7004d15b1610b9afca8bd88?tpId=13&tqId=11170&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Solution15 {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root2 == null || root1 == null)
            return false;
        boolean flag = false;
        if(root1.val == root2.val)
            flag = isSubTree(root1,root2);
        if(!flag){
            flag = HasSubtree(root1.left,root2);
            if(!flag)
                flag = HasSubtree(root1.right,root2);
        }
        return flag;

    }

    private boolean isSubTree(TreeNode root1,TreeNode root2){
        if(root2 == null)
            return true;
        if(root1 == null)
            return false;
        if(root1.val == root2.val)
            return isSubTree(root1.left,root2.left) && isSubTree(root1.right,root2.right);
        return false;
    }

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }



}
