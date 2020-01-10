import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String string = "Hello upper";
        System.out.println(string);
        string = string.substring(1,6).toUpperCase();
        System.out.println(string);
    }
}
