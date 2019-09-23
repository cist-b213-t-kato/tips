package shiren.noguchi;

public final class Gauge {
    private double value;

    public void setValue(double value){
        if ( 0 <= value && value <= 999){
            this.value = value;
        }
    }

    public double getValie(){
        return this.value;
    }
}
