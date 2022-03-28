import java.util.Scanner;
public class Question6 {
    public static void main(String[] args) {
        Scanner s= new Scanner (System.in);
        double n=s.nextDouble();
        String nToString = String.valueOf(n);
        int indexOfDecimal = nToString.indexOf(".");
        System.out.println(nToString.substring(0, indexOfDecimal)+" "+ nToString.substring(indexOfDecimal+1));
    }

}
