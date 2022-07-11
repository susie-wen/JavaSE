/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/11 9:39
 */
public class TestDemo {
    public static void main(String[] args) {
        BinaryTree binaryTree=new BinaryTree();
//        BinaryTree.TreeNode root=binaryTree.createTree();
        System.out.println("前序遍历");
        binaryTree.preOrder(binaryTree.root);
        System.out.println();
        System.out.println("中序遍历");
        binaryTree.inOrder(binaryTree.root);
        System.out.println();
        System.out.println("后序遍历");
        binaryTree.postOrder(binaryTree.root);
        System.out.println();
//        System.out.println("节点的个数"+binaryTree.size(root));
        System.out.println();
    }
}
