import java.io.*;
import java.util.*;
public class EvenNumber {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        number=sc.nextInt();
        boolean output=isEven(number);
        System.out.println(output);
    }
    public static boolean isEven ( int number)
    {
        if(number%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}