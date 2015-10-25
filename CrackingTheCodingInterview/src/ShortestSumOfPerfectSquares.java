import java.util.ArrayList;
import java.util.Collections;


public class ShortestSumOfPerfectSquares {

	public static void main(String[] args){
		int[] squares = {1, 4, 9};
		findShortestSums(12, squares);
	}
	
	public static void findShortestSums(int request, int[] perfectSquares){
		
		int[][] solution = new int[request + 1][perfectSquares.length];
		int[] minCoin = new int[request + 1];
		int runningMin = Integer.MAX_VALUE;
		minCoin[0] = 0;
		
		
		for(int i = 1; i <= request; i++){
			for(int j = 0; j < perfectSquares.length; j++){
				runningMin = Integer.MAX_VALUE;
				if(i >= perfectSquares[j]){
					if(runningMin > minCoin[i - perfectSquares[j]] + 1){
						runningMin = minCoin[i - perfectSquares[j]] + 1;
						for(int k = 0; k < perfectSquares.length; ++k){
							solution[i][k] = solution[i - perfectSquares[j]][k];
						}
						solution[i][j]++;
					}
				}
				
			}
			minCoin[i] = runningMin;
		}
		
		for(int i = 0; i < perfectSquares.length; i++){
			System.out.println(perfectSquares[i] + " : " + solution[request][i]);
		}
	}
	
}
