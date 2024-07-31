/*
 File handling is process to read and write contents of file using different inbuilt classes
 In java to perform file handling we use import java.io package.

1) FileInputStream -It is used to read data of file.
2)FileOutputStream-It is used to write data in file. 
 */

import java.io.*;

public class FileHandling {
    public static void main(String[] args) {
        try {
        FileInputStream fin =new FileInputStream("D://basic.c"); 
        int i=0;
        while((i=fin.read())!=-1)
        {
           System.out.print((char)i);
        }
    } catch (Exception e) {
        System.out.println(e);
    }
    }
}
