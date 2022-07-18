import java.util.Arrays;

public class TestHeap {
    public int[] elem = new int[10];
    public int usedSize = 0;

    public TestHeap() {
    }

    public void initArray(int[] array) {
        this.elem = Arrays.copyOf(array, array.length);
        this.usedSize = this.elem.length;
    }

    public void createHeap() {
        for(int parent = (this.usedSize - 1 - 1) / 2; parent >= 0; --parent) {
            this.shiftDown(parent, this.usedSize);
        }

    }

    private void shiftDown(int parent, int len) {
        for(int child = 2 * parent + 1; child < len; child = 2 * child + 1) {
            if (child + 1 < len && this.elem[child] < this.elem[child + 1]) {
                ++child;
            }

            if (this.elem[child] <= this.elem[parent]) {
                break;
            }

            this.swap(this.elem, child, parent);
            parent = child;
        }

    }

    private void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public void offer(int x) {
        if (this.isFull()) {
            this.elem = Arrays.copyOf(this.elem, this.elem.length * 2);
        }

        this.elem[this.usedSize] = x;
        ++this.usedSize;
        this.shiftUp(this.usedSize - 1);
    }

    private void shiftUp(int child) {
        for(int parent = (child - 1) / 2; child > 0 && this.elem[child] > this.elem[parent]; parent = (parent - 1) / 2) {
            this.swap(this.elem, child, parent);
            child = parent;
        }

    }

    public boolean isFull() {
        return this.usedSize == this.elem.length;
    }

    public int poll() {
        if (this.isEmpty()) {
            return -1;
        } else {
            int old = this.elem[0];
            this.swap(this.elem, 0, this.usedSize - 1);
            --this.usedSize;
            this.shiftDown(0, this.usedSize);
            return old;
        }
    }

    public boolean isEmpty() {
        return this.usedSize == 0;
    }

    public void heapSort() {
        for(int end = this.usedSize - 1; end > 0; --end) {
            this.swap(this.elem, 0, end);
            this.shiftDown(0, end);
        }

    }
}



