package rpg;



class Status {
    private int value;

    public Status(int value){
        this.setValue(value);
    }
    
    public void setValue(int value) {
//        if(value<0 || value>999){
//            throw new IllegalArgumentException();
//        }
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    
}


