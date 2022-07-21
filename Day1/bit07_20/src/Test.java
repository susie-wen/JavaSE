/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/21 7:591
 */
public class Test {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree=new BinarySearchTree();
        int[] array={80,30,48,56,60,90};
        for(int i=0;i<array.length;i++){
            binarySearchTree.insert(array[i]);
        }
        binarySearchTree.remove(30);
        binarySearchTree.inorder(binarySearchTree.root);
    }
}
