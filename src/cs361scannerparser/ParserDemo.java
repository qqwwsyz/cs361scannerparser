package cs361scannerparser;

public class ParserDemo {

	public static void main(String[] args) {

		// Change the path!
		// TokenStream tStream = new TokenStream("C:\\\\Users\\\\cscharff\\\\eclipse-workspace\\\\ScannerSolution\\\\src\\\\prog1.jay");
		 
		TokenStream tStream = new TokenStream("C:\\\\Users\\\\ZHEMING\\\\eclipse-workspace\\\\cs361scannerparser\\\\owntesterparser.jay");
		
		ConcreteSyntax cSyntax = new ConcreteSyntax(tStream);
		
		
		
		Program p = cSyntax.program();
		System.out.println(p.display());
		System.out.println("test");
	}

}