import java.io.*;
public class FileoutputStreamExample {
    public static void main(String[] args) {
        try{
            FileOutputStream fout=new FileOutputStream("D://shreyansh.txt");
            String names="Rushik, Shreyansh, Sayali,Saksham";
            byte b[]=names.getBytes();
            fout.write(b);
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
