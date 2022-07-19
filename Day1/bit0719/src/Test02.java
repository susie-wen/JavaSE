import java.util.Arrays;

/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/19 9:01
 */
public class Test02 {
}

class PriorityQueue {
    public int[] elem;
    public int usedSize;

    public PriorityQueue() {
    }

    /**
     * 建堆的时间复杂度：
     *
     * @param array
     */
    public void createHeap(int[] array) {
        for(int parent=(usedSize-1-1)/2;parent>=0;parent--){
            shiftDown(parent,usedSize);
        }
    }

    /**
     *
     * @param root 是每棵子树的根节点的下标
     * @param len  是每棵子树调整结束的结束条件
     * 向下调整的时间复杂度：O(logn)
     */
    private void shiftDown(int root,int len) {
        for(int child=2*root+1;child<len;child=2*child+1){
            if(child+1<len && elem[child]<elem[child+1]){
                child++;
            }
            if(elem[child]<elem[root]){
                break;
            }
            swap(elem,child,root);
            root=child;
        }
    }
    private void swap(int[] array,int i,int j){
        int tmp=array[i];
        array[i]=array[j];
        array[j]=tmp;
    }

    /**
     * 入队：仍然要保持是大根堆
     * @param val
     */
    public void push(int val) {
        if(isFull()){
            elem= Arrays.copyOf(elem,elem.length*2);
        }
        elem[usedSize]=val;
        usedSize++;
        shiftUp(usedSize-1);
    }

    private void shiftUp(int child) {
        for(int parent=(child-1)/2;elem[child]>elem[parent] && child>0;parent=(parent-1)/2){
            swap(elem,child,parent);
            child=parent;
        }
    }

    public boolean isFull() {
        return elem.length==usedSize;
    }

    /**
     * 出队【删除】：每次删除的都是优先级高的元素
     * 仍然要保持是大根堆
     */
    public void pollHeap() {
        if(elem.length<=0)return;
        swap(elem,0,usedSize-1);
        usedSize--;
        shiftDown(0,usedSize);
    }

    public boolean isEmpty() {
        return usedSize==0;
    }

    /**
     * 获取堆顶元素
     * @return
     */
    public int peekHeap() {
        return elem[0];
    }
}
