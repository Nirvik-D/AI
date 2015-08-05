package Reaper.AI;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.opencv.core.Mat;
import org.opencv.highgui.Highgui;

public class ImageLoader extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	static String str2 = "C:\\Users\\Lightning\\Pictures\\ReaperAI_Vision\\boogie1.png";
	
	public static void imageloader(String imgadd1, Mat matrix){
		Highgui.imwrite(str2,matrix);
	}
	
	static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Reaper AI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setResizable(true);
		frame.setLocationRelativeTo(null);
        
        ImageIcon imgico = new ImageIcon(str2);
        frame.setSize(imgico.getIconWidth()+10,imgico.getIconHeight()+35);
 
        JLabel image_label = new JLabel("", imgico, JLabel.CENTER);
        frame.getContentPane().add(image_label, BorderLayout.CENTER);
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

}
