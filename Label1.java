package TYIT;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class Label1 extends Applet
{
	Label IbI1;
	Label IbI2;
	Label IbI3;
	public void init()
	{
		IbI1 = new Label("Label is on the Left!", Label.LEFT);
		add (IbI1);
		IbI2 = new Label("Label is in Center!", Label.CENTER);
		add(IbI2);
		IbI3 = new Label("Label is on the Right!", Label.RIGHT);
		add(IbI3);
	}
}
