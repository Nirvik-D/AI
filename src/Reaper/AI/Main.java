package Reaper.AI;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.highgui.Highgui;

public class Main extends ImageLoader{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.loadLibrary( Core.NATIVE_LIBRARY_NAME );
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
		String str1="C:\\Users\\Lightning\\Pictures\\ReaperAI_Vision\\b_s.jpg";
		Mat matrix = Highgui.imread(str1,0);
		ImageLoader.imageloader(str1,matrix);

	}

}
