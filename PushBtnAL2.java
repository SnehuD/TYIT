package TYIT;

import java.awt.*;
import java.awt.event.*;

//Program for creation of 2 buttons with ActionListener or
//giving the red & blue color to the background of that buttons
class PushBtnAL2 extends Frame implements ActionListener
{

	Button Red,Blue;
	PushBtnAL2()
	{
		Red=new Button("Red");
		Blue=new Button("Blue");
		setLayout(new FlowLayout());
		Red.addActionListener(this);
		Blue.addActionListener(this);
		add(Red);
		add(Blue);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand()=="Red")
		{
			setBackground(Color.RED);
		}
		else if(e.getActionCommand()=="Blue")
		{
			setBackground(Color.BLUE);
		}
		
	}
	
	public static void main(String args[])
	{
		PushBtnAL2 FB = new PushBtnAL2();
		FB.setSize(400,500);
		FB.setTitle("My Frame");
		FB.setVisible(true);
		
	}
	
}
