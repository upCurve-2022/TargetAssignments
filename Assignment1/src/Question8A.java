import java.util.Scanner;
public class Question8A {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=s.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2==1)
                sum=sum+i;
        }
        System.out.println("Sum of odd numbers from 1 to "+n+" is "+sum);
    }
}
