import javax.imageio.ImageIO;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.util.Timer;

public class main {

    public static void main(String args[]) throws IOException {
        ThreadsDemo thread1 = new ThreadsDemo("One");
        ThreadsDemo thread2 = new ThreadsDemo("Two");
        //thread1.start();
        //thread2.start();

        screencapture test = new screencapture();
        test.start();
        for(int x = 0 ; x<5; x++){
            ImageIO.write((RenderedImage) test.getCurrentScreenshot(), "png", new File("D:\\PROGRAMSHERE\\Java\\Threading_concurrencyPractice\\ScreenSHots/screenshot.png"));
        }





    }
}
