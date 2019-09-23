package shiren.matsumoto;

public class Prime_Number extends Execute {

    private int first_number;
    private int number;
    //素数判定用
    private int judge;

    Gauge gauge = new Gauge();

    public Prime_Number(int value){
        gauge.setValue(value);
    }

    public void execute(){

        first_number=gauge.getValue();

        for( number=gauge.getValue();number<first_number+30;number++) {
            if(number==1){
                //何もしない
            }
            //2の時出力
            else if (number== 2) {
                System.out.println(number);
            } else {
                //2より大きい自然数判定
                for (int i = 2; i < number; i++) {
                    if (number % i == 0) {
                        judge = 0;
                        break;
                    } else {
                        judge = 1;
                    }
                }
                //判定出力
                if (judge == 0) {
                    //何もしない
                } else {
                    System.out.println(number);
                }
            }
        }
    }
}
