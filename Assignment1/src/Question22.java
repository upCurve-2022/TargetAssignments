import java.util.*;
public class Question22{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        int a=0,b=1,c;
        System.out.println("Enter a number");
        int n=s.nextInt();
        System.out.print(a+" "+b+" ");
        for(int i=2;i<n;i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;

        }
    }
}

