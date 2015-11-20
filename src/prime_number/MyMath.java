package prime_number;

public class MyMath {

    public static void main(String[] args) {
        int count = 0;
        int i = 1;
        for (; (++i) > 0;) {
            if (MyMath.isPN(i)) {
                ++count;
                /*
                 System.out.print(i + " ");
                 if(count%20==0){
                 System.out.println();
                 }
                 */
                if (count == 1000000) {
                    System.out.println(i);
                    break;
                }
            }
        }

    }

    public static boolean isPN(int number) {
        if (number == 2 || number == 3 || number == 5) {
            return true;
        }
        if (!(number % 6 == 1 || number % 6 == 5)) {
            return false;
        }
        if (number % 5 == 0) {
            return false;
        }
        for (int i = 1; i <= number / 6; ++i) {
            if (6 * i + 1 > Math.sqrt(number)) {
                return true;
            }
            if (number % (6 * i + 1) == 0 || number % (6 * i + 5) == 0) {
                return false;
            }
        }
        if (number == 1) {
            return false;
        }
        return true;
    }

}
