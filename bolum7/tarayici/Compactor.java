
public class Compactor {

	
	
	public Object[] zipIt(Object[] messages) {
		
		// sIkIstirilmaMIs mesajlar
		Object[] zippedMessages = new Object[messages.length];
		
		//	mesajlar sIkIstiriliyor, oyle var sayalim...
		for (int i = 0; i < zippedMessages.length; i++) {
			zippedMessages[i] = new Object();
		}
		
		return zippedMessages;	
	}
}
