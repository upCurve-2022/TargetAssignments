import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        int a, b, c, max1, max2;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the First Number: ");
        a = s.nextInt();
        System.out.print("Enter the Second Number: ");
        b = s.nextInt();
        System.out.print("Enter the Third Number: ");
        c = s.nextInt();

        if(a>=b && a>=c){
            max1=a;
            if(b>c)
                max2=b;
            else
                max2=c;
        }

        else if(b>=c && b>=a){
            max1=b;
            if(a>=c)
                max2=a;
            else
                max2=c;
        }

        else{
            max1=c;
            if(b>=a)
                max2=b;
            else
                max2=a;
        }

        System.out.println("Largest number: "+max1);
        System.out.println("Second Largest number: "+max2);

    }
}
