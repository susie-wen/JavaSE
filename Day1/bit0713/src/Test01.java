import java.util.*;

/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/14 8:16
 */
public class Test01 {

    public void preorderTraversalNor(TreeNode root){
        Stack<TreeNode> stack=new Stack<>();
        TreeNode cur=root;
        while(cur!=null || !stack.empty()){
            while(cur!=null){
                stack.push(cur);
                cur=cur.left;
            }
            //如果cur为空，就从栈当中弹出一个元素，赋给top，并遍历top的右边
            TreeNode top=stack.pop();
            System.out.print(top.val+" ");
            cur=top.right;
        }
    }
}

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ret=new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();
        TreeNode prev=null;
        TreeNode cur=root;
        while(cur!=null || !stack.empty()){
            while(cur!=null){
                stack.push(cur);
                cur=cur.left;
            }
            //如果cur为空，就从栈当中弹出一个元素，赋给top，并遍历top的右边
            TreeNode top=stack.peek();
            if(top.right==null || prev.right==null){//右边为空，或者右边已经打印过了
                stack.pop();
                System.out.println(top.val+" ");
                prev=top;
            }else{
                cur=top.right;
            }
            ret.add(top.val);
            cur=top.right;
        }
        return ret;
    }
}
