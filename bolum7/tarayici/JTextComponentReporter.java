
import java.util.Date;
import javax.swing.JTextArea;

	public class JTextComponentReporter implements Reporter {
		JTextArea comp;
		
		public JTextComponentReporter(JTextArea c) {
			this.comp = c ;		
		}
		
		public void report(String msg) {
			comp.append(msg + " at: " + new Date() + "\n");		
		}
	}
	
	
