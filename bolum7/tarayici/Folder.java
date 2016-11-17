
public class Folder {
	
	private Reporter r ; 
	
	public Folder(Reporter r) {
		this.r = r ; 
		getMessages();
	}
	
	public void getMessages() {
		// E-posta kutusuna gelen mesajlar aliniyor... 
		
		Object[] unzippedMessages = new Object[5];
		unzippedMessages[0] = new Object();		
		unzippedMessages[1] = new Object();
		unzippedMessages[2] = new Object();
		unzippedMessages[3] = new Object();
		unzippedMessages[4] = new Object();
		
		r.report("5 new messages downloaded...");
		
		Compactor c = new Compactor();
		Object[] o = c.zipIt(unzippedMessages);
		
		r.report("5 new messages compacted...");
	}
}
