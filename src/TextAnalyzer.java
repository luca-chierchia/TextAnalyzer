import java.io.*;

public class TextAnalyzer extends FileReader {
	private String pathName;
	
	public TextAnalyzer (String pathName) throws FileNotFoundException {
		super(pathName);
		this.pathName = pathName;
	}
	
	// Conta ogni carattere presente nel file, ritorna il totale.
	public int countAllChar() throws IOException {
		int totalChar = 0;
		int charReader;
		while((charReader = this.read()) != -1) {
			totalChar++;
		}
		this.close();
		return totalChar;
		
	}
	
	// Conta ogni carattere specificato nel parametro, ritorna il totale del carattere parametro.
	public int countSpecificChar(char c) throws IOException {
		int countSpecificChar = 0;
		int charReader;
		int cToInt = (int) c;
		while((charReader = this.read())!= -1) {
			if(  cToInt == charReader)
				countSpecificChar++;
		}
		this.close();
		return countSpecificChar;
		
	}
	
	// Se il testo contiene la stringa passata come parametro, la funziona ritorna true.
	public boolean containString(String str) throws IOException {
	}
	
	

}
