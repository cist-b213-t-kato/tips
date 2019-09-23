package designpattern.singleton2;

public class App {
    public static void main(String... args) {

        God person1 = God.getInst();
        person1.name = "taro";

        God person2 = God.getInst();
        person2.name = "hanako";

        System.out.println(person1.name);
        System.out.println(person2.name);


    }
}
