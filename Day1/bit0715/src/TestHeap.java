import java.util.Arrays;

/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/15 10:29
 */
public class TestHeap {
    public int[] elem;
    public int usedSize;//当前堆中有效元素的数据个数

    public TestHeap(){
        this.elem=new int[10];
    }

    public void initArray(int[] array){
        elem= Arrays.copyOf(array,array.length);
    }

    //建堆：大根堆
    public void createHeap(){
        for(int parent=(usedSize-1-1)/2;parent>=0;parent--){
            shiftDown(parent,usedSize);
        }
    }

    /**
     *实现向下调整
     * @param parent 每棵子树的根节点下标
     * @param len 每棵子树的结束位置
     */
    private void shiftDown(int parent,int len){
        int child=2*parent+1;
        //起码得有左孩子
        while(child<len){
            //判断左右孩子谁大，前提是必须有右孩子
            if(child+1<usedSize && elem[child]<elem[child+1]){
                child++;//此时保存了最大值的下标
            }
            if(elem[child]>elem[parent]){
                swap(elem,child,parent);
                parent=child;
                child=2*parent-1;
            }else{
                break;
            }
        }
    }

    private void swap(int[] array,int i,int j){
        int tmp=array[i];
        array[i]=array[j];
        array[j]=tmp;
    }









    public void offer(int x){
        if(isFull()){
            elem=Arrays.copyOf(elem,elem.length);
        }
        this.elem[usedSize]=x;
        usedSize++;
        shiftUp(usedSize-1);
    }

    private void shiftUp(int child){
        int parent=(child-1)/2;
        while(child>0){
            if(elem[child]>elem[parent]){
                swap()
            }
        }
    }

}
