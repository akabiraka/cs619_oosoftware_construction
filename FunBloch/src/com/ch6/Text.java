package com.ch6;

import java.util.Set;

public class Text {

//	bad implementation
//	public static final int STYLE_BOLD = 1 << 0;
//	public static final int STYLE_ITALIC = 1 << 1;
//	public static final int STYLE_UNDERLINE = 1 << 2;
//	public static final int STYLE_STRIKETHROUGH = 1 << 3;
//	
//	public void applyStyles(int styles) {
//		System.out.println(styles);
//	}
	
//	good implementation
	public enum Style {
		BOLD, ITALIC, UNDERLINE, STRIKETHROUGH;
	}
	
	public void applyStyles(Set<Style> styles) {
		System.out.println(styles.toString());
	}
}
