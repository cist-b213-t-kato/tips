package shiren.matsumoto;

public class FizzBuzz extends Execute {
    Gauge gauge = new Gauge();
    private int number;
    private int first_number;

    public FizzBuzz(int value){
        gauge.setValue(value);
    }



    public void execute() {
        //3で割り切れるときはFizz,5で割り切れるときはBuzz, どちらでも割り切れるときはFizzBuzz

        first_number = gauge.getValue();

        for (number = gauge.getValue(); number < first_number + 30; number++) {
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (number % 3 == 0) {
                System.out.println("Fizz");
            } else if (number % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(number);
            }
        }
    }
}