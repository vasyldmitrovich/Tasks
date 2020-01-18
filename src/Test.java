import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String string = "234234";
        /*Check for integer variable*/
        int integerString = 0;
        boolean temp;
        temp = checkString(string);
        if (temp) {
            integerString = Integer.parseInt(string);
        }
        System.out.println(integerString);
        /*Swap variables*/
        int a = 7;
        int b = 10;
        System.out.println("this is a: "+a+"\nthis is b: "+b);
        a=a+b-(b=a);
        System.out.println("this is a: "+a+"\nthis is b: "+b);
        /*Напишите программу, которая выводит на экран числа от 1 до 100.
        При этом вместо чисел, кратных трем, программа должна выводить слово Fizz,
        а вместо чисел, кратных пяти — слово Buzz.
        Если число кратно пятнадцати, то программа должна выводить слово FizzBuzz.*/

        for (int i = 1; i < 101; i++) {
            boolean boolThree = i%3==0;
            boolean boolFive = i%5==0;
            String iterator = String.valueOf(i);
            String fizz = "Fizz";
            String bizz = "Bizz";
            if (i%3!=0) fizz = ""; else iterator = "";
            if (i%5!=0) bizz = ""; else iterator = "";
                System.out.println(iterator+fizz+bizz);

        }
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
