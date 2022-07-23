import java.util.HashMap;
import java.util.Map;

/**
 * @author Susie-Wen
 * @version 1.0
 * @description:使用泛型实现哈希code
 * @date 2022/7/23 20:25
 */
public class HashBuck <K,V>{
    static class Node<K,V>{
        public K key;
        public V val;
        public Node<K,V> next;
        public  Node(K key,V val){
            this.key=key;
            this.val=val;
        }
    }
    public Node<K,V> []array=new Node[10];
    public int usedSize;
    public void put(K key,V val){
        Node<K,V> node=new Node<>(key,val);
        int hash=key.hashCode();
        int index=hash%array.length;
        Node<K,V> cur=array[index];
        while(cur!=null){
            if(cur.key.equals(key)){
                cur.val=val;
            }
            cur=cur.next;
        }
        this.usedSize++;
    }
    public V get(K key){
        Map map=new HashMap();
        int hash=key.hashCode();
        int index=hash% array.length;
        Node<K,V> cur=array[index];
        while(cur!=null){
            if(cur.key.equals(key)){
                return cur.val;
            }
            cur=cur.next;
        }
        return null;
    }
}
