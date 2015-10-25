
public class CharAsInt {

	public static void main(String[] args){
		
		boolean[] array = new boolean[256];
		for(boolean b : array)
			b = false;
		array['a'] = true;
		for(int i = 0; i < array.length; i++)
			if(array[i] == true)
				System.out.println(i);
		
	}
}
