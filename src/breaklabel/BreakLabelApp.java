package breaklabel;

public class BreakLabelApp {
    
    public static void main(String[] args){
        
        
        here:
        for(;;){
            for(;;){
                System.out.println("こ↑こ↓");
                break here;
            }
        }
        
        
        
    }
    
}
