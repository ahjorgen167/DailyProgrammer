import java.util.*;

public class DP_238_ConsonantsAndVowels {
	
	static String vowels = "aeiouy";
	static String consonants = "bcdfghjklmnpqrstvwxz";
	
	public static void main(String[] args){
		System.out.println(newWord("cvcvcc"));
		System.out.println(newWord("CcvV"));
		System.out.println(newWord("cvcvcvcvcvcvcvcvcvcv"));
	}
	
	public static String newWord(String request){
		StringBuilder output = new StringBuilder();
		for(int i = 0; i < request.length(); i++){
			switch(request.charAt(i)){
				case 'C':	
				case 'c':	output.append(randConsonant());
							break;
				case 'V':	
				case 'v':	output.append(randVowel());
							break;
			}
		}
		return output.toString();
	}
	
	public static char randVowel(){
		Random rand = new Random();
		return vowels.charAt(rand.nextInt(vowels.length()));
	}
	
	public static char randConsonant(){
		Random rand = new Random();
		return consonants.charAt(rand.nextInt(consonants.length()));
	}
}
