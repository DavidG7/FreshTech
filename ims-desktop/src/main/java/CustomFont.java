import java.awt.Font;


public class CustomFont {
	
	private Font font;

	public static Font getFont(String type, int fontSize){
		Font font;
		if(type.equals("ITALIC")){
			font = new Font("Comic Sans MS", Font.ITALIC, fontSize);
		}else{
			font = new Font("Comic Sans MS", Font.BOLD, fontSize);
		}
		return font;
	}
}
