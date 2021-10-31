package TYIT;

import java.awt.*;
import java.awt.event.*;

//Program for creation of button with ActionListener or
//giving the red color to the background of that button
class PushBtnAL extends Frame implements ActionListener
{

	Button B1;
	PushBtnAL()
	{
		B1=new Button("B1");
		setLayout(new FlowLayout());
		B1.addActionListener(this);
		add(B1);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand()=="B1")
		{
			setBackground(Color.RED);
		}
		
	}
	
	public static void main(String args[])
	{
		PushBtnAL FB = new PushBtnAL();
		FB.setSize(400,500);
		FB.setTitle("My Frame");
		FB.setVisible(true);
		
	}
	
}
