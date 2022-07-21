/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/20 19:35
 */
public class BinarySearchTree {
    static class TreeNode{
        public int val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int val){
            this.val=val;
        }
    }
    public TreeNode root;

    /**
     * 查找key是否存在与二叉搜索树当中
     * @param key
     * @return 找到则返回当前节点地址 找不到则返回Null
     */
    public TreeNode search(int key){
        TreeNode cur=root;
        while(cur!=null){
            if(cur.val<key)cur=cur.right;
            else if(cur.val>key)cur=cur.left;
            else return cur;
        }
        return null;
    }

    /**
     * 插入节点
     * @param key
     */
    public boolean insert(int key){
        TreeNode node=new TreeNode(key);
        if(root==null){
            root=node;
            return true;
        }
        TreeNode cur=root;
        TreeNode parent=null;
        while(cur!=null){
            if(cur.val<key){
                parent=cur;
                cur=cur.right;
            }else if(cur.val>key){
                parent=cur;
                cur=cur.left;
            }else{
                return false;
                //存在相同的元素，不能插入成功
            }
        }
        if(parent.val<key){
            parent.right=node;
        }else{
            parent.left=node;
        }
        return false;
    }

    /**
     * 删除关键字为key的节点
     * @param key
     */
    public void remove(int key){
        TreeNode cur=root;
        TreeNode parent=null;
        while(cur!=null){
            if(cur.val<key){
                parent=cur;
                cur=cur.right;
            }else if(cur.val>key){
                parent=cur;
                cur=cur.left;
            }else{
                //找到了，开始删除
                remove(cur,parent);
                return;
            }
        }
    }

    /**
     * 删除节点
     * @param cur 删除的节点
     * @param parent 删除节点的父节点
     */
    private void remove(TreeNode cur, TreeNode parent) {
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
            TreeNode targetParent=cur;
            TreeNode target=cur.right;
            while(target.left!=null){
                targetParent=target;
                target=target.left;
            }
            cur.val=target.val;
            if(targetParent.left==target){
                targetParent.left=target.right;
            }
            else{
                targetParent.right=target.right;
            }
        }
    }

    //中序遍历
    public void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }

}
