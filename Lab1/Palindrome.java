
import java.util.Scanner;
import java.util.Scanner;
public class Palindrome {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String Strings = console.nextLine();
        String s = reverseString(Strings);
        System.out.println(isPalindrome(s));
        if (isPalindrome(s)==true)
        {
            System.out.println("is polidrome");
        } else System.out.println("no polidrom");
    }

    public static String reverseString(String Strings)
    {
        String a = "";
        for (int i = 0; i < Strings.length(); i++)
        {
            a = Strings.charAt(i) + a;
        }
        return a;
    }

    public static boolean isPalindrome(String s)
    {
        String str = "";
        for (int i = 0; i < s.length(); i++)
        {
            str = s.charAt(i) + str;
        }
        return str.equals(s);
    }
}
