import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Susie-Wen
 * @version 1.0
 * @description:创建一个二叉树
 * @date 2022/7/11 9:27
 */
public class BinaryTree {
    static class TreeNode{
        public char val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(char val){
            this.val=val;
        }
    }

    //这个二叉树的根节点
    public TreeNode root;

    public void createTree(){
        TreeNode A=new TreeNode('A');
        TreeNode B=new TreeNode('B');
        TreeNode C=new TreeNode('C');
        TreeNode D=new TreeNode('D');
        TreeNode E=new TreeNode('E');
        TreeNode F=new TreeNode('F');
        TreeNode G=new TreeNode('G');
        TreeNode H=new TreeNode('H');

        A.left=B;
        A.right=C;
        B.left=D;
        C.left=F;
        C.right=G;
        E.right=H;
        this.root=A;
    }

    //前序遍历
    void preOrder(TreeNode root){
        if(root==null) return;
        System.out.println(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    //中序遍历
    void inOrder(TreeNode root){
        if(root==null) return;
        inOrder(root.left);
        System.out.println(root.val+" ");
        inOrder(root.right);
    }
    //后序序遍历
    void postOrder(TreeNode root){
        if(root==null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.val+" ");
    }

/*    List<Integer> ret=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root){
        if(root==null) return ret;
        ret.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return ret;

    }*/


    //子问题思路 获取树中节点个数
    int size(TreeNode root){
        if(root==null) return 0;
        return size(root.left)+size(root.right)+1;
    }
    //获取树当中节点的个数:只要遍历到了节点就++
    public static int nodeSize;
    void size2(TreeNode root){
        if(root==null) return;
        nodeSize++;
        size2(root.left);
        size2(root.right);
    }

    //子问题 获取叶子节点的个数
    int getLeafNodeCount(TreeNode root){
        if(root==null)return 0;//说明无叶子节点
        if(root.left==null && root.right==null)return 1;
        return getLeafNodeCount(root.right)+getLeafNodeCount(root.left);
    }

    //获取树当中叶子节点的个数
    public static int leafsize;
    void getLeafNodeCount2(TreeNode root){
        if(root==null) return;
        if(root.left==null && root.right==null)leafsize++;
        getLeafNodeCount2(root.left);
        getLeafNodeCount2(root.right);
    }

    //求第K层节点的个数
    int getKLevelNodeCount(TreeNode root,int k){
        if(root==null)return 0;
        if(k==1)return 1;
        return getKLevelNodeCount(root.left,k-1)+getKLevelNodeCount(root.right,k-1);
    }
    //获取二叉树的高度
    int getHeight(TreeNode root){
        if(root==null)return 0;
        int leftHeight=getHeight(root.left);
        int rightHeight=getHeight(root.right);
        return 1+leftHeight > rightHeight ? leftHeight : rightHeight;
    }

    //查找当前树当做是否存在该节点
    TreeNode find(TreeNode root,int val){
        if(root==null)return null;
        if(root.val==val)return root;
        TreeNode ret1=find(root.left,val);
        if(ret1!=null) return ret1;
        TreeNode ret2=find(root.right,val);
        if(ret2!=null) return ret2;

        return null;
    }
}
































