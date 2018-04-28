package com.hjf.lookGame1227;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Config{
	public void paint(Graphics g){
		super.paint(g);
		//画出连连看的格子
		for(int i=1;i<LINE-1;i++){
				g.drawLine(X+i*SIZE, Y+SIZE, X+i*SIZE, Y+(LINE-2)*SIZE);
				g.drawLine(X+SIZE, Y+i*SIZE, X+(LINE-2)*SIZE, Y+i*SIZE);
		}
	}	
}
