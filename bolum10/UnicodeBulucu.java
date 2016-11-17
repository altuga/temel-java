
public class UnicodeBulucu {


public static StringBuffer unicodeBul(String kelime) {

		char[] ac = kelime.toCharArray();
		int iValue;
		String s = null;
		StringBuffer sb = new StringBuffer();

		for( int ndx = 0; ndx < ac.length; ndx++ ) {
			iValue = ac[ndx];

			if( iValue < 0x10 ) {
				s = "\\u000";
			} else
				if( iValue < 0x100 ) {
				s = "\\u00";
			} else
				if( iValue < 0x1000 ) {
				s = "\\u0";
			}

			sb.append( s + Integer.toHexString( iValue ) );
		} // end for
		return sb;

	}

	public static StringBuffer unicodeBul(char[] kelime) {

		char[] ac = kelime;
		int iValue;
		String s = null;
		StringBuffer sb = new StringBuffer();

		for( int ndx = 0; ndx < ac.length; ndx++ ) {
			iValue = ac[ndx];

			if( iValue < 0x10 ) {
				s = "\\u000";
			} else
				if( iValue < 0x100 ) {
				s = "\\u00";
			} else
				if( iValue < 0x1000 ) {
				s = "\\u0";
			}

			sb.append( s + Integer.toHexString( iValue ) );
		} // end for
		return sb; 
	}
}
