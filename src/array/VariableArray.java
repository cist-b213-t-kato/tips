package array;

public class VariableArray <T> {
  
  public static void main(String[] args){
    VariableArray<Integer> vArray = new VariableArray<>();
    
    vArray.add(10);
    
  }
  
  private Object[] array;
  private int size;
  
  public VariableArray(){
    array = new Object[10];
    size = 0;
  }
  
  public T get(int i){
    return (T) array[i];
  }
  
  protected void set(int i, T value){
    array[i] = value;
  }  
  
  public void add(T value){
    if(size==array.length){
      Object[] newArray;
      newArray = new Object[array.length + array.length/2];
      System.arraycopy(array, 0, newArray, 0, array.length);
      array = newArray;
    }
    array[size] = value;
    ++size;
  }
  
  public int size(){
    return size;
  }
  
  public void increaseSize(){
    Object[] newArray;
    newArray = new Object[array.length + array.length/2];
    System.arraycopy(array, 0, newArray, 0, array.length);
  }
  
}
