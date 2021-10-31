package TYIT;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

//CheckBox 
public class EL2 extends Applet implements ItemListener
{
	Checkbox chkbx1, chkbx2, chkbx3, chkbx4;
	TextField txt1;
	public void init()
	{
		chkbx1 = new Checkbox("C");
		add(chkbx1);
		chkbx1.addItemListener(this);
		
		chkbx2 = new Checkbox("C++");
		add(chkbx2);
		chkbx2.addItemListener(this);
		
		chkbx3 = new Checkbox("JAVA");
		add(chkbx3);
		chkbx3.addItemListener(this);
		
		chkbx4 = new Checkbox("Python");
		add(chkbx4);
		chkbx4.addItemListener(this);
		
		txt1 = new TextField(20);
		add(txt1);
		
	}
	
	public void itemStateChanged(ItemEvent e)
	{
		if(e.getItemSelectable() == chkbx1)
		{
			txt1.setText("C is clicked!");
		}
		
		else if(e.getItemSelectable() == chkbx2)
		{
			txt1.setText("C++ is clicked!");
		}
		
		else if(e.getItemSelectable() == chkbx3)
		{
			txt1.setText("JAVA is clicked!");
		}
		
		else if(e.getItemSelectable() == chkbx4)
		{
			txt1.setText("Python is clicked!");
		}
	
	}
	
}
