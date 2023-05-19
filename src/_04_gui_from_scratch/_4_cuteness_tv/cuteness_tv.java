package _04_gui_from_scratch._4_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cuteness_tv implements ActionListener  {
	JFrame murderme = new JFrame();
	JPanel why = new JPanel();
	JButton uhmcduckie = new JButton();
	JButton uhmcfrogie = new JButton();
	JButton uhmcunicornie = new JButton();
	
	public static void main(String[] args) {
		cuteness_tv runner = new cuteness_tv();
		runner.buttons();
		
	}
	
	
	private void buttons() {
		why.add(uhmcduckie);
		why.add(uhmcfrogie);
		why.add(uhmcunicornie);
		murderme.add(why);
		murderme.setVisible(true);
		murderme.pack();
	    uhmcduckie.addActionListener(this);
	    uhmcfrogie.addActionListener(this);
	    uhmcunicornie.addActionListener(this);
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
	     
	     // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't
	     //work on some Linux implementations
	     try {
	     if (System.getProperty("os.name").toLowerCase().contains("linux")) {
	     if (Runtime.getRuntime().exec(new String[] {
	      "which", "xdg- open" }).getInputStream().read() != -1) {
	     Runtime.getRuntime().exec(new String[] { "xdg-open", videoID });
	     }
	     } else {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     }      } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();	
		if(buttonPressed == uhmcduckie ){
			System.out.println("uhm McDuckie has been pressed");
			showDucks();
		}
		if(buttonPressed == uhmcfrogie ){
			System.out.println("uhm McFrogie has been pressed");
			showFrog();
		}
		if(buttonPressed == uhmcunicornie ){
			System.out.println("uhm McUnicornie has been pressed");
			showFluffyUnicorns();
}
		
	}
}
