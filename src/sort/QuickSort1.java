package sort;

public class QuickSort1 {
    private static int N = 10;
    private static int[] data = new int[N];
    
    public static void main(String[] args){
        
        doInput();
        doPrint();
        doSort(0, data.length-1);
        doPrint();
        
        
    }
    
    public static void doInput(){
        for(int i=0; i<N; i++){
            data[i] = (int)(100*Math.random());
        }
    }
    
    public static void doPrint(){
        for(int i=0; i<N; i++){
            System.out.print(data[i]+", ");
        }
        System.out.println();
    }
    
    public static void doSort(int left, int right){
        int pivot;
        int partition;
                
        if(left >= right){
            return;
        }else{
            pivot = data[right];
            partition = division(left, right, pivot);
            doSort(left, partition-1);
            doSort(partition+1, right);
        }
    }
    
    public static int division(int left, int right, int pivot){
        int partition;
        int leftNumber;
        int rightNumber;
        int tmp;
        
        partition = 0;
        leftNumber = left;
        rightNumber = right-1;
        
        while(left <= right){
            while(data[rightNumber] >= pivot && rightNumber > left){
                rightNumber--;
            }
            while(data[leftNumber] <= pivot && leftNumber < right){
                leftNumber++;
            }
            if(leftNumber >= rightNumber){
                break;
            }
            tmp = data[leftNumber];
            data[leftNumber] = data[rightNumber];
            data[rightNumber] = tmp;
            doPrint();
        }
        tmp = data[leftNumber];
        data[leftNumber] = pivot;
        data[right] = tmp;
        partition = leftNumber;
        doPrint();
        return partition;
    }
    
    
}
