import java.util.Scanner;
public class Question9 {
    public static void main(String[] args) {
        int num, rem, rev=0, temp;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number:");
        num=s.nextInt();
        if(num%10==0)
            System.out.print(0);
        temp=num;
        while(num!=0)
        {
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println(rev);
    }
}




