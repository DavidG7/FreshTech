import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;


public class ImageLoader {

	public BufferedImage load(){
	    try {
	        return ImageIO.read(getClass().getResource("/images/NBGardensLogo.png"));
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	    return null;
	}
}
