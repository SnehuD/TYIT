package TYIT;

import java.awt.*;

//Program for TextField
public class textField1 
{
	textField1()
	{
		Frame f = new Frame();
		f.setSize(700,700);
		f.setTitle("My Frame");
		f.setVisible(true);
		f.setLayout(null);
		
		TextField T1 = new TextField("Welcome");
		T1.setBounds(110,160,200,200);
		f.add(T1);
	}

	public static void main(String[] args) 
	{
		textField1 FB = new textField1();

	}

}
