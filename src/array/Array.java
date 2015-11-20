package array;

/**
 *
 * @author b2130480
 */
public class Array <T>{
  private VariableArray vArray;
  
  public Array(){
    vArray = new VariableArray<T>();
  }
  
  /*
  private Integer[] array;
  private int s = 0;
  public Array(int n){
      array = new Integer[n];
  }
  public void add(int a){
      for(int i=0; i<array.length; i++){
          if(array.length<=i){
              break;
          }else if(array[i]==null){
              array[i] = a;
              ++s;
              break;
          }
      }
  }

  public int size(){
      return s;
  }

  public Integer get(int i){
      return array[i];
  }

  public Integer[] getArray(){
      Integer[] a = new Integer[size()];
      for(int i=0; i<size(); i++){
          a[i] = get(i);
      }
      return a;
  }
  */
}