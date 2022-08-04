package jFrameGui;
import javax.swing.*;
import java.awt.event.*;

public class firstGui  {
	JButton button;
	
	public void changeIt() {
		button.setText("I've been clicked");
	}

	public static void main(String[] args) {
		//makes a new frame and a button
		JFrame frame = new JFrame();
		JButton button = new JButton("click here");
		
		//closes the program as soon as you close the the JFrame window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//adds the button to the frame content pane
		frame.getContentPane().add(button);
		
		//sets the frame size(pixels)
		frame.setSize(300, 300);
		
		//makes the frame visible
		frame.setVisible(true);

	}

}
