import java.text.ParsePosition;
import java.util.Arrays;

/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/31 15:36
 */
public class MyArrayList {
    public int[] elem;
    public int usedSize;//当前数组中放了几个数据，记录一下
    public static final int DEFAULT_CAPACITY=10;
    public MyArrayList(){
        this.elem=new int[DEFAULT_CAPACITY];
    }
        // 打印顺序表,只需要打印到usedSize
        public void display() {
            for(int i=0;i<this.usedSize;i++){
                System.out.println(this.elem[i]+" ");
            }
            System.out.println();
        }
        // 新增元素,默认在数组最后新增
        public void add(int data) {
            if(isFull()){
                elem=Arrays.copyOf(elem,2*elem.length);
            }
            elem[usedSize++]=data;
        }
        public boolean isFull(){
            return usedSize==elem.length;
        }
        //检查Add方法的pos是否合法，使用private
        private void checkAddPos(int pos){
            if(pos<0 || pos>usedSize){
                throw new PosIndexNotLegalException("pos位置不合法");
            }
        }
        // 在 pos 位置新增元素
        public void add(int pos, int data) {
                try{
                    checkAddPos(pos);
                    for(int i=usedSize-1;i>=pos;i--){
                        elem[i+1]=elem[i];
                    }
                    elem[pos]=data;
                    usedSize++;
                }catch(PosIndexNotLegalException e){
                    e.printStackTrace();
                }
        }
        // 判定是否包含某个元素,存在则返回下标
        public int contains(int toFind) {
            for(int i=0;i<usedSize;i++){
                if(toFind==elem[i])
                    return i;
            }
            return -1;
    }
        // 查找某个元素对应的位置
        public int indexOf(int toFind) {
            for(int i=0;i<usedSize;i++){
                if(toFind==elem[i])
                    return i;
            }
            return -1;
    }
        //检查pos位置合法性
        private void checkGetPos(int pos){
            if(pos<0 || pos>=usedSize){
                throw new PosIndexNotLegalException("pos位置不合法");
            }
        }
        // 获取 pos 位置的元素
        public int get(int pos) {
              checkGetPos(pos);
              return elem[pos];
    }
        // 给 pos 位置的元素设为value
        public void set(int pos, int value) {
            checkGetPos(pos);
            elem[pos]=value;
        }
        //删除第一次出现的关键字key
        public void remove(int key) {
            int i=indexOf(key);
            if(i==-1){
                System.out.println("没有要删除的数字！");
                return;
            }
            for(;i<usedSize-1;i++){
                elem[i]=elem[i+1];
            }
            usedSize--;
        }
        // 获取顺序表长度
        public int size() { return usedSize; }
        // 清空顺序表
        public void clear() {   }
}


