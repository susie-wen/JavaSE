import com.sun.source.tree.Tree;

/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/24 17:57
 */
public class BinaryTree {

    static class TreeNode {
        public int key;
        public TreeNode left;
        public TreeNode right;

        TreeNode(int key) {
            this.key = key;
        }
    }

    public TreeNode root;

    /**
     * 插入一个元素
     * @param key
     */
    public boolean insert(int key) {
        TreeNode node=new TreeNode(key);
        TreeNode parent=null;
        TreeNode cur=root;
        while(cur!=null){
            if(cur.key<key){
                parent=cur;
                cur=cur.right;
            }else if(cur.key>key){
                parent=cur;
                cur=cur.left;
            }else{
                return false;
            }
        }
        if(parent.key<key){
            parent.right=node;
        }else{
            parent.left=node;
        }
        return true;
    }



    //查找key是否存在
    public TreeNode search(int key) {
        TreeNode cur=root;
        while(cur!=null){
            if(cur.key<key){
                cur=cur.right;
            }else if(cur.key>key){
                cur=cur.left;
            }else{
                return cur;
            }
        }
        return null;
    }



    //删除key的值
    public boolean remove(int key) {
        TreeNode cur=root;
        TreeNode parent=null;
        while(cur!=null){
            if(cur.key<key){
                parent=cur;
                cur=cur.right;
            }else if(cur.key>key){
                parent=cur;
                cur=cur.left;
            }else{
                removeFunc(cur,parent);
            }
        }

        return false;
    }
    public void removeFunc(TreeNode cur,TreeNode parent){
        if(cur.left==null){
            if(cur==root){
                root=root.right;
            }else if(cur==parent.left){
                parent.left=cur.right;
            }else{
                parent.right=cur.right;
            }
        }else if(cur.right==null){
            if(cur==root){
                root=root.left;
            }else if(cur==parent.left){
                parent.left=cur.left;
            }else{
                parent.right=cur.left;
            }
        }else{
            BinaryTree.TreeNode targetParent = cur;
            BinaryTree.TreeNode target = cur.right;
            while (target.left != null) {
                targetParent = target;
                target = target.left;
            }
            cur.key = target.key;
            //分两种情况
            if(targetParent.left == target) {
                targetParent.left = target.right;
            }else {
                targetParent.right = target.right;
            }
        }
    }


}
