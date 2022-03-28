import java.util.Scanner;

public class Question5
{
    public static void main(String[] args)
    {
        int n;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        n = s.nextInt();

        if(n%2==0)
            System.out.println(n+" is an even number");
        else
            System.out.println(n+" is a odd number");

    }
}
