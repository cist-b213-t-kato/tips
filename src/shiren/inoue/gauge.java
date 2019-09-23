package ordeal.inoue;

public final class gauge {
    private int value;
    gauge(int value){
        if(value<0&&value>999){
            value = 0;
        }
        this.value = value;
    }
    protected void setValue(int value){
        if(value<0&&value>999){
            value = 0;
        }
        this.value = value;
    }
    protected int getValue(){
        return this.value;
    }
}
