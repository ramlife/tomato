/**
 * 
 */
package tomatoDemo;

import java.util.Date;

/**
 * @author Administrator
 *
 */
public class TomatoDemo {

	private static final long T_MAX = 28 * 60 * 1000;
	private static final long T_MIN = 2 * 60 * 1000;
	private static final long T_PERIOD = T_MAX + T_MIN;
	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		System.out.println(System.getProperty("java.classpath"));
		UI_1 ui1 = new UI_1();
		ui1.disp();
//		ui1.setDispMin();
//		ui1.setDispMax();
		
//		Date d = new Date();
		long t = new Date().getTime();
//		long t = d.getTime();
		long tmax, tmin, tperiod;
		
		
		while(true)
		{
			tmax = t + T_MAX;
			tmin = tmax + T_MIN;
			tperiod = t + T_PERIOD;
			
			while (t < tperiod)
			{
				t= new Date().getTime();
//				t= d.getTime();
				
				if (t >= tmax)
				{
					ui1.setDispMax();
				}
				
				if (t >= tmin)
				{
					ui1.setDispMin();
				}
				
				Thread.sleep(1000);
			}
		}
	}

}
