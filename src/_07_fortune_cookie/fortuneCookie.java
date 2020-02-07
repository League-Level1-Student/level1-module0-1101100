package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class fortuneCookie implements ActionListener{
	JFrame frame = new JFrame();
    JButton button = new JButton();
 
    public void showButton() {
    	  System.out.println("Button clicked");
    	    frame.setVisible(true);

    	    frame.add(button);
    	    frame.pack();
    	    button.addActionListener(this);
    		
    	    button.setText("click here for fortune");
    	    	
    	    	frame.pack(); 

   }

	
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "woohoo");
		Random rand = new Random();
		int ran = rand.nextInt(5);
		if (ran == 0) {
			JOptionPane.showMessageDialog(null, "rich");
		}
		else if (ran == 1) {
			JOptionPane.showMessageDialog(null, "not rich");
		}
		else if (ran == 2) {
			JOptionPane.showMessageDialog(null, "nothing happens");
		}
		else if (ran == 3) {
			JOptionPane.showMessageDialog(null, "cow");
		}
		else if (ran == 4) {
			JOptionPane.showMessageDialog(null, "virus");
		}

		
		
	}


}