package _03_gui_with_help._2_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address” )
		String image = "https://pbs.twimg.com/profile_images/949787136030539782/LnRrYf6e_400x400.jpg";
			
		// 2. create a variable of type "Component" that will hold your image
Component component = createImage(image);
		// 3. use the "createImage()" method below to initialize your Component

		// 4. add the image to the quiz window
quizWindow.add(component);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String answer = JOptionPane.showInputDialog(null, " what is this lovely old lady holding in her hand?");
		// 7. print "CORRECT" if the user gave the right answer
if(answer.equalsIgnoreCase("a gun")) {
	System.out.println("CORRECT");
}else {System.out.println("INCORRECT");}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
quizWindow.remove(component);
		// 10. find another image and create it (might take more than one line
		// of code)
String image2 = "https://www.shutterstock.com/shutterstock/photos/1812937819/display_1500/stock-photo-portrait-of-happy-mid-adult-man-sitting-on-sofa-at-home-handsome-latin-man-in-casual-relaxing-on-1812937819.jpg"; 
Component component2 = createImage(image2);
component2.resize(400, 600);
quizWindow.add(component2);
quizWindow.pack();
String answer2 = JOptionPane.showInputDialog(null, "what is this?");
		// 11. add the second image to the quiz window
if(answer2.equalsIgnoreCase("a stock image")) {
	System.out.println("CORRECT");
}else {System.out.println("INCORRECT");}
		// 12. pack the quiz window

		// 13. ask another question

		// 14+ check answer, say if correct or incorrect, etc.

	}

	private Component createImage(String imageUrl) {
		JLabel imageLabel = new JLabel();
		URL url;
		try {
			url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			imageLabel.setIcon(icon);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "I can't find your image!!");
		}
		
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
