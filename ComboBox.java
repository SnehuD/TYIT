package TYIT;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ComboBox extends JApplet implements ItemListener
{
	JComboBox jcmbbox = new JComboBox();
	String Str= "";
	public void init()
	{
		Container contentPane = getContentPane();
		jcmbbox.addItem("C");
		jcmbbox.addItem("C#");
		jcmbbox.addItem("C++");
		jcmbbox.addItem("Java");
		jcmbbox.addItem("J#");
		contentPane.setLayout(new FlowLayout());
		contentPane.add(jcmbbox);
		jcmbbox.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent e)
	{
		
		if(e.getStateChange() == ItemEvent.SELECTED)
		{
			Str += "You Select:" + (String)e.getItem();
		}
		showStatus(Str);
	}
	
}
