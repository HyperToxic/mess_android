package com.toxic.test;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class MyFrame extends Frame{

	@Override
	public void print(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.BLUE);
		g.fillOval(50, 50, 30, 30);
		//super.print(arg0);
	}
	
	public void launchFrame()
	{
		setBounds(400,400,300,300);
		this.setVisible(true);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame().launchFrame();
	}

}
