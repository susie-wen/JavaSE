/**
 * @author Susie-Wen
 * @version 1.0
 * @description:设计循环队列
 * @date 2022/7/10 13:16
 */
public class Test02 {
}

class MyCircularQueue {
    public int[] elem;//数组
    public int usedSize;
    public int front;//队头下标
    public int rear;//队尾下标

    public MyCircularQueue(int k) {
        this.elem=new int[k];
    }
    //入队
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        this.elem[rear]=value;
        rear=(rear+1)%elem.length;
        this.usedSize++;
        return true;
    }
    //出队
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        front=(front+1)%elem.length;
        this.usedSize++;
        return true;
    }

    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return elem[front];
    }

    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        int index=(this.front+usedSize-1)%elem.length;
        return elem[index];
    }

    public boolean isEmpty() {
        return usedSize==0;
    }

    public boolean isFull() {
        //如果rear的下一个元素是front就说明满了，因为空出来一个格子
        return usedSize==elem.length;
    }
}
