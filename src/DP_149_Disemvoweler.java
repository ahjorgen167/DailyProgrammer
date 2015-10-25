
public class DP_149_Disemvoweler {

	public static void main(String args[]){
		disemvowel("two drums and a cymbal fall off a cliff");
		disemvowel("all those who believe in psychokinesis raise my hand");
		disemvowel("did you hear about the excellent farmer who was outstanding in his field");
	}
	
	
	public static void disemvowel(String request){
		System.out.printf("%s\n",request.replaceAll("[aeoiu ]", ""));	
		System.out.printf("%s\n",request.replaceAll("[^aeiou]", ""));
	}
}
