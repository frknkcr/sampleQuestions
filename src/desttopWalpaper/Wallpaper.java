package desttopWalpaper;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Wallpaper {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            String path = "C:\\Users\\frknk\\Downloads\\lamp_outlet_idea_electricity_120422_1920x1080.jpg";
            Runtime.getRuntime().exec("powershell.exe Set-ItemProperty -Path 'HKCU:\\Control Panel\\Desktop' -Name Wallpaper -Value " + path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Geçerlik değişikliklerin uygulanabilmesi için yeniden başlatın E/H");
        String secim = scan.next();
        if (secim.equalsIgnoreCase("e")) {
            try {
                Runtime.getRuntime().exec("shutdown /r");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
