package com.solid.single_responsibility;

public class TestDriver {
	
	public static void main(String[] args) {
		TextManipulator tm = new TextManipulator("Solid Principles");
		TextPrinter tp = new TextPrinter(tm);
		tp.printText();
		
		tm.findAndReplaceText("Principles", "Answer");
		tp.printText();
		
		tm.findAndDeleteText("Answer");
		tp.printText();
	}

}
