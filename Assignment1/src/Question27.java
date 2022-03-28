import java.util.*;
public class Question27{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=n;
        int b=0,d;
        while(n>0){
            d=n%10;
            b=d*d*d+b;
            n=n/10;}
        if(a==b){
            System.out.println(" It is an amstrong number");}
        else
            System.out.println(" It is  not an amstrong number");}}

