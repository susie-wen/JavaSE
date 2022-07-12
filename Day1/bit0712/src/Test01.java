/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/12 9:43
 */
public class Test01 {
}

/*class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(isSameTree(root,subRoot))return true;
        else if(isSameTree(root.left,subRoot))return true;
        else if(isSameTree(root.right,subRoot))return true;
        boolean t1=isSubtree(isSameTree(root.left,subRoot));
        boolean t2=isSubtree(isSameTree(root.right,subRoot));
        return t1||t2;
    }

    public boolean isSameTree(TreeNode p, TreeNode q){
        if(p==null && q!=null || p!=null && q==null)return false;
        if(p==null && q==null)return true;
        if(p.val != q.val)return false;
        // p!=null && q!=null && p.val!=q.val
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);

    }
}*/
