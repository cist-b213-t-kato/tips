package shiren.sugimoto;

final class Gauge {
    protected int value;
    public void setValue(int v) {
        if (v < 0 || v > 999) {
            v = 0; //強制的に初期化
        }
        this.value = v;
    }
}
