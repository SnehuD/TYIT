package TYIT;

import java.awt.Button;
import java.awt.Frame;

//This is a program for simple creation of a Push Button

public class PushBtn 
{
	PushBtn()
	{
		Frame f = new Frame();
		f.setSize(400,500);
		f.setTitle("My Frame");
		f.setVisible(true);
		
		Button b = new Button("Button");
		b.setBounds(100,110,80,30);
		f.setLayout(null);		
		f.add(b);
		
	}

	public static void main(String[] args) 
	{
		PushBtn FB = new PushBtn();

	}

}
