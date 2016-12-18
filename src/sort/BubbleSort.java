package sort;

import java.util.ArrayList;

public class BubbleSort {
    public static void sort(Integer[] as){
        for(int i=0; i<as.length; i++){
            for(int j=0; j<as.length-i-1; j++){
                if(as[j]<as[j+1]){
                    int tmp;
                    tmp = as[j];
                    as[j] = as[j+1];
                    as[j+1] = tmp;
                }
            }
        }
    }
    
    public static void sort(ArrayList<Integer> list){
        for(int i=0; i<list.size(); i++){
            for(int j=0; j<list.size()-i-1; j++){
                if(list.get(j)<list.get(j+1)){
                    int tmp;
                    tmp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, tmp);
                }
            }
        }
    }
    
    public static void main(String[] args){
        ArrayList<Integer> as = new ArrayList<>();
        as.add(5);
        as.add(2);
        as.add(4);
        as.add(8);
        sort(as);
        for(int i : as){
                System.out.print(i + " ");
        }
        System.out.println();

    }

}
