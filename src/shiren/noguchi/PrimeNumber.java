package shiren.noguchi;

public class PrimeNumber extends Summary{
    @Override
    public void execute(){
        int i,j;
        for (i = 1;i<=30;i++){
            if (i!=1) {
                for (j = 2; j < i; j++) {
                    if (i % j == 0) {
                        System.out.println(i + "は素数ではありません");
                        break;
                    }
                }
                if (i == j) {
                    System.out.println(i + "は素数です");
                }
            }else {
                System.out.println(i + "は素数ではありません");
            }
        }
    }
}
