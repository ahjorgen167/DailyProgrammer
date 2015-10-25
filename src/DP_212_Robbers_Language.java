import java.util.*;

public class DP_212_Robbers_Language {

	public static void main(String args[]) {

		encodeRobbersLanguage("Jag talar R�varspr�ket!");
		encodeRobbersLanguage("I'm speaking Robber's language!");
		encodeRobbersLanguage("Tre Kronor �r v�rldens b�sta ishockeylag.");
		encodeRobbersLanguage("V�r kung �r coolare �n er kung.");
		
		decodeRobbersLanguage("JoJagog totalolaror RoR�vovarorsospopror�koketot!");
		decodeRobbersLanguage("I'mom sospopeakokinongog RoRobobboberor'sos lolanongoguagoge!");
		decodeRobbersLanguage("ToTrore KoKrorononoror �ror vov�rorloldodenonsos bob�sostota isoshohocockokeylolagog.");
		decodeRobbersLanguage("VoV�ror kokunongog �ror cocoololarore �non eror kokunongog.");
	}
	
	public static void decodeRobbersLanguage(String request){
		StringBuilder output = new StringBuilder();
		
		char tempChar;
		
		for (int i = 0; i < request.length(); i++) {
			tempChar = request.charAt(i);

			if ("qwrtpsdfghjklzxcvbnmQWRTPSDFGHJKLZXCVBNM".contains(String.format("%c", tempChar))) {
				output.append(String.format("%c", tempChar));
				i += 2;
			} else {
				output.append(String.format("%c", tempChar));
			}
		}
		
		Stack<Integer> stack = new Stack<Integer>();
		char[] hello = "hello".toCharArray();

		

	}
	
	
	public static void encodeRobbersLanguage(String request) {
		StringBuilder output = new StringBuilder();
		String tempChar;
		for (int i = 0; i < request.length(); i++) {
			tempChar = request.substring(i, i + 1);

			if ("qwrtpsdfghjklzxcvbnm".contains(tempChar.toLowerCase())) {
				output.append(String.format("%so%s", tempChar, tempChar.toLowerCase()));
			} else {
				output.append(String.format("%s", tempChar));
			}
		}
		System.out.println(output);
	}
}
