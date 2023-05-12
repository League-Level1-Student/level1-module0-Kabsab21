package _04_gui_from_scratch._2_jack_in_the_box;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class jack_in_the_box implements ActionListener {
	static JButton button = new JButton();
	int timespressed = 0;
	public static void main(String[] args) {
		jack_in_the_box runner = new jack_in_the_box();

		  
	runner.showbutton();
	
	}
	private void showPicture(String fileName ) {
	     try {
	          JLabel imageLabel = createLabelImage(fileName);
	          JFrame frame = new JFrame();
	          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	          frame.add(imageLabel);
	       

	          frame.setVisible(true);
	          frame.pack();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}private void showbutton() {
	  
	 
	          JFrame aframe = new JFrame();
	          aframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	          aframe.add(button);
	          button.addActionListener(this);
	          aframe.setVisible(true);
	          aframe.pack();
	     
	
	}
	
	private JLabel createLabelImage(String fileName) {
	     try {
	          URL imageURL = getClass().getResource(fileName);
	          if (imageURL == null) {
	               System.err.println("Could not find image " + fileName);
	               return new JLabel();
	          } else {
	               Icon icon = new ImageIcon(imageURL);
	               JLabel imageLabel = new JLabel(icon);
	               return imageLabel;
	          }
	     } catch (Exception e) {
	          System.err.println("Could not find image " + fileName);
	          return new JLabel();
	     }
	}

	private void playSound(String soundFile) {
	     try {
	          AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
	          sound.play();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	
	}
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();	
		if(buttonPressed == button ) {
			timespressed = timespressed + 1;
			System.out.println(timespressed);
			if(timespressed == 5) {
				showPicture("jackInTheBox.png");
				playSound("homer-woohoo.wav");
			}
		}
	}
}
	

