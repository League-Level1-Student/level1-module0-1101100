package _09_sound_effects_machine;

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

public class soundEffectMachine  implements ActionListener {
	 JButton b0 = new JButton();
     JButton b1 =new JButton();
     JButton b2=new JButton();
     JButton b3=new JButton();
	
	public void showButton(){
		System.out.println("Button clicked");
        JFrame k=new JFrame();
        k.setVisible(true);
        JPanel j=new JPanel();
        k.add(j);
        j.add(b0);
        b0.setText("button 1");
        j.add(b1);
        b1.setText("button 2");
 
        b0.addActionListener(this);
        b1.addActionListener(this);

	}
	
	private void playSound(String soundFile) { 
	     try {
	          AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
	          sound.play();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		if (event.getSource() == b0) {
			playSound("Hamburger sound effect.wav");
		}
		else if (event.getSource() == b1) {
			playSound("reee.wav");
		}

		
	}
}
