package sort;

public class BubbleSort implements IntegerSort {

    public static void main(String[] args) {
        int[] list = {2, 5, 3, 9, 6, 7, 1, 4, 8};
        
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

	@Override
	public void sort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length - i - 1; j++) {
                if (list[j] > list[j + 1]) {
                	int tmp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = tmp;
                }
            }
        }
	}

}
