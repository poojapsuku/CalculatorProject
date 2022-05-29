import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {
     
	JFrame jf;
	
	public Calculator() {
		
		jf = new JFrame("Calculator"); //
		jf.setLayout(null);
		jf.setSize(600, 470); //Window size
		jf.setLocation(300, 150); // Set Window  Location
		// LABEL
		
		JLabel displaylabel =new JLabel("Hello"); // label object
		displaylabel.setBounds(30, 40, 540, 40); // label Size and Location Setting
		displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);  //Alignment Setting
		displaylabel.setForeground(Color.WHITE);
		
	    displaylabel.setBackground(Color.gray);
	    displaylabel.setOpaque(true);
		jf.add(displaylabel);   // Add Label to the Frame
		
		
		//  BUTTON 7
		JButton sevenbutton = new JButton("7");
		sevenbutton.setBounds(30, 150, 50, 50);
		sevenbutton.setBackground(Color.lightGray);
		sevenbutton.setOpaque(true);
		//sevenbutton.setFont(new Font(null, Font.BOLD, 15));  // teext font size
		jf.add(sevenbutton);
		
		
		// BUTTON 8
		
		JButton eightbutton = new JButton("8");
		eightbutton.setBounds(90, 150, 50, 50);
		eightbutton.setBackground(Color.lightGray);
		eightbutton.setOpaque(true);
		jf.add(eightbutton);
		
		// BUTTON 9
		JButton ninebutton = new JButton("9");
		ninebutton.setBounds(150, 150, 50, 50);
		ninebutton.setBackground(Color.lightGray);
		ninebutton.setOpaque(true);
		jf.add(ninebutton);
		
	//  BUTTON 4
			JButton fourbutton = new JButton("4");
			fourbutton.setBounds(30, 210, 50, 50);
			fourbutton.setBackground(Color.lightGray);
			fourbutton.setOpaque(true);
			jf.add(fourbutton);
			
			// BUTTON 5
			
			JButton fivebutton = new JButton("5");
			fivebutton.setBounds(90, 210, 50, 50);
			fivebutton.setBackground(Color.lightGray);
			fivebutton.setOpaque(true);
			jf.add(fivebutton);
			
			// BUTTON 6
			JButton sixbutton = new JButton("6");
			sixbutton.setBounds(150, 210, 50, 50);
			sixbutton.setBackground(Color.lightGray);
			sixbutton.setOpaque(true);
			jf.add(sixbutton);
			
		//  BUTTON 1
			JButton onebutton = new JButton("1");
			onebutton.setBounds(30, 270, 50, 50);
			onebutton.setBackground(Color.lightGray);
			onebutton.setOpaque(true);
			jf.add(onebutton);
			
			// BUTTON 2
			
			JButton twobutton = new JButton("2");
			twobutton.setBounds(90, 270, 50, 50);
			twobutton.setBackground(Color.lightGray);
			twobutton.setOpaque(true);
			jf.add(twobutton);
			
			// BUTTON 3
			JButton threebutton = new JButton("3");
			threebutton.setBounds(150, 270, 50, 50);
			threebutton.setBackground(Color.lightGray);
			threebutton.setOpaque(true);
			jf.add(threebutton);
			
		//  BUTTON .
			JButton dotbutton = new JButton(".");
			dotbutton.setBounds(30, 330, 50, 50);
			dotbutton.setBackground(Color.lightGray);
			dotbutton.setOpaque(true);
			jf.add(dotbutton);
			
			// BUTTON 0
			
			JButton zerobutton = new JButton("0");
			zerobutton.setBounds(90, 330, 50, 50);
			zerobutton.setBackground(Color.lightGray);
			zerobutton.setOpaque(true);
			jf.add(zerobutton);
			
			// BUTTON =
			JButton equalbutton = new JButton("=");
			equalbutton.setBounds(150, 330, 50, 50);
			equalbutton.setBackground(Color.lightGray);
			equalbutton.setOpaque(true);
			jf.add(equalbutton);
			
		//  BUTTON /
			JButton divbutton = new JButton("/");
			divbutton.setBounds(210, 150, 50, 50);
			divbutton.setBackground(Color.lightGray);
			divbutton.setOpaque(true);
			jf.add(divbutton);
			
			// BUTTON *
			
			JButton multbutton = new JButton("*");
			multbutton.setBounds(210, 210, 50, 50);
			multbutton.setBackground(Color.lightGray);
			multbutton.setOpaque(true);
			jf.add(multbutton);
			
			// BUTTON -
			JButton minusbutton = new JButton("-");
			minusbutton.setBounds(210, 270, 50, 50);
			minusbutton.setBackground(Color.lightGray);
			minusbutton.setOpaque(true);
			jf.add(minusbutton);
			
			// BUTTON +
			JButton addbutton = new JButton("+");
			addbutton.setBounds(210, 330, 50, 50);
			addbutton.setBackground(Color.lightGray);
			addbutton.setOpaque(true);
			jf.add(addbutton);
			
			// BUTTON Clear
			JButton clearbutton = new JButton("C");
			clearbutton.setBounds(270, 330, 60, 50);
			clearbutton.setBackground(Color.lightGray);
			clearbutton.setOpaque(true);
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
		
	}
}
