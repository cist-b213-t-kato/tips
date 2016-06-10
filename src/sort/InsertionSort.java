package sort;

public class InsertionSort implements IntegerSort {

    public static void main(String[] args) {

        int[] as = {8, 4, 3, 7, 6, 2, 5, 1};
        
        IntegerSort sort = new InsertionSort();
        
        sort.sort(as);

        for (int i : as) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    public void sort(int as[]) {
        for (int i = 1; i < as.length; i++) {
            if (as[i] < as[i-1]) {
                int tmp = as[i];
                int j = i;
                do {
                    as[j] = as[j-1];
                    j--;
                } while (j != 0 && tmp < as[j - 1]);
                as[j] = tmp;
            }
        }
    }

    /*冗長なコード*/
    public static void method1(int as[]) {
        int tmp = 0;
        int i, j, k;
        for (i = 1; i < as.length; i++) {
            for (j = i - 1; j >= 0; j--) {
                if (as[i] > as[j]) {
                    break;
                }
            }
            tmp = as[i];
            for (k = i; k > j + 1; k--) {
                as[k] = as[k - 1];
            }
            as[k] = tmp;
        }

    }

}
