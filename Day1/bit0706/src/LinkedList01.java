import java.util.ArrayList;
import java.util.LinkedList;
/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/6 18:53
 */

public class LinkedList01 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        //双向链表
        LinkedList<Integer> LinkedList=new LinkedList<>(arrayList);
        for(Integer x:LinkedList){

        }

    }
}
