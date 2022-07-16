/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/15 20:18
 */
public class Test02 {
    public static void main(String[] args) {
        BinaryTree binaryTree=new BinaryTree();
        BinaryTree.TreeNode root=binaryTree.createTree();
        System.out.println("前序遍历");
        binaryTree.preOrder(root);
        System.out.println();
        System.out.println("中序遍历");
        binaryTree.inOrder(root);
        System.out.println();
        System.out.println("后序遍历");
        binaryTree.postOrder(root);
        System.out.println();
        System.out.println("节点个数1："+binaryTree.size2(root));
        System.out.println("高度："+binaryTree.getHeight(root));
        System.out.println("层序遍历");
        binaryTree.levelOrder(root);
        System.out.println("是否是完全二叉树");
        System.out.println(binaryTree.isCompleteTree(root));
    }
}
