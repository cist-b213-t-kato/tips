package designpattern.capsule;

public class App {
    public static void main(String... args) {
        Gauge gauge = new Gauge();

        gauge.set(100);
        System.out.println(gauge.get());

        gauge.set(1000);
        System.out.println(gauge.get());

        gauge.set(-200);
        System.out.println(gauge.get());

        gauge.set(300);
        System.out.println(gauge.get());

    }
}
