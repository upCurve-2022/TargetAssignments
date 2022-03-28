import java.util.*;
public class Question14{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        int a=1,b=4,c=7,d;
        System.out.println("Enter a number");
        int n=s.nextInt();
        System.out.print(a+" "+b+" "+c+" ");
        for(int i=3;i<n;i++){
            d=a+b+c;
            System.out.print(d+" ");
            a=b;
            b=c;
            c=d;
        }
    }
}