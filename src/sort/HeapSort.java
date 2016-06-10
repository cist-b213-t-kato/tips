package sort;

public class HeapSort {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // ２分木
        //                           10(0)
        //                    /                \
        //                6(1)                   18(2)
        //            /       \                 /       \
        //        3(3)        8(4)          15(5)         20(6)
        //       /    \      /    \        /     \        /     \
        //  1(7)   5(8)  36(9)   22(10) 19(11)  120(12)  117(13) 29(14)

//        int n = 15;
//        int[] heapTree = new int[n];
//        System.out.println("要素数：" + n);
//
//        heapTree[0] = 10;
//        heapTree[1] = 6;
//        heapTree[2] = 18;
//        heapTree[3] = 3;
//        heapTree[4] = 8;
//        heapTree[5] = 15;
//        heapTree[6] = 20;
//        heapTree[7] = 1;
//        heapTree[8] = 5;
//        heapTree[9] = 36;
//        heapTree[10] = 22;
//        heapTree[11] = 19;
//        heapTree[12] = 120;
//        heapTree[13] = 117;
//        heapTree[14] = 29;
        
        int[] heapTree = { 10, 6, 18, 3, 8, 15, 20, 1 };

//        print(heapTree);
//        sort(heapTree);
//        print(heapTree);
        
        print(heapTree);
//        heap(heapTree, 10);
        sort(heapTree);
        print(heapTree);
        
    }

    //
    public static void sort(int[] heapTree) {
        for (int n = heapTree.length-1; n >= 1; n--) {
            heap(heapTree, n);
            swap(heapTree, 0, n);
        }
    }

    //0~mまでをヒープ化する
    public static void heap(int[] heapTree, int m) {
        
//        //0~mまでをヒープ化する
//        for (int i = (m - 1) / 2; i >= 0; i--) {
//            downHeap(heapTree, i, m - 1);
//        }
        for (int i = m / 2; i >= 0; i--) {
            downHeap(heapTree, i, m);
        }
    }

    //
    public static void swap(int[] heapTree, int a, int b) {
        int tmp = heapTree[a];
        heapTree[a] = heapTree[b];
        heapTree[b] = tmp;

    }

    private static void print(int[] heapTree) {
        System.out.println("===============================");
        for (int i = 0; i < heapTree.length; i++) {
            System.out.print("x[" + i + "] = " + heapTree[i]);
            if (i < (heapTree.length - 1) / 2) {
                int childLeft = i * 2 + 1; // 左の子
                int childRight = childLeft + 1; // 右の子
                System.out.print(", 左の子 x[" + childLeft + "] = " + heapTree[childLeft]);
                System.out.print(", 右の子 x[" + childRight + "] = " + heapTree[childRight]);
                System.out.print(", 親が一番大きい？ : " + (heapTree[i] >= heapTree[childLeft] && heapTree[i] >= heapTree[childRight]));
            }
            System.out.println();
        }
        System.out.println("===============================");
    }

    //--- a[left]〜a[right]をヒープ化 ---//
    static void downHeap(int[] heapTree, int rootIndex, int lastIndex) {
        // heapTree：配列
        // rootIndex：根となるインデックス
        // lastIndex：一番後ろのインデックス

        int tmp = heapTree[rootIndex]; // 根の値
        int child; // 大きい方の子のインデックス
        int parent = rootIndex; // 親のインデックス

        while (parent < (lastIndex + 1) / 2) {
            System.out.println("parent:" + parent + ", root:" + rootIndex + ", n:" + lastIndex);
            int childLeft = parent * 2 + 1; // 左の子
            int childRight = childLeft + 1; // 右の子
            if (childRight <= lastIndex && heapTree[childRight] > heapTree[childLeft]) {
                child = childRight;
            } else {
                child = childLeft;
            }
            System.out.println("childLeft:" + childLeft
                    + ", childRight:" + childRight
                    + ", child " + child
                    + ", parent:" + parent
                    + ", tmp:" + tmp);
            if (tmp >= heapTree[child]) {
                System.out.println("ループを抜けます");
                break;
            }
            heapTree[parent] = heapTree[child];
            parent = child;
        }
        heapTree[parent] = tmp;
    }
}
