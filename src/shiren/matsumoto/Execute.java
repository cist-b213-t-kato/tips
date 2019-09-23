package shiren.matsumoto;

abstract class Execute {

        protected int value;

        public void setV(int value){
            this.value=value;
        }
        public abstract void execute();
}
