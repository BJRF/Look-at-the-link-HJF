package com.hjf.lookGame1227;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Jframe extends GamePanel{
	public void show(){
		JFrame jf =new JFrame();
		//设置界面的一些基本属性
		jf.setSize(900, 800);
		jf.setTitle("连连看小游戏");
		jf.setDefaultCloseOperation(3);
		jf.setLocationRelativeTo(null);
		//添加一个面板在界面上
		GamePanel gp=new GamePanel();
		//设置中间面板的颜色
		gp.setBackground(new Color(255,255,255));
		jf.add(gp,BorderLayout.CENTER);
		//流式布局设置东边的按钮部分的属性
		JPanel jp=new JPanel();
		jp.setBackground(new Color(245,245,245));
		FlowLayout fl=new FlowLayout(FlowLayout.CENTER,10,180);
		jp.setLayout(fl);
		Dimension ed=new Dimension(120,0);
		jp.setPreferredSize(ed);
		jf.add(jp,BorderLayout.EAST);
		//设置东边面板的颜色
		jp.setBackground(new Color(245,245,245));
		//设置按钮
		javax.swing.JButton jbu1=new javax.swing.JButton("开始游戏");
		Dimension d1=new Dimension(100,60);
		jbu1.setPreferredSize(d1);
		jp.add(jbu1);
		javax.swing.JButton jbu2=new javax.swing.JButton("重新开始");
		Dimension d2=new Dimension(100,60);
		jbu2.setPreferredSize(d2);
		jp.add(jbu2);
		//可视化
		jf.setVisible(true);
		//给面板添加画笔
		Graphics g=gp.getGraphics();
		//给按钮添加监听器
		GameListener gl=new GameListener(gp,g);
		jbu1.addActionListener(gl);
		jbu2.addActionListener(gl);
	}

	public static void main(String[] args) {
		Jframe j=new Jframe();
		j.show();
	}

}
