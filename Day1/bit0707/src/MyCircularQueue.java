/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/7 20:17
 */
/*public class MyCircularQueue {
    public int[] elem;
    public int usedSize;
    public int front;//队头下标
    public int rear;//队尾下标

    public MyCircularQueue(int k ){
        this.elem =new int[k+1];
        //这里+1，否则牛客会报错，因为牛客需要所有空间都使用，而我们浪费了一个空间
    }

    public boolean enQueue(int value){
        if(isFull){
            //扩容需要注意
            return false;
        }
        this.elem[rear]=value;
        rear=(rear+1)%elem.length;
        return true;
    }


    //获取队头元素
    public int Front(){
        if(isEmypt()){
            return -1;
        }
        return elem[front];
    }

    //获取队头元素
    public int Rear(){
        if(isEmypt()){
            return -1;
        }
        int index=(rear==0) ? elem.length-1 : rear-1;
    }

    public Boolean isEmypt(){

    }
}*/
