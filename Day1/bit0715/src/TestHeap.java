import java.util.Arrays;

/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/15 10:29
 */
public class TestHeap {
    public int[] elem;//堆的底层是数组
    public int usedSize;//当前堆中有效元素的数据个数

    //提供一个构造方法
    public TestHeap(){
        this.elem=new int[10];
        this.usedSize=0;
    }

    public void initArray(int[] array){
        elem= Arrays.copyOf(array,array.length);
        usedSize= elem.length;
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
        int child=2*parent+1;//使用公式
        //起码得有左孩子才能进入循环
        while(child<len){
            //判断左右孩子谁大，前提是必须有右孩子
            if(child+1<len && elem[child]<elem[child+1]){
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
            //如果数组满了，就进行扩容
            elem=Arrays.copyOf(elem,elem.length*2);
        }
        this.elem[usedSize]=x;//将要插入的元素放到最末尾去
        usedSize++;
        shiftUp(usedSize-1);
    }

    //插入元素：向上调整
    public void shiftUp(int child){
        int parent=(child-1)/2;
        while(child>0){
            if(elem[child]>elem[parent]){
                swap(elem,child,parent);
                child=parent;
                parent=(child-1)/2;
            }else{
                break;
            }
        }
    }

    public boolean isFull(){
        return usedSize==elem.length;
    }

    //出队：删除元素
    public int poll(){
        if(isEmpty()){
            return -1;//这里写一个异常也可以
        }
        int old=elem[0];//记录下来要删的值
        swap(elem,0,usedSize-1);
        usedSize--;
        shiftDown(0,usedSize);
        return old;
    }

    public boolean isEmpty(){
        return usedSize==0;
    }

    //堆排序
    public void heapSort(){
        int end=usedSize-1;
        while(end>0){
            swap(elem,0,end);shiftDown(0,end);
            end--;
        }
    }
}
