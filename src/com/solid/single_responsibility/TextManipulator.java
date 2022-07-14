package com.solid.single_responsibility;

/**
 * 
 * @author avinashshukla
 *
 */


//Class to manipulate text and this is the only task done here.
//Here if any changes will be done, that should only for single reason i.e. manipulate the text

public class TextManipulator {
	
	public String text;
	
	public TextManipulator(String text) {
		this.text = text;
	}
	
	public void appendText(String newText) {
		this.text = this.text.concat(newText);
	}
	
	public void findAndReplaceText(String word, String replaceWord) {
		if(this.text.contains(word)) {
			this.text = this.text.replace(word, replaceWord);
		}
	}
	
	public void findAndDeleteText(String word) {
		if(this.text.contains(word)){
			this.text = this.text.replace(word, "");
		}
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	

}
