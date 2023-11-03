package effective_practice;

import java.util.EnumSet;
import java.util.Set;

import effective_practice.Text2.Style;


public class Practice_num96 {

	public static void main(String[] args) {

		Text2 text = new Text2();
		
		text.applyStyles(EnumSet.of(Style.BOLD, Style.ITALIC));
		
	}

}

class Text2 {
	   public enum Style { BOLD, ITALIC, UNDERLINE, STRIKETHROUGH }
	   
	   // 어떤 Set을 넘겨도 되나, EnumSet이 가장 좋다.
	   public void applyStyles(Set<Style> styles) {}
	}

