import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Binary implements MouseListener {
	public static void main(String[] args) {
		Binary binary= new Binary();
		binary.Gui();
	}
void Gui() {
	JFrame Jframe=new JFrame(); 
	JPanel Jpanel=new JPanel();
			
			
            JButton Jbutton= new JButton();
            Jbutton.addMouseListener(this);
            Jpanel.add(Jbutton);
           
            Jpanel.add(Jlabel);
            Jpanel.add(answer);
            Jframe.add(Jpanel);
            Jframe.setVisible(true);
            Jframe.pack();
}
JLabel Jlabel=new JLabel();
JTextField answer = new JTextField(20);
String convert(String input) {
    if(input.length() != 8){
         JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
         return "-";
    }
    String binary = "[0-1]+";    //must contain numbers in the given range
    if (!input.matches(binary)) {
         JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
         return "-";
    }
    try {
         int asciiValue = Integer.parseInt(input, 2);
         char theLetter = (char) asciiValue;
         return "" + theLetter;
    } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
         return "-";
    }
}

@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mousePressed(MouseEvent e) {
	convert(answer.getText());
	String a=convert(answer.getText());
	
	Jlabel.setText(a);
}

@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
}
