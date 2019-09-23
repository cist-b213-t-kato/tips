package shiren.sugimoto;

public class prime extends Keisan {

    @Override
    void execute() {
        int count = 0;
        boolean result;

        for (int i = 2; i < 30; i++) {
            result = true; //素数と仮定

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    result = false;
                    break;
                }
            }
            if (result) {
                System.out.println(i);
            }
        }
    }
}
