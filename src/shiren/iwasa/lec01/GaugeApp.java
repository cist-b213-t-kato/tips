package shiren.iwasa.lec01;

public class GaugeApp {
    public static void main(String... args){

        Gauge gauge = new Gauge(){
            @Override
            void showValue() {
                System.out.println(value);
            }
        };

        gauge.value = 10000000;
        gauge.showValue();
    }
}