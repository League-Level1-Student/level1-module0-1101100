package _10_cuteness_tv;

import java.net.URI;
import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class cutenessTV implements ActionListener{
	 JButton b0 = new JButton();
     JButton b1 =new JButton();
     JButton b2=new JButton();
	public void showButton() {
		System.out.println("Button clicked");
        JFrame frame = new JFrame();
        frame.setSize(200, 200);
        frame.setTitle("cutenessTV");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        JPanel panel = new JPanel();
        frame.add(panel);
        panel.add(b0);
        b0.setText("duck");
        panel.add(b1);
        b1.setText("frog");
        panel.add(b2);
        b2.setText("unicorn");
        
 
        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
	}
	
	
	
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b0) {
			showDucks();
		}
		else if (e.getSource() == b1) {
			showFrog();
		}
		else if (e.getSource() == b2) {
			showFluffyUnicorns();
		}
		
	}
}
