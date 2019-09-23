package shiren.noguchi;

public class Tree extends Summary {
    @Override
    public void execute(){
        for (int i=0;i<5;i++){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
