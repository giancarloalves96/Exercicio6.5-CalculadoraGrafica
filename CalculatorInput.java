import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.swing.*;

import java.text.ParseException;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import java.io.*;


public class CalculatorInput extends JFrame implements ActionListener{

	CalculatorEngine engine;
	JPanel panel;
	JButton One, Two, Three, Four, Five, Six, Seven, Eight, Nine, Zero, Mult, Division, Sum, Sub, Clear, Equals;
	JLabel Result;
	
	public CalculatorInput(CalculatorEngine e){
		
		// Set the frame characteristics
		setTitle( "Calculator" );
		setSize( 500, 300 );
		setBackground( Color.white );
		
		engine = e;
		
		Result=new JLabel("");
		One=new JButton("1");
		Two=new JButton("2");
		Three=new JButton("3");
		Four=new JButton("4");
		Five=new JButton("5");
		Six=new JButton("6");
		Seven=new JButton("7");
		Eight=new JButton("8");
		Nine=new JButton("9");
		Zero=new JButton("0");
		Sum=new JButton("+");
		Sub=new JButton("-");
		Mult=new JButton("x");
		Division=new JButton("/");
		Clear=new JButton("C");
		Equals=new JButton("=");
		
		panel=new JPanel();
		panel.setLayout(new FlowLayout());
		getContentPane().add(panel);
		
		panel.add(Result);
		panel.add(One);
		panel.add(Two);
		panel.add(Three);
		panel.add(Four);
		panel.add(Five);
		panel.add(Six);
		panel.add(Seven);
		panel.add(Eight);
		panel.add(Nine);
		panel.add(Zero);
		panel.add(Sum);
		panel.add(Sub);
		panel.add(Mult);
		panel.add(Division);
		panel.add(Clear);
		panel.add(Equals);
	}
	
	void run() throws Exception{
		while(true){
			Result.setText("["+engine.display()+"]");
		}
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==this.Sum)
			engine.add();
		if(e.getSource()==this.Sub)
			engine.subtract();
		if(e.getSource()==this.Mult)
			engine.multiply();
		if(e.getSource()==this.Division)
			engine.divide();
		if(e.getSource()==this.One)
			engine.digit(1);
		if(e.getSource()==this.Two)
			engine.digit(2);
		if(e.getSource()==this.Three)
			engine.digit(3);
		if(e.getSource()==this.Four)
			engine.digit(4);
		if(e.getSource()==this.Five)
			engine.digit(5);
		if(e.getSource()==this.Six)
			engine.digit(6);
		if(e.getSource()==this.Seven)
			engine.digit(7);
		if(e.getSource()==this.Eight)
			engine.digit(8);
		if(e.getSource()==this.Nine)
			engine.digit(9);
		if(e.getSource()==this.Zero)
			engine.digit(0);
		if(e.getSource()==this.Equals)
			engine.compute();
		if(e.getSource()==this.Clear)
			engine.clear();
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		CalculatorEngine e = new CalculatorEngine();
		CalculatorInput x = new CalculatorInput(e);
		x.setVisible(true);
		x.run();
	}
}
