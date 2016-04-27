import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;


public class Calculator_ui implements ActionListener {
	JFrame frame=new JFrame("Calculadora");
	JPanel panel=new JPanel(new FlowLayout());
	JTextArea text=new JTextArea(1,20);
	JButton b1=new JButton("1");
	JButton b2=new JButton("2");
	JButton b3=new JButton("3");
	JButton b4=new JButton("4");
	JButton b5=new JButton("5");
	JButton b6=new JButton("6");
	JButton b7=new JButton("7");
	JButton b8=new JButton("8");
	JButton b9=new JButton("9");
	JButton b0=new JButton("0");
	JButton badd=new JButton("+");
	JButton bsub=new JButton("-");
	JButton bmul=new JButton("x");
	JButton bdiv=new JButton("/");
	JButton beq=new JButton("=");
	JButton bcle=new JButton("C");
	Double n1, n2, result;
	int add=0, sub=0, mul=0, div=0;
	
	public void ui(){
		frame.setVisible(true);
		frame.setSize(250, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		panel.add(text);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(b5);
		panel.add(b6);
		panel.add(b7);
		panel.add(b8);
		panel.add(b9);
		panel.add(b0);
		panel.add(badd);
		panel.add(bsub);
		panel.add(bmul);
		panel.add(bdiv);
		panel.add(beq);
		panel.add(bcle);
	
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b0.addActionListener(this);
		badd.addActionListener(this);
		bsub.addActionListener(this);
		bmul.addActionListener(this);
		bdiv.addActionListener(this);
		beq.addActionListener(this);
		bcle.addActionListener(this);
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object source = e.getSource();
		
		if(source==this.b1)
			text.append("1");
		if(source==this.b2)
			text.append("2");
		if(source==this.b3)
			text.append("3");
		if(source==this.b4)
			text.append("4");
		if(source==this.b5)
			text.append("5");
		if(source==this.b6)
			text.append("6");
		if(source==this.b7)
			text.append("7");
		if(source==this.b8)
			text.append("8");
		if(source==this.b9)
			text.append("9");
		if(source==this.b0)
			text.append("0");
		if(source==this.badd){
			n1=number_reader();
			text.setText("");
			add=1;
			sub=mul=div=0;
		}
		if(source==this.bsub){
			n1=number_reader();
			text.setText("");
			sub=1;
			add=mul=div=0;
		}
		if(source==this.bmul){
			n1=number_reader();
			text.setText("");
			mul=1;
			sub=add=div=0;
		}
		if(source==this.bdiv){
			n1=number_reader();
			text.setText("");
			div=1;
			sub=mul=add=0;
		}
		if(source==this.beq){
			n2=number_reader();
			if(add>0){
				result=n1+n2;
				text.setText(Double.toString(result));
			}
			if(sub>0){
				result=n1-n2;
				text.setText(Double.toString(result));
			}
			if(mul>0){
				result=n1*n2;
				text.setText(Double.toString(result));
			}
			if(div>0){
				if(n2!=0){
					result=n1/n2;
					text.setText(Double.toString(result));
				}
				else{ 
					text.setText("Error");
					n1=n2=(double) 0;
				}
			}
		}
		if(source==this.bcle){
			n1=n2=(double)0;
			text.setText("");
		}
	}
	
	public double number_reader(){
		Double num1;
		String s;
		s=text.getText();
		num1=Double.valueOf(s);
		
		return num1;
	}
}

