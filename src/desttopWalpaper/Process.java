package desttopWalpaper;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Process {
    Scanner scan = new Scanner(System.in);
    static int sayac=0;
    public void menu() {

       System.out.println("=======İŞLEMLER======\n" +
               "  1-Ekran görüntüsü al\n" +
               "  2-Duvar kağıdı değiştir\n"+
               "  3-Yeniden başlat\n"+
               "  0-Çıkış\n"+
               "    İşlem secin : ");

       try {
           int secim = scan.nextInt();

           if (secim == 1) {
               screenCapture();
           } else if (secim == 2) {
               wallpaperChanger();
           } else if (secim == 3) {
               restart();
           }else if (secim == 0){
               System.out.println("Sistemden çıkılıyor");
               System.exit(0);
           } else {
               System.out.println("Gecersiz secim");
               menu();
           }
       }catch (Exception e){
           String secim = scan.nextLine();
           System.out.println("Sistem hatası");
           menu();
       }
   }

    private void restart() {

        try {
            Runtime.getRuntime().exec("shutdown -r -t 0");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void screenCapture() throws IOException, AWTException {

        Rectangle ekran = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        Robot robot = new Robot();
        BufferedImage image = robot.createScreenCapture(ekran);

        ImageIO.write(image, "png", new File("C:\\Users\\Frknk\\Desktop\\screen"+(++sayac)+".png"));
        System.out.println("Ekran görüntüsü alindi");
        menu();
    }

    void wallpaperChanger() throws IOException, AWTException {

        System.out.println("Dosya yolunu girin");
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Dosya Seçin");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String absolutePath = selectedFile.getAbsolutePath();
            Runtime.getRuntime().exec("reg add \"HKCU\\Control Panel\\Desktop\" /v Wallpaper /t REG_SZ /d \"" + absolutePath + "\" /f");

            JDesktopPane desktop = new JDesktopPane();
            JInternalFrame frame = new JInternalFrame();
            desktop.add(frame);
            frame.setVisible(true);

        }
        System.out.println("Geçerli değişikliklerin uygulanabilmesi için yeniden başlatmanı gerekiyor E/H");
        if (scan.next().equalsIgnoreCase("e")){
            restart();
        }else {
            menu();
        }
    }
}
