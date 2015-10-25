//1.4 Write a method to replace all spaces with string '%20'.  Use char
// array if using Java so operation is performed in palced
public class OnePointFour_ReplaceAllSpacesWithString {

	public static void main(String[] args){
		replaceSpaces("Mr John Smiths", 13);
		
	}
	
	public static void replaceSpaces(String request, int arraySize){
		char[] charRequest = new char[arraySize];
		int spacesInString = 0;
		for(int i = 0; i < charRequest.length; i++){
			if(i > request.length()){
				charRequest[i] = ' ';
			}
			else{
				charRequest[i] = request.charAt(i);
				if(request.charAt(i) == ' '){
					spacesInString++;
				}
			}
		}
		
		for (int i = charRequest.length; i > 0; i++){
			
			
		}
		
		
	}
	
	private int stringSize = 3;
	
}
