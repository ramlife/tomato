/**
 * 
 */
package tomatoDemo;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author Administrator
 *
 */
public class UI_1 {
	private int time;
	private Frame f;
	private Label l;
	private Dimension d;
	
	public void disp()
	{
		f = new Frame("ÐÝÏ¢");
		
		d = Toolkit.getDefaultToolkit().getScreenSize();
		
		f.setSize(30, 10);
		f.setVisible(true);
		
		l = new Label("ÐÝÏ¢£¡");
		l.setFont(new Font("consola", 1, 45));
		f.add(l);
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}
	
	public void setDispMax()
	{
//		f.setSize(Frame.MAXIMIZED_HORIZ, Frame.MAXIMIZED_VERT);
//		f.show();
//		f.setSize(1920, 1080);
		f.setSize(d.width, d.height);
//		f.setExtendedState(Frame.MAXIMIZED_BOTH);
		f.setExtendedState(Frame.NORMAL);
		f.setAlwaysOnTop(true);
		f.toFront();
		f.setAlwaysOnTop(false);
	}
	
	public void setDispMin()
	{
//		f.show();
		f.setSize(30, 10);
		f.setExtendedState(Frame.NORMAL);
		f.setAlwaysOnTop(true);
		f.toFront();
		f.setAlwaysOnTop(false);
//		f.setExtendedState(Frame.MAXIMIZED_BOTH);
	}
}
