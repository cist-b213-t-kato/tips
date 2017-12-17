import java.util.ArrayList;

public class Messages {

	private ArrayList<String> strList;

	public void getSumLength() {
    int sum = 0;
    for(int i = 0; i < strList.size(); i++) {
        String item = strList.get(i);
        sum = sum + item.length();
    }
    System.out.println(sum);
  }
}