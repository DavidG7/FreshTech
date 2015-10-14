package CustomUI;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.PaintContext;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class CustomImage extends JPanel{

    private BufferedImage image;

    public CustomImage() {
       try {                
          image = ImageIO.read(new File("NBGardensLogo.png"));
       } catch (IOException ex) {
            // handle exception...
       }
       this.setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(getScaledImage(image, 100, 100), 0, 0, null); // see javadoc for more info on the parameters            
    }
    
    
    private BufferedImage getScaledImage(BufferedImage src, int w, int h){
        int finalw = w;
        int finalh = h;
        double factor = 1.0d;
        if(src.getWidth() > src.getHeight()){
            factor = ((double)src.getHeight()/(double)src.getWidth());
            finalh = (int)(finalw * factor);                
        }else{
            factor = ((double)src.getWidth()/(double)src.getHeight());
            finalw = (int)(finalh * factor);
        }   

        BufferedImage resizedImg = new BufferedImage(finalw, finalh, BufferedImage.TRANSLUCENT);
        Graphics2D g2 = resizedImg.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(src, 0, 0, finalw, finalh, null);
        g2.dispose();
    
        return resizedImg;
    }

}