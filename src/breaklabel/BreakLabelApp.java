package breaklabel;

public class BreakLabelApp {
    
    public static void main(String[] args){
        
        here:
        while(true){
            while(true){
                System.out.println("こ↑こ↓");
                break here;
            }
        }
        
    }
}
