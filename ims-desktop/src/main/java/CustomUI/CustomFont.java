package CustomUI;
import java.awt.Font;
/**
 * 
 * @author dgordon
 *
 */

public class CustomFont {
	
	private Font font;

	public static Font getFont(String type, int fontSize){
		Font font;
		if(type.equals("ITALIC")){
			font = new Font("Rockwell", Font.ITALIC, fontSize);
		}else{
			font = new Font("Rockwell", Font.BOLD, fontSize);
		}
		return font;
	}
}
