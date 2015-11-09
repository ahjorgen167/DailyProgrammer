import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
public class DP_240_Typoglycemia {
	
	public static void main(String[] args) throws Exception{
		FileReader fr = new FileReader("typoglycemia_sample");
		BufferedReader br = new BufferedReader(fr);
		String temp;
		
		while ((temp = br.readLine()) != null) {
			System.out.println(typoglycemiaMix(temp));
		}
		fr.close();
	}
	
	public static String typoglycemiaMix(String str){
		String[] wordList = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for(String s : wordList){
			s = typoglycemiaMixHelper(s);
			sb.append(s + " ");
		}
		return sb.deleteCharAt(str.length() - 1).toString();
	}
	
	public static String typoglycemiaMixHelper(String str){
		int stringLength = str.length() - 2;
		if(str.endsWith(".") || str.endsWith(",") || str.endsWith("!") || str.endsWith("?") || str.endsWith(";"))
			stringLength++;
		if(str.length() <= 2){
			return str;
		}
		char[] request = str.toCharArray();
		Random rand = new Random();
		for(int i = 1; i < stringLength; i++)
		{
			int randomIndex = rand.nextInt(stringLength - 1) + 1;
			char tempChar = request[i];
			request[i] = request[randomIndex];
			request[randomIndex] = tempChar;
		}
		return new String(request);
	}

}
