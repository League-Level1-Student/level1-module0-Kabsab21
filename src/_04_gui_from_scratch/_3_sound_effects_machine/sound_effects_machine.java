package _04_gui_from_scratch._3_sound_effects_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.applet.AudioClip;

public class sound_effects_machine implements ActionListener {
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	public static void main(String[] args) {
		sound_effects_machine runner = new sound_effects_machine();
		runner.buttons();
	}
	
	
	private void buttons() {
		JFrame why = new JFrame();
		why.setVisible(true);
		JPanel panel = new JPanel();
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		why.add(panel);
		why.pack();
	
	}
	
	
	
	
	
	private void playSound(String soundFile) {
		String path = "src/_04_gui_from_scratch/_3_sound_effects_machine/";
			File sound = new File(path+soundFile);
			if (sound.exists()) {
				new Thread(() -> {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(sound));
					clip.start();
					Thread.sleep(clip.getMicrosecondLength()/1000);
				}
				catch (Exception e) {
					System.out.println("Could not play this sound");
				}}).start();
	 		}
			else {
				System.out.println("File does not exist");
			}
		
	}
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();	
		if( buttonPressed == button1) {
			System.out.println("buttonPressed");
		playSound("alien-spaceship_daniel_simion.wav");	
		}
		if( buttonPressed == button2) {
			System.out.println("buttonPressed");
		playSound("sawing-wood-daniel_simon.wav");	
		}
		if( buttonPressed == button3) {
			System.out.println("buttonPressed");
		playSound("labrador-barking-daniel_simon.wav");	
		}
	}
    
}
