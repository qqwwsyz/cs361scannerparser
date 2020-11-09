package cs361scannerparser;
/**
 * @author scharffc
 *  ZHEMING AND GUO COMPLETED
 */ 
public class ScannerDemo {

<<<<<<< HEAD
	private static String file1 = "C:\\Users\\ZHEMING\\eclipse-workspace\\cs361scannerparser\\owntester.jay";
=======
	private static String file1 = "/Users/guotang/eclipse-workspace/cs361scannerparser.zip_expanded/cs361scannerparser/prog1.jay";
>>>>>>> master
	private static int counter = 1;
	private static Token tk;
	public static void main(String args[]) {
		TokenStream ts = new TokenStream(file1);
		System.out.println(file1);
		while (!ts.isEndofFile()) {
<<<<<<< HEAD
			// COMPLETED
=======
			
>>>>>>> master
			while (!ts.isEndofFile()) {
				tk = ts.nextToken();
				
			System.out.println("Token " + counter++ + " - Type: " + tk.getType() + " - Value: " + tk.getValue());
		}
		}
}
	}