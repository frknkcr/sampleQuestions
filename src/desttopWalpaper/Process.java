package desttopWalpaper;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Process {
    Scanner scan = new Scanner(System.in);
   public void menu() {


       System.out.println("=======İŞLEMLER======\n" +
               "1-Ekran görüntüsü al\n" +
               "2-Duvar kağıdı değiştir\n"+
               "3-Yeniden başlat\n"+
               "  İşlem secin : ");


       try {
           int secim = scan.nextInt();

           if (secim == 1) {
               screenCapture();
           } else if (secim == 2) {
               wallpaperChanger();
           } else if (secim == 3) {
               restart();
           } else {
               System.out.println("Gecersiz secim");
               menu();
           }
       }catch (Exception e){
           System.out.println("Sistem hatası");
           menu();
       }
   }

    private void restart() {

        try {
            Runtime.getRuntime().exec("shutdown /r");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void screenCapture() throws IOException, AWTException {

        Rectangle ekran = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        Robot robot = new Robot();
        BufferedImage image = robot.createScreenCapture(ekran);
        ImageIO.write(image, "png", new File("C:\\Users\\Frknk\\Desktop\\screen.png"));
    }

    void wallpaperChanger() throws IOException {

        System.out.println("Dosya yolunu girin");
        String dosyaYolu = scan.next();
        File file = new File("F:\\İndirilenler\\314764.png");
        String absolutePath = file.getAbsolutePath();
        Runtime.getRuntime().exec("reg add \"HKCU\\Control Panel\\Desktop\" /v Wallpaper /t REG_SZ /d \"" + absolutePath + "\" /f");
        System.out.println("Geçerli değişikliklerin uygulanabilmesi için yeniden başlatmanı gerekiyor E/H");

        if (scan.next().equalsIgnoreCase("e")){
            restart();
        }else {
            menu();
        }
    }
}
