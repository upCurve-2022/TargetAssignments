import java.util.Scanner;
public class Question3
{
    public static void main(String args[])
    {
        float p, r, t, simpleInterest;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Principal : ");
        p = s.nextFloat();
        System.out.print("Enter the Rate of interest : ");
        r = s.nextFloat();
        System.out.print("Enter the Time period : ");
        t = s.nextFloat();

        simpleInterest = (p * r * t) / 100;
        System.out.print("Simple Interest is: " +simpleInterest);
    }
}