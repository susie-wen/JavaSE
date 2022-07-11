/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/7 19:34
 */
public class MyQueue {
    static class Node{
        public int val;
        public Node next;
        public Node(int val){
            this.val=val;
        }
    }
    public Node head;//队列的头
    public Node tail;//队列的尾

    /**
     * 入队操作，插入到列表的尾巴
     * @param val
     */
    public void offer(int val){
        Node node=new Node(val);
        if(head==null){
            head=node;
            tail=node;
        }else{
            tail.next=node;
            tail=tail.next;
        }
    }

    /**
     * 出队
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

    //查看当前队头元素是几
    public int peek(){
        return head.val;
    }
}
