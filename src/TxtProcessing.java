import java.io.*;
import java.lang.*;

public class TxtProcessing extends FileReader {
	private String pathName;
	public int charReader;
	
	public TxtProcessing (String pathName) throws FileNotFoundException {
		super(pathName);
		this.pathName = pathName;
	}
	
	// Conta ogni carattere presente nel file, ritorna il totale.
	public int countAllChar() throws IOException {
		int totalChar = 0;
		
		while((this.charReader = this.read()) != -1) {
			totalChar++;
		}
		this.close();
		return totalChar;
		
	}
	
	// Conta ogni carattere specificato nel parametro, ritorna il totale del carattere parametro.
	public int countSpecificChar(char c) throws IOException {
		int countSpecificChar = 0;
	
		int cToInt = (int) c;
		while((this.charReader = this.read())!= -1) {
			if(  cToInt == this.charReader)
				countSpecificChar++;
		}
		this.close();
		return countSpecificChar;
		
	}
	
	// Se il testo contiene la stringa passata come parametro, la funziona ritorna true.
	public boolean containString(String str) throws IOException {
		int lengthString = str.length();
		char currentChar = (char) this.charReader;
		StringBuffer stringBuffer = new StringBuffer();
		while((this.charReader = this.read()) != -1) {
			if(currentChar != '\n' && currentChar != ' ')
				stringBuffer.append(currentChar);					// aggiungi i caratteri a StringBuffer;
			
			 if (stringBuffer.length() == lengthString) {
                 // Confronta la stringa nel buffer con la stringa target
                 if (stringBuffer.toString().equals(str)) {
                     return true;
                 }
                 // Rimuove il primo carattere per far spazio a nuovi caratteri
                 stringBuffer.deleteCharAt(0);
		}
		
	}
	this.close();
	return false;
	
	}
}

