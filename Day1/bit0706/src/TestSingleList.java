import java.util.LinkedList;
import java.util.Stack;

/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/6 21:03
 */
public class TestSingleList {
    public static void main(String[] args) {
        LinkedList <Integer> linkedList=new LinkedList<>();
    }

/*    *//**
     *递归实现单链表逆序打印
     * @param head
     *//*
    public void printList(ListNode head){
        if(head==null){
        //单链表无元素
            return;
        }
        if(head.next==null){
        //说明此时单链表只有一个元素
            System.out.println(head.val+" ");
            return;
        }
        //单链表至少两个结点
        printList(head.next);
        System.out.println(head.val+" ");
    }*/

    /**
     * 非递归实现
     */
    public void printList2(){
        Stack<LinkNoed> Stack=new Stack<>();
        LinkNode cur=head;
        while(cur!=null){
            stack.push(cur);
            cur=cur.next;
        }
        while(!stack.empty()){
            LinkNode top=stack.pop();
            System.out.println(top.val+" ");
        }
    }
}
