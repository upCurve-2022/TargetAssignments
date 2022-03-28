import java.util.*;
public class Question2{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int height,radius;
        System.out.println("Enter height");
        height=sc.nextInt();

        System.out.println("Enter radius");
        radius=sc.nextInt();



        double pie=3.14;
        double volume=pie*(radius*radius)*height;
        System.out.println("Volume of the cylinder="+volume);
    }
}
