package Lesson8;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopywriter2 {
    public static void main(String[] args) {


        if (args.length == 0) {
            System.out.println("you should enter arguments");
            return;
        }
        String pathToFile = args[0];
        String nameNewFile = args[1];



        try(FileInputStream fin=new FileInputStream(pathToFile);
            FileOutputStream fos=new FileOutputStream(nameNewFile))
        {
            byte[] buffer = new byte[fin.available()];

            fin.read(buffer, 0, buffer.length);

            fos.write(buffer, 0, buffer.length);
        }
        catch(IOException ex){

            System.out.println("File not found or could not be saved");
        }
    }
}