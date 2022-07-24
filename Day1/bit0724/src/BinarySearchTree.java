/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/24 17:11
 */
/**
 * @Author 12629
 * @Description：
 */
public class BinarySearchTree {

    static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int val) {
            this.val =val;
        }
    }

    public TreeNode root;

    /**
     * 查找key是否存在于二叉搜索树当中
     * @param key
     * @return 当前节点找到返回地址  找不到返回null
     */
    public TreeNode search(int key) {






        TreeNode cur = root;
        while (cur != null) {
            if(cur.val < key) {
                cur = cur.right;
            }else if(cur.val > key) {
                cur = cur.left;
            }else {
                return cur;
            }
        }
        return null;
    }

    /**
     * 插入节点
     * @param key
     */
    public boolean insert(int key) {
        TreeNode node = new TreeNode(key);
        if(root == null) {
            root = node;
            return true;
        }
        TreeNode cur = root;
        TreeNode parent = null;
        while (cur != null) {
            if(cur.val < key) {
                parent = cur;
                cur = cur.right;
            }else if(cur.val > key) {
                parent = cur;
                cur = cur.left;
            }else {
                //存在相同的元素 不能插入成功
                return false;
            }
        }
        if(parent.val <  key) {
            parent.right = node;
        }else {
            parent.left = node;
        }
        return true;
    }

    /***
     * 删除关键字为key的节点
     * @param key
     */
    public void remove(int key) {
        TreeNode cur = root;
        TreeNode parent = null;
        while (cur != null) {
            if(cur.val < key) {
                parent = cur;
                cur = cur.right;
            }else if(cur.val > key) {
                parent = cur;
                cur = cur.left;
            }else {
                //找到了 就要开始删除了
                removeNode(cur,parent);
                return;
            }
        }
    }

    /**
     * 进行删除
     * @param cur 删除的节点
     * @param parent 删除节点的父节点
     */
    private void removeNode(TreeNode cur, TreeNode parent) {
        if(cur.left == null) {
            if(cur == root) {
                root = root.right;
            }else if(cur == parent.left) {
                parent.left = cur.right;
            }else {
                parent.right = cur.right;
            }
        }else if(cur.right == null) {
            if(cur == root) {
                root = root.left;
            }else if(cur == parent.left){
                parent.left = cur.left;
            }else {
                parent.right = cur.left;
            }
        }else {
            TreeNode targetParent = cur;
            TreeNode target = cur.right;
            while (target.left != null) {
                targetParent = target;
                target = target.left;
            }
            cur.val = target.val;
            //分两种情况
            if(targetParent.left == target) {
                targetParent.left = target.right;
            }else {
                targetParent.right = target.right;
            }
        }
    }

/*    public void inorder(TreeNode root) {
        if(root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }*/

}
