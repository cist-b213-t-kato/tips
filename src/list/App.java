package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author tkato213
 */
public class App {
    public static void main(String... args) {

        List<String> list1 = Arrays.asList("タヌキ", "ネコ", "トラ", "キツネ");
        List<String> list2 = Arrays.asList("ネコ", "トラ").stream().sorted().collect(Collectors.toList());
        List<String> list3 = Arrays.asList("トラ", "ネコ").stream().sorted().collect(Collectors.toList());

        System.out.println(list3.equals(list2));

    }
}
