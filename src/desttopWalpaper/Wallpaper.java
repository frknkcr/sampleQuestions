package desttopWalpaper;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Wallpaper {

    public static void menu() throws IOException {
        Desktop desktop = Desktop.getDesktop();
        BufferedImage image = ImageIO.read(new File("C:\\Users\\frknk\\Downloads\\sherry-christian-8Myh76_3M2U-unsplash.jpg")); // dosya yolu girilmiş image variable
        Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        BufferedImage resized = resize(image, screenSize.width, screenSize.height);
        File outputfile = new File("wallpaper.jpg");
        ImageIO.write(resized, "jpg", outputfile);
        String command = "reg add \"HKCU\\Control Panel\\Desktop\" /v Wallpaper /t REG_SZ /d \"" + outputfile.getAbsolutePath() + "\" /f";
        Runtime.getRuntime().exec(command);
    }

    private static BufferedImage resize(BufferedImage img, int newW, int newH) {
        Image tmp = img.getScaledInstance(newW, newH, Image.SCALE_SMOOTH);
        BufferedImage dimg = new BufferedImage(newW, newH, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = dimg.createGraphics();
        g2d.drawImage(tmp, 0, 0, null);
        g2d.dispose();
        return dimg;
    }

}
