import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Main {

	public Main() {
	}

	public static void main(String args[]) throws Exception {
		Session session = new Session();
		String s = args[0];
		
		if (s.equals("1")) {
			StandardOutReporter standardoutreporter = new StandardOutReporter();
			session.download(standardoutreporter);
		} else if (s.equals("2")) {
			JTextArea jtextarea = new JTextArea();
			JTextComponentReporter jtextcomponentreporter =
				new JTextComponentReporter(jtextarea);
			session.download(jtextcomponentreporter);
			JOptionPane.showMessageDialog(null, jtextarea);
		} else {
			String s1 =
				"Yanlis secim..., E-postalarinizi " +
				"Metin tabanli okumak icin 1 " +
				"Grafik tabanli okumak icin 2 yaziniz...";
			throw new Exception("--> " + s1);
		}
	}
}