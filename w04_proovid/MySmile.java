import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;

public class MySmile {
    
    public static void main(String[] args) throws IOException {
        
    int width = 100;
    int height = 100;

    BufferedImage picture = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
    Graphics g = picture.createGraphics();

    g.setColor(Color.GREEN);
    g.fillRect(0, 0, width, height);

    g.setColor(Color.black);
    g.fillArc(0, 0, width, height, 0, 360);
    
    //silmad
    g.setColor(Color.YELLOW);
    g.fillOval(20, 20, 20, 20);
    g.fillOval(55, 20, 30, 30);

    //nina
    g.setColor(Color.YELLOW);
    g.fillOval(40, 40, 15, 30);

        ///suu
    g.drawArc(20, 50, 60, 30, 0, -180);

        //kulmud
    g.drawArc(20, 10, 10, 10, 0, 160);
    g.drawArc(70, 10, 10, 10, 0, 160);

    
    ImageIO.write(picture, "png", new File("smile.png"));
}

    
}
