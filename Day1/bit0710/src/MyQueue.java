import java.util.Queue;

/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/10 9:32
 */
public class MyQueue {
    static class Node{
        public int val;
        public Node next;
        public Node(int val){
            this.val=val;
        }
    }

    /**
     * 入队方法
     */
    public Node head;//代表队列的头部
    public Node tail;//代表队列的尾部
    public void offer(int val){
        Node node=new Node(val);
        if(head==null){
            //此时队列里面没有元素，所以头尾指针都指向同一个节点
            head=node;
            tail=node;
        }else{
            //队列里面有元素，因此让尾部指向该元素
            tail.next=node;
            tail=tail.next;

        }
    }

    /**
     * 出队操作
     */
    public int poll(){
        if(head==null){
            return -1;//或者抛出异常
        }
        int oldVal=head.val;
        if(head.next==null){
            head=tail=null;
        }else{
            head=head.next;
        }
        return oldVal;
    }

    //查看当前队头元素
    public int peek(){
        if(head==null){
            return -1;//或者抛出异常
        }
        return head.val;
    }
}



























