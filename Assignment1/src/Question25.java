import java.util.Scanner;

class Question25
{
    public static void main(String args[])
    {
        String str, rev = "";
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a string:");
        str = s.nextLine();

        int length = str.length();

        for ( int i = length - 1; i >= 0; i-- )
            rev = rev + str.charAt(i);

        System.out.println("Reverse : "+rev);

    }
}
