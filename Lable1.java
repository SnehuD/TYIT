package TYIT;

import java.awt.*;

//Program for adding Label
public class Lable1 
{

	Lable1()
	{
		Frame f = new Frame();
		f.setSize(700,700);
		f.setTitle("My Frame");
		f.setVisible(true);
		f.setLayout(null);
		
		Button b = new Button("B1");
		b.setBounds(110,100,70,40);
		f.add(b);
		
		//by default the label is created at left side
		Label l1 = new Label("Label");	
		//If we want a label in right side...
		//Label l1 = new Label("Label",Label.RIGHT);
		l1.setBounds(110,70,70,50);
		f.add(l1);
		
	}
	
	public static void main(String[] args) 
	{
		Lable1 FB = new Lable1();	

	}

}
