import java.util.Scanner;
public class Question8B {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=s.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++)
        {
            if(i%2==0)
                sum=sum+i;
        }
        System.out.println("Sum of even numbers from 0 to "+n+" is "+sum);
    }
}
