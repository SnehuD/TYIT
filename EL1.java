package TYIT;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

//Event Listener
//RadioBtn
public class EL1 extends Applet implements ItemListener
{
	CheckboxGroup radioBtn;
	Checkbox r1,r2, r3;
	TextField txt;
	public void init()
	{
		radioBtn = new CheckboxGroup();
		
		r1 = new Checkbox("General", false, radioBtn);
		add(r1);	
		r1.addItemListener(this);
		
		r2 = new Checkbox("OBC", false, radioBtn);
		add(r2);
		r2.addItemListener(this);
		
		r3= new Checkbox("STSC", false, radioBtn);
		add(r3);
		r3.addItemListener(this);
		
		txt = new TextField(20);
		add(txt);
		
	}
	
	public void itemStateChanged(ItemEvent e)
	{
		txt.setText("Caste: " +((Checkbox)e.getItemSelectable()).getLabel());
	}
	
}