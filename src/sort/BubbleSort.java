package sort;

public class BubbleSort {

    public static void main(String[] args) {
        int[] as = {2, 5, 3, 9, 6, 7, 1, 4, 8};

        int tmp = 0;
        for (int i = 0; i < as.length; i++) {
            for (int j = 0; j < as.length - i - 1; j++) {
                if (as[j] > as[j + 1]) {
                    tmp = as[j];
                    as[j] = as[j + 1];
                    as[j + 1] = tmp;
                }
            }
        }

        for (int i : as) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

}
