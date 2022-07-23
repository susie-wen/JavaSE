/**
 * @author Susie-Wen
 * @version 1.0
 * @description:哈希桶
 *哈希桶底层是数组，放的元素是节点
 * @date 2022/7/23 14:28
 */
public class HashBack {
    static class Node{
        public int key;
        public int val;
        public Node next;

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
    public Node[] array;//数组的类型是节点
    public int usedSize;//记录当前哈希桶当中有效数据的个数
    public static final float DEFAULT_LOAD_FACTOR=0.75F;//默认的负载因子
    public HashBack(){
        this.array=new Node[10];
        this.usedSize=0;//默认初始化
    }
    /**
     * 存储key val
     */
    //hashMap里面key是唯一的，key是不一样的
    public void put(int key,int val){
        Node node=new Node(key,val);
        int index=key% array.length;//1、确定数组下标位置
        Node cur=array[index];
        while(cur!=null){
            if(cur.key==key){
                cur.val=val;//key值一样则替换val
                return;
            }
            cur=cur.next;//如果key不一样就一直往后找
        }
        //头插法--如果空就直接头插
        node.next=array[index];
        array[index]=node;
        usedSize++;
        //检查负载因子
        if(loadFactor()>=DEFAULT_LOAD_FACTOR){
            //此时说明要进行扩容
            grow();
        }
    }

    public float loadFactor(){
        return usedSize *1.0f/ array.length;//返回值是float类型的
    }

    //通过key值获取val
    public int get(int key){
        int index=key% array.length;
        Node cur=array[index];
        while(cur!=null){
            if(cur.key==key){
                return cur.val;
            }
            cur=cur.next;
        }
        return -1;
    }

    private void grow(){
        Node[] newArray=new Node[2* array.length];
        //重新的哈希
        /*
        * 1.遍历数组的每个元素的链表
        * 2.每遍历一个节点，就重新哈希key%len
        * 3.进行头插法
        * */
        for(int i=0;i< array.length;i++){
            Node cur=array[i];
            while(cur!=null){
                //找到新的位置
                int index=cur.key% newArray.length;
                cur.next=newArray[index];
                newArray[index]=cur;
            }
        }
        this.array=newArray;
    }

}
