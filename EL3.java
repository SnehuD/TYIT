package TYIT;

import java.applet.Applet;
import java.awt.*;

//Button & TextField
public class EL3 extends Applet
{
	TextField txtfield;
	Button btn;
	public void init()
	{
		txtfield = new TextField(20);
		add(txtfield);
		
		btn = new Button("Click Me");
		add(btn);
		
	}
	
	public boolean action (Event e, Object obj)
	{
		String title = (String)obj;
		String msg = "Button is Pressed";
		if(e.target instanceof Button)
		{
			if (title == "Press it")
			{
				txtfield.setText(msg);
			}
			
		}
		return true;
	}
	
}
