package srijit;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TexttoMorseCode {
	
	private static char[] letters = "abcdefghiojklmnopqrstuvwxyz".toCharArray();
	private static String[] morseAlphabet = {".-" , "-..." , "-.-." , "-.." , "." , "..-." , "--." , "...." , ".." , ".---" , "-.-" , ".-.." ,
			                             "--" , "-." , "---" , ".--." , "--.-" , ".-." , "..." , "-" , "..-" , "...-" , ".--" , "-..-" , "-.--" , "--.."};
	
	private static String[] morseNums = {"-----" , ".----" , "..---" , "...--" , "....-" , "....." , "-...." , "--..." , "---.." , "----."};
	
	
	public static String textToMorseCode(String text) {
		
		StringBuilder morseCodeString = new StringBuilder();
		
		for(char c:text.toLowerCase().toCharArray()) {
			if(c>='a' && c<='z') {
				morseCodeString.append(morseAlphabet[c-'a']).append(" ");
			}
			else if(c >= '0' && c<='9'){
				morseCodeString.append(morseNums[c-'0']).append(" ");
			}
			else if(c== ' ') {
				morseCodeString.append("/ ");
			}
		}
		
		return morseCodeString.toString();
		
	}
	
	

	public static void main(String[] args) {
		
		String inputFile = "C:\\Users\\sriji\\Interview_prep\\Java\\TexttoMorseCodeConverter\\input.txt";
		String outputFile = "C:\\Users\\sriji\\Interview_prep\\Java\\TexttoMorseCodeConverter\\output.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(inputFile));
				FileWriter writer = new FileWriter(outputFile)){
			
			String line;
			
			while((line = br.readLine())!=null) {
				String morseLine = textToMorseCode(line);
				writer.write(morseLine +'\n');
				
				
				
				
			}
			
			System.out.println("MorseCode Conversion completed");
			
		}catch(IOException e) {
			System.err.println("Error reading file" +e.getMessage());
		}
		

	}

}
