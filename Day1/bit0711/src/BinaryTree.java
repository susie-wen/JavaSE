import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
    //创建一颗树
    public TreeNode createTree(){
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
        return A;
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
        TreeNode ret1=find(root.left,val);//用一个节点接收查找左子树得到的返回值
        if(ret1!=null) return ret1;//说明在左子树当中找到这个值了
        TreeNode ret2=find(root.right,val);//用一个节点接收查找右子树得到的返回值
        if(ret2!=null) return ret2;//说明在右子树当中找到这个值了
        return null;//说明在根节点和左右子树都没有找到这个结点
    }

    //层序遍历
    //可以引伸出的题目
    //求树的最大宽度，求树的左视图
    void levelOrder2(TreeNode root){
        if(root==null)return;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode cur=queue.poll();
            System.out.println(cur.val+" ");//如果不为空，就放到队列里面，然后弹出去，在打印它
            if(cur.left!=null){
                queue.offer(cur.left);
            }
            if(cur.right!=null){
                queue.offer(cur.right);
            }
        }
    }
}

class Solution{
/*
    static class TreeNode{
        public char val;
        public BinaryTree.TreeNode left;
        public BinaryTree.TreeNode right;

        public TreeNode(char val){
            this.val=val;
        }
    }


    public List<Integer> rightSideView(TreeNode root){
        List<Integer> res=new ArrayList<>();//res里面存放右视图的节点
        if(root==null){
            return res;//如果结点是空，直接返回null的res
        }
        Queue<TreeNode>queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
                if(i==size-1){
                    res.add(node.val);
                }
            }
        }
        return res;
    }*/

    Link<Integer> res =new ArrayList<>();//定义结果列表
    public Link<Integer> rightSideView(TreeNode root){
        dfs(root,0);//从根节点开始访问，深度为0
        return res;
    }
    private void dfs(TreeNode root,int depth){
        if(root==null)return;
        if(depth==res.size())res.add(root.val);
        //如果当前节点所在的深度还没有出现在res里面，
        // 说明在该深度下当前节点是第一个被访问的节点，因此将该节点加入res当中
        depth++;
        dfs(root.right,depth);//递归访问右子树
        dfs(root.left,depth);//递归访问左子树
    }
}
































