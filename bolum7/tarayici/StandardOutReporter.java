import java.util.Date;

	public class StandardOutReporter implements Reporter {		
		public void report(String msg) {
			System.out.println (msg + " at: " + new Date ());
			
		}
	}
	
	
