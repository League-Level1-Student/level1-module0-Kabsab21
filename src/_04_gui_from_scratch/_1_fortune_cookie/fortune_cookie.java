package _04_gui_from_scratch._1_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class fortune_cookie implements ActionListener {
	 JButton babygirl = new JButton();
	 JFrame urmom = new JFrame();
 public void showButton() {
	 	System.out.println("Button clicked");
	 	
	 	urmom.setVisible(true);
	   
	    urmom.add(babygirl);
	    urmom.pack();
	    babygirl.addActionListener(this);

 	}

@Override
public void actionPerformed(ActionEvent e) {
	JButton buttonPressed = (JButton) e.getSource();	
	if(buttonPressed == babygirl){
		JOptionPane.showMessageDialog(null, "Woohoo!!");
		int rand = new Random().nextInt(5);
	if(rand == 0) {
		JOptionPane.showMessageDialog(null, "Oh my, your deppresed!!");
	}if(rand == 1) {
		JOptionPane.showMessageDialog(null, "Oh my, your quite lucky!!");
	}
	if(rand == 2) {
		JOptionPane.showMessageDialog(null, "lmao skill issues, your hella skrewed!");
	}
	if(rand == 3) {
		JOptionPane.showMessageDialog(null, "ring ring ring! Harvard is calling (the police)!");
	}
	if(rand == 4) {
		JOptionPane.showMessageDialog(null, "better show mom that report card. it will save your life!");
	}
	

	}
}
}

