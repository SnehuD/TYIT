package TYIT;

import java.awt.*;

//Program for CheckBox
public class checkBox1 
{
	checkBox1()
	{
		Frame f = new Frame();
		f.setSize(700,700);
		f.setTitle("My Frame");
		f.setVisible(true);
		f.setLayout(null);
		
		Checkbox cb = new Checkbox("JAVA-II");
		cb.setBounds(110,150,100,100);
		f.add(cb);
	}

	public static void main(String[] args) 
	{
		checkBox1 FB = new checkBox1();

	}

}
