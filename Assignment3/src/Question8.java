
import java.io.File;
import java.io.BufferedReader;
import java.io.InputStreamReader;
  
public class Question8 {
    public static void main(String args[])
    {
        Question8 q8 = new Question8();
        q8.newFile();
    }

    public void newFile()
    {
        String strPath = "", strName = "";
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the file name:");
            strName = br.readLine();
            System.out.println("Enter the file path:");
            strPath = br.readLine();
            File file1= new File(strPath + "" + strName + ".txt");
            file1.createNewFile();
        }
        catch (Exception ex1) {
        }
    }
}