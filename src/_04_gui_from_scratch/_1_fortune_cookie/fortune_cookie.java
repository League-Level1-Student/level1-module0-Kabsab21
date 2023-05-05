package _04_gui_from_scratch._1_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	}
}
}

