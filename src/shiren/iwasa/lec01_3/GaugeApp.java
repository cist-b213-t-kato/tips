package shiren.iwasa.lec01_3;

public class GaugeApp {
    public static void main(String... args){

        Gauge gauge = new Gauge();

        gauge.setValue(1000);
        gauge.setValue(10);
        gauge.setValue(-1);

        gauge.showValue();
    }
}