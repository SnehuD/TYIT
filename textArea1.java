package TYIT;

import java.awt.*;

//Program for TextArea
//Scrolling effect..
public class textArea1 
{
	textArea1()
	{
		Frame f = new Frame();
		f.setSize(700,700);
		f.setTitle("My Frame");
		f.setVisible(true);
		f.setLayout(null);
		
		TextArea TA = new TextArea("Welcome to GPP..!!");
		TA.setBounds(110,200,200,200);
		f.add(TA);
	}

	public static void main(String[] args) 
	{
		textArea1 FB = new textArea1();

	}

}
