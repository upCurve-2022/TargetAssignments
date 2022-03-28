import java.util.Scanner;
class Question3
{
    public static void main(String args[])
    {
        double  dis,amount,pencost,s,p;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter pencost ");
        pencost=sc.nextDouble();
        System.out.println("Enter discount percentage ");
        dis=sc.nextDouble();
        s=100-dis;
        amount= (s*pencost)/100;
        System.out.println("Amount after discount="+amount);
        p=pencost*dis/100;
        System.out.println("Selling price of pen is"+p);
    }
}
