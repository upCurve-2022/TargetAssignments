import java.util.Scanner;

public class Question4B
{
    public static void main(String[] args)
    {
        int a, b, c, temp;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the First Number: ");
        a = s.nextInt();
        System.out.print("Enter the Second Number: ");
        b = s.nextInt();
        System.out.print("Enter the Third Number: ");
        c = s.nextInt();

        temp = a;
        a = b;
        b = c;
        c = temp;

        System.out.println("\na = " +a);
        System.out.println("b = " +b);
        System.out.println("c = " +c);
    }
}
