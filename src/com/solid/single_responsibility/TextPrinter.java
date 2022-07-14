package com.solid.single_responsibility;

/**
 * 
 * @author avinashshukla
 *
 */


//This class will perform only task related to printing the text
public class TextPrinter {
	
	TextManipulator tm;
	
	public TextPrinter(TextManipulator tm) {
		this.tm = tm;
	}
	
	public void printText() {
		System.out.println(tm.getText());
	}

	public TextManipulator getTm() {
		return tm;
	}

	public void setTm(TextManipulator tm) {
		this.tm = tm;
	}
	
	

}
