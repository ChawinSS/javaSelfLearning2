import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
	
	public static void main(String[] args) {
		
		// Timer = 		A facility for threads to schedule tasks 
		//				for future execution in a background thread
		
		// TimerTask = 	A task that can be scheduled for one-time 
		//				or repeated execution by a Timer
		
		Timer timer = new Timer();
		
		TimerTask task = new TimerTask() {
			
			int counter =10;
			@Override
			public void run() {
			if(counter>0){
				System.out.println(counter+" seconds");
				counter--;
			}
			else{
				System.out.println(" happy newyear");
				timer.cancel();
			}
		}	
		};
		
		timer.scheduleAtFixedRate(task, 0, 1000);
}

}
