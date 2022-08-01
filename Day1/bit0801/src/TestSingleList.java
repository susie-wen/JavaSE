/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/8/1 8:33
 */
public class TestSingleList {
    static class Node{
        public int val;
        public Node next;
        public Node(int val){
            this.val=val;
        }
    }
    public Node head;//表示存储当前链表的头结点的引用
    /**
     * 通过穷举的方式创建链表
     */
    public void createList(){
        Node node1=new Node(10);
        Node node2=new Node(11);
        Node node3=new Node(12);
        Node node4=new Node(13);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        head=node1;
    }
    /*
    打印顺序表
     */
    public void display(){
        Node cur=this.head;
        while(cur!=null){
            System.out.println(cur.val+" ");
            cur=cur.next;
        }
    }

    // 1、无头单向非循环链表实现

        //头插法,时间复杂度：O（1），但是正着插入的会倒着出来
        public void addFirst(int data){
            Node node=new Node(data);
            node.next=head;
            head=node;
        }
        //尾插法
        public void addLast(int data){
            Node node=new Node(data);
            Node cur=head;
            if(head==null){
                head=node;
            }else{
                while(cur.next!=null){
                    cur=cur.next;
                }
                cur.next=node;
            }
        }
        //检查index的合法性
        private void checkIndex(int index){
            if(index<0 || index>size()){
                throw new IndexNotLegalException("index不合法");
            }
        }
        //任意位置插入,第一个数据节点为0号下标
        public boolean addIndex(int index,int data){
            checkIndex(index);
            if(index==0){
                addFirst(data);
                return true;
            }else if(index==size()){
                addLast(data);
                return true;
            }else{
                Node node=new Node(data);
                Node cur=head;
                while((index-1)!=0) {
                    cur = cur.next;
                    index--;
                }
                node.next=cur.next;
                cur.next=node;
                return true;
            }
        }
        //查找是否包含关键字key是否在单链表当中
        public boolean contains(int key) {
            Node cur=head;
            while(cur!=null){
                if(cur.val==key){
                    return true;
                }
                cur=cur.next;
            }
            return false;
        }
        //删除第一次出现关键字为key的节点
        public void remove(int key){
            Node cur=head;
            if(head.val==key){
                head=head.next;
                return;
            }
            while(cur!=null){
                if(cur.next.val==key){
                    Node remove=cur.next;
                    cur.next=cur.next.next;
                    remove=null;
                    return;
                }
            }
        }
        //删除所有值为key的节点
        public void removeAllKey(int key){
            if(head==null)return;
            Node prev=head;
            Node cur=head.next;
            while(cur!=null){
                if(cur.val==key){
                    prev.next=cur.next;
                    cur=cur.next;
                }else{
                    prev=cur;
                    cur=cur.next;;
                }
            }
            //头结点需要最后才行
            if(head.val==key){
                head=head.next;
            }
        }
        //得到单链表的长度
        public int size(){
            Node cur=head;
            int count=0;
            while(cur!=null){
                count++;
                cur=cur.next;
            }
            return count;
        }
        public void clear();

        //找到关键字key的前驱节点
        private Node searchPreOfKey(int key){
            Node cur=this.head;
            while(cur.next!=null){
                if(cur.next.val==key){
                    return cur;
                }
                cur=cur.next;
            }
            return null;
        }

}
