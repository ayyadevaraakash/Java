// MAX HEAP Implementation
// Can be converted to MIN HEAP by changing certain relational operators

class Heap {
    int[] values;
    int size;
    int capacity;

    Heap(int capacity) {
        this.values = new int[capacity];
        this.size = 0;
        this.capacity = capacity;
    }

    void swap(int i, int j) {
        int temp = values[i];
        values[i] = values[j];
        values[j] = temp;
    }

    void insert(int data) {

        // Element added at the end position
        int curIndex = size;
        values[curIndex] = data;
        size++;

        // Move it to its correct position
        while (curIndex > 0) {
            int parent = (curIndex - 1) >> 1;
            if (values[parent] > values[curIndex])
                break;
            swap(curIndex, parent);
            curIndex = parent;
        }
    }

    void delete() {

        // Copy last node to the root node
        values[0] = values[size - 1];
        size--;

        // Move the root node and all nodes to appropriate position
        int curIndex = 0;

        while (curIndex < size) {
            int leftChild = 2 * curIndex + 1;
            int rightChild = 2 * curIndex + 2;
            int larger = curIndex;

            if (leftChild < size && values[leftChild] > values[larger]) {
                larger = leftChild;
            }

            if (rightChild < size && values[rightChild] > values[larger]) {
                larger = rightChild;
            }

            if (larger == curIndex)
                break;
            swap(curIndex, larger);
            curIndex = larger;
        }
    }

    void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(values[i] + " ");
        }
        System.out.println();
    }
}

public class HeapImp {
    public static void main(String[] args) {
        Heap h = new Heap(10);
        h.insert(60);
        h.print();

        h.insert(80);
        h.print();

        h.insert(70);
        h.print();

        h.insert(54);
        h.insert(57);
        h.insert(67);
        h.print();

        h.delete();
        h.print();

        h.delete();
        h.print();

        h.delete();
        h.print();
    }
}
