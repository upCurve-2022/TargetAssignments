import java.util.*;
public class Question19
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        // Create Stack object
        Stack<Integer> stack = new Stack<Integer>();

        // User input
        System.out.println("Enter decimal number: ");
        int num = s.nextInt();

        while (num != 0)
        {
            int d = num % 2;
            stack.push(d);
            num /= 2;
        }

        System.out.print("\nBinary representation is:");
        while (!(stack.isEmpty() ))
        {
            System.out.print(stack.pop());
        }
        System.out.println();
    }
}
