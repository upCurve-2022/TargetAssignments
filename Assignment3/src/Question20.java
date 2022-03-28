import java.util.Scanner;
public class Question20{
    public static void main(String args[]){
        String str;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string: ");
        str=s.nextLine();
        String replaceString=str.replace('a','$');
        System.out.println(replaceString);
    }}