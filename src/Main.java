// punto di accesso 
import java.io.*;
import java.util.*;

// Script per testare i vari metodi che ci permettona la scrittura e lettura di file.

public class ReadMain {
	public static void main(String[] args) {
		String path = "C:\\Users\\Luca\\Desktop\\file.txt"; 
		
		try(TxtProcessing file = new TxtProcessing(path)){
			
			int c = file.countAllChar();
			System.out.println("Totale caratteri del testo:" + c);
			
		}
		catch(IOException e) {
			System.out.println("Errore:" + e.getMessage());
		}
		
		try(TxtProcessing file = new TxtProcessing(path)){
			char charIn;
			Scanner in = new Scanner(System.in);
				System.out.println("Inserire un singolo carattere, per contare le sue occorrenze nel file:");
				do{
					String input = in.nextLine();
					if(input.length() == 1) {
						charIn = input.charAt(0);
						int c1 = file.countSpecificChar(charIn);
						System.out.println("Il carattere " + charIn + ",  presente: " + c1 + " occorrenze.");
					}
					else {
						System.out.println("Inserire un solo carattere.");
						charIn = 0;
					}
					
					
				}while((charIn < 97 || charIn > 122)  && (charIn > 65 || charIn < 90));}
		catch(IOException e) {
			System.out.println("Errore:" + e.getMessage());
		}
		
		try(TxtProcessing file = new TxtProcessing(path)){
			String str = "o";
			if(file.containString(str))
				System.out.println("Il file contiene la stringa.");
			else
				System.out.println("Il file non contiene la stringa.");
			
		}
		catch(IOException e) {
			System.out.println("Errore:" + e.getMessage());
		}
		
		
		System.out.println("End");
		
}
	
}
