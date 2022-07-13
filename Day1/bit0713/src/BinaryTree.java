/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/13 12:30
 */
public class BinaryTree {

    static class TreeNode {
        public char val;
        public TreeNode left;//左孩子的引用
        public TreeNode right;//右孩子的引用

        public TreeNode(char val) {
            this.val = val;
        }
    }


    /**
     * 创建一棵二叉树 返回这棵树的根节点
     *
     * @return
     */
    public TreeNode createTree() {

    }

    // 前序遍历
    public void preOrder(TreeNode root) {
    }

    // 中序遍历
    void inOrder(TreeNode root) {
    }

    // 后序遍历
    void postOrder(TreeNode root) {
    }

    public static int nodeSize;

    /**
     * 获取树中节点的个数：遍历思路
     */
    void size(TreeNode root) {
    }

    /**
     * 获取节点的个数：子问题的思路
     *
     * @param root
     * @return
     */
    int size2(TreeNode root) {
    }


    /*
     获取叶子节点的个数：遍历思路
     */
    public static int leafSize = 0;

    void getLeafNodeCount1(TreeNode root) {
    }

    /*
     获取叶子节点的个数：子问题
     */
    int getLeafNodeCount2(TreeNode root) {
    }

    /*
    获取第K层节点的个数
     */
    int getKLevelNodeCount(TreeNode root, int k) {
    }

    /*
     获取二叉树的高度
     时间复杂度：O(N)
     */
    int getHeight(TreeNode root) {

    }


    // 检测值为value的元素是否存在
    TreeNode find(TreeNode root, char val) {

        return null;
    }

    //层序遍历
    void levelOrder(TreeNode root) {

    }


    // 判断一棵树是不是完全二叉树
    boolean isCompleteTree(TreeNode root) {
        return true;
    }
}
