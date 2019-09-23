package shiren.iwasa.lec01_3;

final class Gauge {

    private int value;

    public void setValue(int value) {
        if (value >= 0 && value <= 999) {
            this.value = value;
        } else {
            System.out.println("不正な値です");
        }
    }

    void showValue() {
        System.out.println(value);
    }
}