
public class Session {

	private String username ; 
	private String password ; 
	
	public void download(Reporter r) throws Exception {
		/*
		 * gerekli kullanici adi
		 * ve sifre kontroller, yapiliyor.
		 * Bunlarin dogru oldugunu varsayalim
		 */
		boolean go = true ; 
		
		if (go) { // dogru kullanici
			r.report("Starting downloading...");
			Folder f = new Folder(r);
			r.report("Finishing downloading...");
			
		} else {			
			throw new Exception("Access Denied"); 
		}
		
		
		
	}

}
