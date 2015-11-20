package list;

public class Link <T> {
  
  private Object data;
  private Link next;

  public T getData() {
    return (T)data;
  }

  public Link getNext() {
    return next;
  }

  public void setData(T data) {
    this.data = data;
  }

  public void setNext(Link next) {
    this.next = next;
  }
  
}
