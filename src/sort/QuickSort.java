package sort;

public class QuickSort {
    private static int[] data = { 11,23,35,68,33,3,24,66,47,42 };
    
    public static void main(String[] args){
        doPrint();
        doSort(0, data.length-1);
        doPrint();
    }
    
    public static void doSort(int left, int right){
        if(left < right){
            int pivot = right;
            int partition = division(left, right, pivot);
            doSort(left, partition-1);
            doSort(partition+1, right);
        }
    }
    
    public static int division(int left, int right, int pivot){
        int l = left;
        int r = right-1;
        
        while(true){
            while(data[r] >= data[pivot] && r > left){
                r--;
            }
            while(data[l] <= data[pivot] && l < right){
                l++;
            }
            if(l >= r){
                break;
            }
            swap(l, r);
        }
        swap(l, pivot);
        return l;
    }
    
    public static void swap(int a, int b){
    	int tmp = data[a];
    	data[a] = data[b];
    	data[b] = tmp;
    }
    
    public static void doPrint(){
        for(int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
    
    public static void doPrint(int l, int r, int p){
        for(int i=0; i<data.length; i++){
            if(data[i]==l){
                System.out.print("[l:"+data[i]+"] ");
            }else if(data[i]==r){
                System.out.print("[r:"+data[i]+"] ");
            }else if(data[i]==p){
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
