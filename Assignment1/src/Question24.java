import java.util.*;
public class Question24{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter base");
        int X=s.nextInt();
        System.out.println("Enter power");
        int N=s.nextInt();
        int a=1;
        while(N>0){
            a=a*X;
            N--;
        }
        System.out.println(a);
    }
}
