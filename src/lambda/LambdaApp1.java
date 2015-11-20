package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class LambdaApp1 {
  public static void main(String[] args){

      List<Integer> list = new ArrayList<>();
      
      list.add(65);
      list.add(53);
      list.add(81);
      
      Predicate<Integer> pre1 = e->e<60;
      Predicate<Integer> pre2 = e->e<70;
      Predicate<Integer> pre3 = e->e<80;
      Predicate<Integer> pre4 = e->e<90;
      
      list.stream()
              .filter(pre1)
              .map(t->t+"不可")
              .forEach(System.out::println);
      
  }
  
}
