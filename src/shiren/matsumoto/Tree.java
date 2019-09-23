package shiren.matsumoto;

public class Tree extends Execute {

    private int number;
    private int first_number;
    private String leaf="*";

    Gauge gauge = new Gauge();

    public Tree(int value){
        gauge.setValue(value);
    }



    public void execute() {

        first_number = gauge.getValue();

        for (number = gauge.getValue(); number < first_number + 30; number++) {
            //上の葉の部分
            if (number <= 10) {
                for (int i = 0; i <= first_number + 19 - number; i++) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= number * 2 - 1; j++) {
                    System.out.print(leaf);
                }
            }
            //真ん中の葉の部分
            else if (number >= 11 && number <= 20) {
                for (int i = 0; i <= first_number + 19 - number; i++) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= number * 2 - 1; j++) {
                    System.out.print(leaf);
                }
            }
            //幹の部分
            else if (number >= 21 && number <= 30) {
                for(int k=0;k<=14;k++){
                    System.out.print(" ");
                }
                for (int k2=0;k2<=10;k2++) {
                    System.out.print(leaf);
                }
            }
            System.out.println("");
        }
    }
}
