import java.util.HashMap;

// CTCI 1.1 - Implement an algorithm to determine is a string has all unique
// characters.
// Bonus - Cannot use additional structure?

public class OnePointOneUniqueCharsInString {

	public static void main(String[] args){
		
		checkAllUniqueChars("hello");
		checkAllUniqueChars("word");
		checkAllUniqueChars("unique");
		checkAllUniqueChars("baby");
		checkAllUniqueChars("bell");
		
		checkAllUniqueCharsNoAdditionalStructures("hello");
		checkAllUniqueCharsNoAdditionalStructures("word");
		checkAllUniqueCharsNoAdditionalStructures("unique");
		checkAllUniqueCharsNoAdditionalStructures("baby");
		checkAllUniqueCharsNoAdditionalStructures("bell");
	}
	
	public static void checkAllUniqueChars(String uniqCharsRequest){
		char[] uniqChars = uniqCharsRequest.toCharArray();
		HashMap<Character, Boolean> uniqCharsHM = new HashMap<>();
		for(char c : uniqChars){
			if(uniqCharsHM.get(c) != null){
				String outputMessage = String.format("%s IS NOT ALL UNIQUE", uniqCharsRequest);
				System.out.println(outputMessage);
				return;
			}
			else
				uniqCharsHM.put(c, true);
		}
		
		String outputMessage = String.format("%s IS ALL UNIQUE", uniqCharsRequest);
				System.out.println(outputMessage);
	}
	
	public static void checkAllUniqueCharsNoAdditionalStructures(String request){
		for(int i = 0; i < request.length(); i++){
			for(int j = i + 1; j < request.length(); j++){
				if(request.charAt(i) == request.charAt(j)){
					String outputMessage = String.format("%s IS NOT ALL UNIQUE", request);
					System.out.println(outputMessage);
					return;
				}
			}
			
		}
		String outputMessage = String.format("%s IS ALL UNIQUE", request);
		System.out.println(outputMessage);
	}
}
