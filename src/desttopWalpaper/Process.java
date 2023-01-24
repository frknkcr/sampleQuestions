package desttopWalpaper;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;


public class Process {
   public void Menu(){
        //Scanner scan = new Scanner(System.in);
        //System.out.println("Dosya yolunu girin");
        //String dosyaYolu = scan.next();
        Image image;
        try {
            image = ImageIO.read(new File("C:\\Users\\frknk\\Downloads\\sherry-christian-8Myh76_3M2U-unsplash.jpg"));
            apply(image);
        } catch (IOException e) {
            System.out.println("Dosya yolu yanlış");
        }

    }

    void apply(Image wallpaper) throws IOException {

        File file = new File("F:\\İndirilenler\\314764.png");
        String absolutePath = file.getAbsolutePath();
        Runtime.getRuntime().exec("reg add \"HKCU\\Control Panel\\Desktop\" /v Wallpaper /t REG_SZ /d \"" + absolutePath + "\" /f");

    }

    public static void main(String[] args){
        Process walpaper = new Process();
        walpaper.Menu();
    }
}
