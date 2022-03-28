import java.util.Scanner;
public class Question23 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,startEven=-2,startOdd=1;
        System.out.println("Enter any number: ");
        n=s.nextInt();
        System.out.print(startOdd+" ");
        System.out.print(startEven+" ");
        for(int i=3;i<=n;i++)
        {
            if(i%2==1)
            {
                //System.out.println(1);
                startOdd=startOdd+3;
                System.out.print(startOdd+" ");

            }
            else
            {

                startEven=startEven-4;
                System.out.print(startEven+" ");
            }


        }
    }


}

