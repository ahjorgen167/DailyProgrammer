import java.io.*;
import java.util.*;

public class Test {

	public static void main(String args[]) throws Exception {
		//System.out.println(test(10, "-20 -3916237 30"));
		System.out.println(Integer.MAX_VALUE);
		//test();

		
	}
	
	public static void test(){
		Scanner in = new Scanner(System.in);
		int tests = in.nextInt();
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int length;
		for(int i = 0; i < tests; i++){
			length = in.nextInt();
			for(int j = 0; j < length; j++){
				numbers.add(in.nextInt());
			}
			maxSubarray(numbers);
			numbers.clear();
		}	
	}
	
	public static void maxSubarray(ArrayList<Integer> numbers){
		if(numbers.size() == 0){
			return;
		}
		int cur_cont = numbers.get(0);
		int best_non_cont = numbers.get(0);
		int best_cont = numbers.get(0);
		int val, non_cont_val;
		for(int i = 1; i < numbers.size(); i++){
			val = cur_cont + i;
			non_cont_val = best_non_cont + i;
			if(non_cont_val > best_non_cont){
				best_non_cont = non_cont_val;
			}
			
			if(val < best_cont){
				cur_cont = 0;
			}
		}
		
		System.out.println(best_cont + " " + best_non_cont);
	}
}
		
		/*
		Scanner in = new Scanner(System.in);
		int tests = in.nextInt();
		int edges, nodes, node1, node2, start;
		HashMap<Integer, LinkedList<Integer>> graph = new HashMap<Integer, LinkedList<Integer>>();
		
		for(int i = 0; i < tests; i++){
			nodes = in.nextInt();
			edges = in.nextInt();
			for(int j = 0; j < edges; j++){
				node1 = in.nextInt();
				node2 = in.nextInt();
				if(graph.get(node1) == null){
					graph.put(node1, new LinkedList<Integer>());
				}
				if(graph.get(node2) == null){
					graph.put(node2, new LinkedList<Integer>());
				}
				graph.get(node1).add(node2);
				graph.get(node2).add(node1);
			}
			start = in.nextInt();
			shortestPath(start, nodes, graph);
			graph.clear();;
		}
	}
	
	public static void shortestPath(int start, int nodes, HashMap<Integer, LinkedList<Integer>> graph){
		HashMap<Integer, Integer> shortestPath = new HashMap<Integer, Integer>();
		HashMap<Integer, Boolean> visited = new HashMap<Integer, Boolean>();
		LinkedList<Integer> queue = new LinkedList<Integer>();
		queue.add(start);
		shortestPath.put(start, 0);
		int node;
		while(!queue.isEmpty()){
			node = queue.remove();
			if(visited.get(node) == null || visited.get(node) == false){
				visited.put(node, true);
				for(int nextNode : graph.get(node)){
					if(shortestPath.get(nextNode) == null || 
							shortestPath.get(nextNode) > shortestPath.get(node) + 6){
						shortestPath.remove(nextNode);
						shortestPath.put(nextNode, shortestPath.get(node) + 6);
						queue.add(nextNode);
					}
				}
			}
		}
		for(int i = 1; i <= nodes; i++){
			if(i != start){
				if(shortestPath.get(i) == null){
					System.out.print("-1 ");
				} else {
					System.out.print(shortestPath.get(i) + " ");
				}
			}
			
		}*/
