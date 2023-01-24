package desttopWalpaper;

import java.awt.*;

public class MyDesktop {
    private Image walpaper;

    public MyDesktop() {
    }

    public MyDesktop(Image walpaper) {
        this.walpaper = walpaper;
    }

    public Image getWalpaper() {
        return walpaper;
    }

    public void setWalpaper(Image walpaper) {
        this.walpaper = walpaper;
    }
}
