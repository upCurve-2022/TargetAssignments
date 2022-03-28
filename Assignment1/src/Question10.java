import java.util.*;
public class Question10 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,num=0,digits;
        System.out.println("Enter any number");
        n=sc.nextInt();

        while(n!=0)
        {
            num = (num * 10) + (n % 10);
            n /= 10;
        }
        while(num !=0)
        {
            switch(num % 10)
            {
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.println("Four ");
                    break;
                case 5:
                    System.out.println("Five ");
                    break;
                case 6:
                    System.out.println("Six ");
                    break;
                case 7:
                    System.out.println("Seven ");
                    break;
                case 8:
                    System.out.println("Eight ");
                    break;
                case 9:
                    System.out.println("Nine ");
                    break;
            }

            num = num / 10;
        }


    }

}


