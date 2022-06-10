import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.server.Operation;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {
	
	boolean isOperatorClicked=false;
	
	String oldValue; 
	int operator;
     
	JFrame jf;
	JLabel displaylabel;
	JButton sevenbutton;
	JButton eightbutton;
	JButton ninebutton;
	JButton fourbutton;
	JButton fivebutton;
	JButton sixbutton;
	JButton onebutton;
	JButton twobutton;
	JButton threebutton;
	JButton zerobutton,equalbutton;
	JButton clearbutton,divbutton,dotbutton,minusbutton,addbutton,multbutton;
	
	public Calculator() {
		
		jf = new JFrame("Calculator"); //
		jf.setLayout(null);
		jf.setSize(600, 470); //Window size
		jf.setLocation(300, 150); // Set Window  Location
		jf.getContentPane().setBackground(Color.black);
		// LABEL
		
		displaylabel =new JLabel(); // label object
		displaylabel.setBounds(30, 40, 540, 40); // label Size and Location Setting
		displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);  //Alignment Setting
		displaylabel.setForeground(Color.WHITE);
		
	    displaylabel.setBackground(Color.gray);
	    displaylabel.setOpaque(true);
		jf.add(displaylabel);   // Add Label to the Frame
		
		
		//  BUTTON 7
		sevenbutton = new JButton("7");
		sevenbutton.setBounds(30, 150, 50, 50);
		sevenbutton.setBackground(Color.lightGray);
		sevenbutton.setOpaque(true);
		sevenbutton.addActionListener(this);
		//sevenbutton.setFont(new Font(null, Font.BOLD, 15));  // teext font size
		jf.add(sevenbutton);
		
		
		// BUTTON 8
		
		eightbutton = new JButton("8");
		eightbutton.setBounds(90, 150, 50, 50);
		eightbutton.setBackground(Color.lightGray);
		eightbutton.setOpaque(true);
		eightbutton.addActionListener(this);
		jf.add(eightbutton);
		
		// BUTTON 9
		ninebutton = new JButton("9");
		ninebutton.setBounds(150, 150, 50, 50);
		ninebutton.setBackground(Color.lightGray);
		ninebutton.setOpaque(true);
		ninebutton.addActionListener(this);
		jf.add(ninebutton);
		
	//  BUTTON 4
			fourbutton = new JButton("4");
			fourbutton.setBounds(30, 210, 50, 50);
			fourbutton.setBackground(Color.lightGray);
			fourbutton.setOpaque(true);
			fourbutton.addActionListener(this);
			jf.add(fourbutton);
			
			// BUTTON 5
			
			fivebutton = new JButton("5");
			fivebutton.setBounds(90, 210, 50, 50);
			fivebutton.setBackground(Color.lightGray);
			fivebutton.setOpaque(true);
			fivebutton.addActionListener(this);
			jf.add(fivebutton);
			
			// BUTTON 6
			sixbutton = new JButton("6");
			sixbutton.setBounds(150, 210, 50, 50);
			sixbutton.setBackground(Color.lightGray);
			sixbutton.setOpaque(true);
			sixbutton.addActionListener(this);
			jf.add(sixbutton);
			
		//  BUTTON 1
			onebutton = new JButton("1");
			onebutton.setBounds(30, 270, 50, 50);
			onebutton.setBackground(Color.lightGray);
			onebutton.setOpaque(true);
			onebutton.addActionListener(this);
			jf.add(onebutton);
			
			// BUTTON 2
			
			twobutton = new JButton("2");
			twobutton.setBounds(90, 270, 50, 50);
			twobutton.setBackground(Color.lightGray);
			twobutton.setOpaque(true);
			twobutton.addActionListener(this);
			jf.add(twobutton);
			
			// BUTTON 3
			threebutton = new JButton("3");
			threebutton.setBounds(150, 270, 50, 50);
			threebutton.setBackground(Color.lightGray);
			threebutton.setOpaque(true);
			threebutton.addActionListener(this);
			jf.add(threebutton);
			
		//  BUTTON .
			dotbutton = new JButton(".");
			dotbutton.setBounds(30, 330, 50, 50);
			dotbutton.setBackground(Color.lightGray);
			dotbutton.setOpaque(true);
			dotbutton.addActionListener(this);
			jf.add(dotbutton);
			
			// BUTTON 0
			
			zerobutton = new JButton("0");
			zerobutton.setBounds(90, 330, 50, 50);
			zerobutton.setBackground(Color.lightGray);
			zerobutton.setOpaque(true);
			zerobutton.addActionListener(this);
			jf.add(zerobutton);
			
			// BUTTON =
			equalbutton = new JButton("=");
			equalbutton.setBounds(150, 330, 50, 50);
			equalbutton.setBackground(Color.lightGray);
			equalbutton.setOpaque(true);
			equalbutton.addActionListener(this);
			jf.add(equalbutton);
			
		//  BUTTON /
			divbutton = new JButton("/");
			divbutton.setBounds(210, 150, 50, 50);
			divbutton.setBackground(Color.lightGray);
			divbutton.setOpaque(true);
			divbutton.addActionListener(this);
			jf.add(divbutton);
			
			// BUTTON *
			
			multbutton = new JButton("*");
			multbutton.setBounds(210, 210, 50, 50);
			multbutton.setBackground(Color.lightGray);
			multbutton.setOpaque(true);
			multbutton.addActionListener(this);
			jf.add(multbutton);
			
			// BUTTON -
			minusbutton = new JButton("-");
			minusbutton.setBounds(210, 270, 50, 50);
			minusbutton.setBackground(Color.lightGray);
			minusbutton.setOpaque(true);
			minusbutton.addActionListener(this);
			jf.add(minusbutton);
			
			// BUTTON +
			addbutton = new JButton("+");
			addbutton.setBounds(210, 330, 50, 50);
			addbutton.setBackground(Color.lightGray);
			addbutton.setOpaque(true);
			addbutton.addActionListener(this);
			jf.add(addbutton);
			
			// BUTTON Clear
			clearbutton = new JButton("C");
			clearbutton.setBounds(270, 330, 60, 50);
			clearbutton.setBackground(Color.lightGray);
			clearbutton.setOpaque(true);
			clearbutton.addActionListener(this);
			jf.add(clearbutton);
			
			
		
		jf.setVisible(true); //For  Window Visible
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // for terminate
		
		
	}
	
	public static void main(String[] args) {
		
		 new Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==sevenbutton) {
			
			if(isOperatorClicked)
			{
				displaylabel.setText("7");
				isOperatorClicked=false;
			}
			else {
				displaylabel.setText(displaylabel.getText()+("7"));
			}
			
		}
		
		else if (e.getSource()==eightbutton) {
			
			if(isOperatorClicked)
			{
				displaylabel.setText("8");
				isOperatorClicked=false;
			}
			else {
				displaylabel.setText(displaylabel.getText()+("8"));
			}
			
		}
		else if (e.getSource()==ninebutton) {
			if(isOperatorClicked)
			{
				displaylabel.setText("9");
				isOperatorClicked=false;
			}
			else {
				displaylabel.setText(displaylabel.getText()+("9"));
			}	
			
		}
		else if (e.getSource()==fourbutton) {
			if(isOperatorClicked)
			{
				displaylabel.setText("4");
				isOperatorClicked=false;
			}
			else {
				displaylabel.setText(displaylabel.getText()+("4"));
			}
		}
		else if (e.getSource()==fivebutton) {
			if(isOperatorClicked)
			{
				displaylabel.setText("5");
				isOperatorClicked=false;
			}
			else {
				displaylabel.setText(displaylabel.getText()+("5"));
			}
		}
		else if (e.getSource()==sixbutton) {
			if(isOperatorClicked)
			{
				displaylabel.setText("6");
				isOperatorClicked=false;
			}
			else {
				displaylabel.setText(displaylabel.getText()+("6"));
			}
		}
		else if (e.getSource()==onebutton) {
			if(isOperatorClicked)
			{
				displaylabel.setText("1");
				isOperatorClicked=false;
			}
			else {
				displaylabel.setText(displaylabel.getText()+("1"));
			}
		}
		else if (e.getSource()==twobutton) {
			if(isOperatorClicked)
			{
				displaylabel.setText("2");
				isOperatorClicked=false;
			}
			else {
				displaylabel.setText(displaylabel.getText()+("2"));
			}
		}
		else if (e.getSource()==threebutton) {
			if(isOperatorClicked)
			{
				displaylabel.setText("3");
				isOperatorClicked=false;
			}
			else {
				displaylabel.setText(displaylabel.getText()+("3"));
			}
		}
		else if (e.getSource()==zerobutton) {
			if(isOperatorClicked)
			{
				displaylabel.setText("0");
				isOperatorClicked=false;
			}
			else {
			 	displaylabel.setText(displaylabel.getText()+("0"));
			}
		}
	
		else if (e.getSource()==dotbutton) {
			if(isOperatorClicked)
			{
				displaylabel.setText(".");
				isOperatorClicked=false;
			}
			else {
				displaylabel.setText(displaylabel.getText()+("."));
			}
			
		}
		else if (e.getSource()==divbutton) {
			isOperatorClicked=true;
			
			oldValue = displaylabel.getText();
			operator=4;
		}
		else if (e.getSource()==multbutton) {
			isOperatorClicked=true;
			
			oldValue = displaylabel.getText();
			operator=3;
		}
		else if (e.getSource()==addbutton) {
			
			isOperatorClicked=true;
		
			oldValue = displaylabel.getText();
			
			operator=1;
			
		}
		else if (e.getSource()==minusbutton) {
			isOperatorClicked=true;
			
			oldValue = displaylabel.getText();
			
			operator=2;
		}
	else if (e.getSource()==equalbutton) {
			
			String newValue=displaylabel.getText();
			
			float oldValueF=Float.parseFloat(oldValue);
			
			float newValueF=Float.parseFloat(newValue);
			 
			switch(operator)
			{
			  case 1:
				  
			        float resultadd=oldValueF+newValueF;
			         displaylabel.setText(resultadd+"");
			         break;
			         
			  case 2:
				 float resultminus=oldValueF-newValueF;
			      displaylabel.setText(resultminus+"");
			         break;
			         
			  case 3:
					 float resultmult=oldValueF*newValueF;
				      displaylabel.setText(resultmult+"");
				         break; 
				         
			  case 4:
					 float resultdiv=oldValueF/newValueF;
				      displaylabel.setText(resultdiv+"");
				         break;	         
			}
			 
			
		}
		else if (e.getSource()==clearbutton) {
			displaylabel.setText(" ");
		}
		
	}
}
