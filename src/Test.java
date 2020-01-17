import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String string = "234234";

        int integerString = 0;
        boolean temp;
        temp = checkString(string);
        if (temp) {
            integerString = Integer.parseInt(string);
        }
        System.out.println(integerString);

    }

    public static boolean checkString(String string) {
        try {
            Integer.parseInt(string);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
