import java.io.*;

class Question9 {
    public static void main(String[] args)
            throws IOException
    {
        int i;
        FileOutputStream fout = new FileOutputStream("demo.txt",true);
        String st = "Hello World";

        char ch[] = st.toCharArray();
        for (i = 0; i < st.length(); i++) {
            fout.write(ch[i]);
        }
        fout.close();
    }
}