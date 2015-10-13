import java.awt.Font;


public class CustomFont {
	
	private Font font;

	public static Font getFont(int fontSize){
		Font font = new Font("Arial", Font.ITALIC, fontSize);
		return font;
	}
}
