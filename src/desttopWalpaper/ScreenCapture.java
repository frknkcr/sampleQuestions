package desttopWalpaper;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
public class ScreenCapture {

        public static void main(String[] args) throws Exception {

            Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());

            Robot robot = new Robot();

            BufferedImage image = robot.createScreenCapture(screenRect);

            ImageIO.write(image, "png", new File("C:\\Users\\Frknk\\Desktop\\screen.png"));
        }

}
