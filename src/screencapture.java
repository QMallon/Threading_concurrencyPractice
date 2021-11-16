import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class screencapture extends Thread {
    private Image currentScreenshot;
    private Thread t;







    public screencapture(){
        try{
            BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
            currentScreenshot = image;
        }
        catch(AWTException a){
            System.out.println("AWTEXCEPTION");

        }
        catch(Exception e){
            System.out.println("EXCEPTION ENCOUNTERED");
        }


    }
    public void updateScreenshot(){
        try{
            currentScreenshot = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));

        }
        //Lazy
        catch(Exception e){

        }

    }

    public Image getCurrentScreenshot(){
        return currentScreenshot;
    }

    public void run(){
        //LOGIC HERE
        System.out.println("Running");
        try{
            this.updateScreenshot();
        }
        catch(Exception e){

        }


    }
    public void start(){
        System.out.println("Thread: Screencapture Starting");
        if(t ==null){
            t = new Thread(this);
            t.start();
        }

    }
}
