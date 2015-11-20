package prime_number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;



public class PNApp2 {
        
        public static ArrayList<Integer> array = new ArrayList<>();
	public static void main(String[] args) throws IOException{
            
            System.out.println("入力してね///");
            
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String buf = br.readLine();
            int n = Integer.parseInt(buf);
  
            calcPN(n);
            showArray(array);
            
            //showPN();
	}
        
        public static void showArray(ArrayList<Integer> array){
            int count=0;
            BubbleSort.sort(array);
            for(int i=0; i<array.size(); ++i){
                System.out.print(array.get(i) + " ");
                if((++count)%20==0){
                        System.out.println();
                }
            }         
        }
        
        public static void calcPN(int n){
            for(int i=0; i<n; i++){
                if(isPN(i)){
                    array.add(i);
                }
            }
        }

	public static boolean isPN(int i){
            
            for(int j=2; j<=i/2; ++j){
                if(i%j==0){
                    return false;
                }
            }
            return i<2?false:true;
            
	}
}
