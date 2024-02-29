package Code_with_Harry.Basics;
import java.util.*;

public class Sum //for classes we use PascalConvention. For variable --> camelCaseConvention
{
    public static void main(String[] args)
    {
        System.out.println("Enter the number a");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the number b");
        int b = sc.nextInt();
        System.out.println(a+b);

    }
}
