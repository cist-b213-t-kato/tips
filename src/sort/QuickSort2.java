package sort;

public class QuickSort2 {
    private static int[] data = { 11,23,35,68,33,3,24,66,47,42 };
    
    public static void main(String[] args){
        
        //doInput();
        doPrint();
        doSort(0, data.length-1);
        doPrint();
        
        
    }
    
    public static void doSort(int left, int right){
        System.out.println("====doSortStart========================");
                
        if(left >= right){
            return;
        }else{
            int pivot = right;
            int partition = division(left, right, pivot);
            doSort(left, partition-1);
            doSort(partition+1, right);
        }
        System.out.println("====doSortEnd========================");
    }
    
    public static int division(int left, int right, int pivot){
        System.out.println("====divisionStart========================");
        int partition = 0;
        int l = left;
        int r = right-1;
        int tmp;
        
        while(left <= right){
            System.out.println();
            while(data[r] >= data[pivot] && r > left){
                System.out.println("----rを左に一つ動かす--------");
                r--;
                doPrint(l, r, pivot);
            }
            while(data[l] <= data[pivot] && l < right){
                System.out.println("----lを右に一つ動かす--------");
                l++;
                doPrint(l, r, pivot);
            }
            if(l >= r){
                System.out.println("----lとrが交差したのでbreak--------");
                break;
            }
            System.out.println("**** "+data[l]+"と"+data[r]+"を入れ替える ****");
            tmp = data[l];
            data[l] = data[r];
            data[r] = tmp;
            doPrint(l, r, pivot);
        }
        tmp = data[l];
        data[l] = data[pivot];
        data[right] = tmp;
        partition = l;
        doPrint(l, r, pivot);
        System.out.println("====divisionEnd========================");
        return partition;
    }
    
    public static void doPrint(){
        for(int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
    
    public static void doPrint(int l, int r, int p){
        for(int i=0; i<data.length; i++){
            if(i==l){
                System.out.print("[l:"+data[i]+"] ");
            }else if(i==r){
                System.out.print("[r:"+data[i]+"] ");
            }else if(i==p){
                System.out.print("[p:"+data[i]+"] ");
            }else{
                System.out.print(data[i]+" ");
            }
        }
        System.out.println();
    }
    
    public static void doInput(){
        for(int i=0; i<data.length; i++){
            data[i] = (int)(100*Math.random());
        }
    }
    
    
}
