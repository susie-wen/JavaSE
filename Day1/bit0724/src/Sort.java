/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/24 10:27
 */
import java.util.Stack;

/**
 * @Author 12629
 * @Description：
 */
public class Sort {

    /**
     * 直接插入排序
     * 时间复杂度：
     *      最坏：O(n^2)  逆序
     *      最好：O(n)    有序
     *      结论：对于直接插入排序来说，数据越有序越快。
     *      场景：当数据基本上是有序的时候，使用直接插入排序
     * 空间复杂度：O(1)
     * 稳定性：稳定
     *       一个本身就稳定的排序 ，你可以实现为不稳定
     *       但是一个本身就不稳定的排序，你没有办法变成稳定的排序
     * @param array
     */
    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];
            int j = i-1;
            for(;j >= 0;j--) {
                //加上等号 就是不稳定
                if(array[j] > tmp) {
                    array[j+1] = array[j];
                }else {
                    break;
                }
            }
            array[j+1] = tmp;
        }
    }

    private static void shell(int [] array,int gap) {
        //这里一定要++
        for (int i = gap; i < array.length; i++) {
            int tmp = array[i];
            int j = i-gap;
            for(;j >= 0;j-=gap) {
                //加上等号 就是不稳定
                if(array[j] > tmp) {
                    array[j+gap] = array[j];
                }else {
                    break;
                }
            }
            array[j+gap] = tmp;
        }
    }

    /**
     * 希尔排序的时间复杂度：
     * O(N^1.3 - N^1.5)
     * 空间复杂度：O(1)
     * 稳定性：不稳定
     * @param array
     */
    public static void shellSort(int[] array) {
        int gap = array.length;
        while (gap > 1) {
            shell(array,gap);
            gap /= 2;
        }
        shell(array,1);
       /*int[] drr = {5,2,1};
        for (int i = 0; i < drr.length; i++) {
            shell(array,drr[i]);
        }*/
    }

    /**
     * 直接选择排序
     * 时间复杂度：O(n^2) -> 对数据不敏感 不管你是有序的还是无序的 时间复杂度都是这样的
     * 空间复杂度：O(1)
     * 稳定性：不稳定的排序
     * @param array
     */
    public static void selectSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            //每次将i下标的 值 当做是 最小值
            int minIndex = i;
            for (int j = i+1; j < array.length; j++) {
                if(array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            swap(array,minIndex,i);
        }
    }

    /**
     * 交换函数
     * @param array
     * @param i
     * @param j
     */
    private static void swap(int[] array,int i,int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    /**
     * O(N^2)
     * @param array
     */
    public static void selectSort2(int[] array) {
        int left = 0;
        int right = array.length-1;
        while (left < right) {
            int minIndex = left;
            int maxIndex = left;
            for (int i = left+1; i <= right ; i++) {
                if(array[i] < array[minIndex]) {
                    minIndex = i;
                }
                if(array[i] > array[maxIndex]) {
                    maxIndex = i;
                }
            }
            swap(array,left,minIndex);
            //修正 max的下标
            if(left == maxIndex) {
                maxIndex = minIndex;
            }
            swap(array,right,maxIndex);
            left++;
            right--;
        }
    }


    /**
     * 时间复杂度：O(n*logn)
     * N^0.5    logn
     * 空间复杂度：O(1)
     * 稳定性：不稳定的
     * @param array
     */
    public static void heapSort(int[] array) {
        createBigHeap(array);
        int end = array.length-1;
        while (end >= 0) {
            swap(array,0,end);
            shiftDown(array,0,end);
            end--;
        }
    }

    private static void createBigHeap(int[] array) {

        for (int parent = (array.length-1-1)/2; parent >= 0 ; parent--) {
            shiftDown(array,parent,array.length);
        }
    }

    private static void shiftDown(int[] array,int parent,int len) {
        int child = 2*parent+1;
        //最起码保证有左孩子
        while (child < len) {
            if(child+1 < len && array[child] < array[child+1]) {
                child++;
            }
            if(array[child] > array[parent]) {
                swap(array,child,parent);
                parent = child;
                child = 2*parent+1;
            }else {
                break;
            }
        }
    }

    /**
     * 冒泡排序
     * 时间复杂度：O(N^2)
     *     针对优化后的代码，时间复杂度在有序的情况下：O(n)
     * 空间复杂度：O(1)
     * 稳定性：稳定 的排序
     * 插入
     * @param array
     */
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            boolean flg = false;
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j] > array[j+1]) {
                    swap(array,j,j+1);
                    flg = true;
                }
            }
            if(!flg) {
                break;
            }
        }
    }

    /**
     * Hoare法  找基准
     * @param array
     * @param start
     * @param end
     * @return
     */
    private static int partitionHoare(int[] array,int start,int end) {
        int i = start;//事先存储好start下标
        int key = array[start];
        while (start < end) {
            //为啥取等号？ 不然就死循环了
            while (start < end && array[end] >= key) {
                end--;
            }
            while (start < end && array[start] <= key) {
                start++;
            }
            swap(array,start,end);
        }
        swap(array,start,i);
        return start;
    }

    /**
     * 挖坑法
     * @param array
     * @param start
     * @param end
     * @return
     */
    private static int partitionHole(int[] array,int start,int end) {
        int key = array[start];
        while (start < end) {
            while (start < end && array[end] >= key) {
                end--;
            }
            array[start] = array[end];
            while (start < end && array[start] <= key) {
                start++;
            }
            array[end] = array[start];
        }
        array[start] = key;
        return start;
    }


    /**
     * 前后指针法
     * @param array
     * @param start
     * @param end
     * @return
     */
    private static int partition(int[] array,int start,int end) {
        int prev = start ;
        int cur = start+1;
        while (cur <= end) {
            if(array[cur] < array[start] && array[++prev] != array[cur]) {
                swap(array,cur,prev);
            }
            cur++;
        }
        swap(array,prev,start);
        return prev;
    }

    /**
     * 三数取中
     * @param array
     * @param left
     * @param right
     * @return
     */
    private static int midNumIndex(int[] array,int left,int right) {
        int mid = (left+right) / 2 ;
        // 3  <  9
        if(array[left] < array[right]) {
            if(array[mid] < array[left]) {
                return left;
            }else if(array[mid] > array[right]) {
                return right;
            }else {
                return mid;
            }
        }else {
            //9 > 3
            if(array[mid] < array[right]) {
                return right;
            }else if(array[mid] > array[left]){
                return left;
            }else {
                return mid;
            }
        }
    }


    public static void insertSort2(int[] array,int start,int end) {
        for (int i = start+1; i <= end; i++) {
            int tmp = array[i];
            int j = i-1;
            for(;j >= start;j--) {
                //加上等号 就是不稳定
                if(array[j] > tmp) {
                    array[j+1] = array[j];
                }else {
                    break;
                }
            }
            array[j+1] = tmp;
        }
    }

    private static void quick(int[] array,int left,int right) {
        //这里代表 只要一个节点了 大于号：有可能没有子树  有序  逆序
        if(left >= right) {
            return;
        }

        //小区间使用直接插入排序： 主要 优化了递归的深度
        if(right - left + 1 <= 7) {
            //使用直接插入排序
            insertSort2(array,left,right);
            return;
        }

        //三数取中：解决递归深度问题 基本上 有了三数取中  你的待排序序列 基本上每次都是二分N*logn
        int index = midNumIndex(array,left,right);
        swap(array,left,index);

        int pivot = partitionHoare(array,left,right);

        quick(array,left,pivot-1);
        quick(array,pivot+1,right);
    }

    /**
     * 时间复杂度：O(N*logN) 【理想-》每次都是均分待排序序列】
     *          最慢：O(n^2) 数据有序或者逆序
     * 空间复杂度：
     *      最好：O(logN)
     *      最坏：O(N)  当N 足够大的时候 ，递归的深度就大
     * 稳定性：不稳定
     * @param array
     */
    public static void quickSort1(int[] array) {
        quick(array,0,array.length-1);
    }

    /**
     * 非递归实现 快速排序
     * @param array
     */
    public static void quickSort(int[] array) {
        Stack<Integer> stack = new Stack<>();
        int left = 0;
        int right = array.length-1;
        //三数取中：解决递归深度问题 基本上 有了三数取中  你的待排序序列 基本上每次都是二分N*logn
        int index = midNumIndex(array,left,right);
        swap(array,left,index);
        int pivot = partitionHole(array,left,right);
        if(pivot > left+1) {
            stack.push(left);
            stack.push(pivot - 1);
        }

        if(pivot < right-1) {
            stack.push(pivot + 1);
            stack.push(right);
        }

        while (!stack.empty()) {
            right = stack.pop();
            left = stack.pop();
            index = midNumIndex(array,left,right);
            swap(array,left,index);
            pivot = partition(array,left,right);
            if(pivot > left+1) {
                stack.push(left);
                stack.push(pivot - 1);
            }
            if(pivot < right-1) {
                stack.push(pivot + 1);
                stack.push(right);
            }
        }
    }


    private static void mergeSortFunc(int[] array,int left,int right) {

        if(left >= right) {
            return;
        }

        int mid = (left+right) / 2;
        //1、分解左边
        mergeSortFunc(array,left,mid);
        //2、分解右边
        mergeSortFunc(array,mid+1,right);
        //3、进行合并
        merge(array,left,right,mid);
    }



    /**
     * 时间复杂度：O(n*logn)
     * 空间复杂度：O(n)
     * 稳定性：稳定排序
     *   直接插入  冒泡  归并
     * @param array
     */
    public static void mergerSort1(int[] array) {
        mergeSortFunc(array,0,array.length-1);
    }

    public static void mergerSort(int[] array) {

        int gap = 1;//每组的数据

        while (gap < array.length) {

            for (int i = 0; i < array.length; i += gap*2 ) {
                //进入这个循环 i一定合法
                int s1 = i;
                int e1 = s1+gap-1;
                if(e1 >= array.length) {
                    e1 = array.length-1;
                }
                int s2 = e1+1;
                if(s2 >= array.length) {
                    s2 = array.length-1;
                }/**/
                int e2 = s2+gap-1;
                //int e2 = e1+gap;
                if(e2 >= array.length) {
                    e2 = array.length-1;
                }
                merge(array,s1,e2,e1);
            }
            gap *= 2;
        }
    }

    private static void merge(int[] array,int start,int end,
                              int midIndex) {






        int[] tmpArr = new int[end-start+1];
        int k = 0;//tmpArr数组的下标

        int s1 = start;
        int s2 = midIndex+1;

        //两个归并段 都有数据
        while (s1 <= midIndex && s2 <= end) {
            if(array[s1] <= array[s2]) {
                tmpArr[k++] = array[s1++];
            }else {
                tmpArr[k++] = array[s2++];
            }
        }

        //当走到这里的时候 说明 有个归并段 当中 没有了数据 ，拷贝另一半的全部 到tmpArr数组当中
        while (s1 <= midIndex) {
            tmpArr[k++] = array[s1++];
        }

        while (s2 <= end) {
            tmpArr[k++] = array[s2++];
        }
        //把排好序的数字  拷贝回 原数组
        for (int i = 0; i < k; i++) {
            array[i+start] = tmpArr[i];
        }
    }


    /**
     * 时间复杂度：O(N+范围)
     * 空间复杂度：O(范围)
     * 稳定性：
     * 计数排序：适合 给定一个范围的数据 进行排序
     * @param array
     */
    /*
    * 三个for循环，第一个for求数组的最小和最大值
    * 然后创建数组
    * 第二个遍历数组，并计数
    * 第三个里面还有一个while
    * */
    public static void countSort(int[] array) {




        int maxVal = array[0];
        int minVal = array[0];

        for (int i = 0; i < array.length; i++) {
            if(array[i] < minVal) {
                minVal = array[i];
            }
            if(array[i] > maxVal) {
                maxVal = array[i];
            }
        }
        //就能确定当前数组的最大值 和 最小值
        int len = maxVal - minVal + 1;
        int[] count = new int[len];
        //开始遍历array数组 进行计数
        for (int i = 0; i < array.length; i++) {
            int val = array[i];
            count[val-minVal]++;

        }

        int index = 0;//array数组的下标
        for (int i = 0; i < count.length; i++) {
            //确保 当前count数组 可以检查完
            while (count[i] != 0) {
                array[index] = i+minVal;
                index++;
                count[i]--;
            }
        }
    }

}
