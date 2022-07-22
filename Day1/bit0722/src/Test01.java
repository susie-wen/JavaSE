import java.util.*;

/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/22 10:26
 */
public class Test01 {

        public static List<String> topKFrequent(String[] words, int k) {
            Map<String,Integer> map=new HashMap<>();
            for(String s:words){
                if(map.get(s)==null){
                    map.put(s,1);
                }else{
                    int val=map.get(s);
                    map.put(s,val+1);
                }
            }
            PriorityQueue<Map.Entry<String,Integer>> minQ=new PriorityQueue<>(k,new Comparator<Map.Entry<String,Integer>>(){
                public int compare(Map.Entry<String,Integer> o1,Map.Entry<String,Integer>o2){
                    if(o1.getValue().compareTo(o2.getValue())==0){
                        return o2.getKey().compareTo(o1.getKey());
                    }
                    return o1.getValue().compareTo(o2.getValue());
                }
            });
            for(Map.Entry<String,Integer> s:map.entrySet()){

                if(minQ.size()<k){
                    minQ.offer(s);
                }else{
                    Map.Entry<String,Integer> top=minQ.peek();
                    if(top!=null){ if(top.getValue().compareTo(s.getValue())==0){
                        if(top.getKey().compareTo(s.getKey())>0){
                            minQ.poll();
                            minQ.offer(s);
                        }
                    }}


                }
            }
            List<String> list=new ArrayList<>();
            for(int i=0;i<k;i++){
                Map.Entry<String,Integer> top=minQ.poll();
                if(top!=null){
                    list.add(top.getKey());
                }
            }
            Collections.reverse(list);
            return list;
        }


    public static void main(String[] args) {
        String[] strings={"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        List<String> ret=topKFrequent(strings,3);
        System.out.println(ret);
    }
}
