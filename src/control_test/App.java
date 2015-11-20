package control_test;

public class App {
    public static void main(String[] args){
        if(false) System.out.println("hoge");
        else if(true) System.out.println("piyo");
        else System.out.println("fuga");        
        
        if(false){
            System.out.println("hoge");
        }else if(true){
            System.out.println("piyo");
        }else{
            System.out.println("fuga");
        }
        
        
    }
}
