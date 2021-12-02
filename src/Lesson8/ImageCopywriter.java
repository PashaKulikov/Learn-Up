package Lesson8;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;


public class ImageCopywriter {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("you should enter arguments");
            return;
        }
        String pathToFile = args[0];
        String nameNewFile = args[1];


        try {
            File file = new File(pathToFile);
            BufferedImage source = ImageIO.read(file);

            File output = new File(nameNewFile);
            ImageIO.write(source,"jpg",output);
        } catch (IOException e) {
            System.out.println("File not found or could not be saved");
        }

    }
}