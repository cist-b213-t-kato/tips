package shiren.kusunoki;

public class FizzBuzz extends Execute {

    private int max;
    public FizzBuzz(int i) {
        Gauge gauge=new Gauge(i);
        max=gauge.getValue();
    }

    //1からmaxまで３と５の倍数をFizzBuzz,3の倍数はFizz,5の倍数はBuzzそれ以外数字を表示
    public void execute(){
        for (int i=1;i<=max;i++){
            if(i%3==0&&i%5==0){
                System.out.println("FizzBuzz");
            }else if(i%3==0){
                System.out.println("Fizz");
            }else if(i%5==0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }

}
