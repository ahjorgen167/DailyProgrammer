import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class DP_238_SearchingADungeon {

	public static class Point{
		int level;
		int x;
		int y;
		boolean changeMap = true;
		Point parent;
		
		public Point(){}
		
		public Point(Point parent, int x, int y, int level){
			this.x = x;
			this.y = y;
			this.level = level;
			this.parent = parent;
			changeMap = true;
		}
		
		public void dontChangeMap(){
			changeMap = false;
		}
		
		public String toString(){
			return String.format("X: %d, Y:%d, Level:%d\n", x, y, level);
		}
	}
	
	public static void main(String[] args) throws Exception{
		LinkedList<ArrayList<char[]>> dungeon = new LinkedList<ArrayList<char[]>>();
		ArrayList<char[]> floor = new ArrayList<char[]>();
 		FileReader fr = new FileReader("dungeon");
 		BufferedReader br = new BufferedReader(fr);
 		Point start = null;
 		char[] line;
 		String temp;
 		Boolean foundStart = false;
 		while ((temp = br.readLine()) != null) {
 			if(temp.equals(";")){
 				dungeon.addFirst(floor);
 				floor = new ArrayList<char[]>();
 				if(start != null)
 					start.level++;
 			} else {
 				line = temp.toCharArray();
 				floor.add(line);
 				if(!foundStart && temp.contains("S")){
 					start = new Point(null, temp.indexOf("S"), floor.size() - 1, dungeon.size() - 1);
 					foundStart = true;
 				}
 			}
 		}
 		start.dontChangeMap();
 		findPath(dungeon, start); 		
	}
	
	public static void findPath(LinkedList<ArrayList<char[]>>  dungeon, Point start){
		 boolean[][][] visited = new boolean[dungeon.size()][dungeon.get(0).size()][dungeon.get(0).get(0).length];
		 visited[start.level][start.y][start.x] = true;
		 Stack<Point> stack = new Stack<Point>();
		 stack.push(start);
		 Point curPoint;
		 char icon;
		 while(!stack.isEmpty()){
			 curPoint = stack.pop();
			 for(Point p : getNeighbors(curPoint)){
				 if(!visited[p.level][p.y][p.x]){
					 visited[p.level][p.y][p.x] = true;
					 icon = getMapValue(dungeon, p);
					 if(icon == '#'){
						 continue;
					 } else if(icon == 'U'){
						 p.level++;
						 p.dontChangeMap();
						 stack.push(p);
					 } else if(icon == 'G'){
						 p.dontChangeMap();
						 printPath(dungeon, p);
						 return;
					 } else if(icon == 'D'){
						 p.dontChangeMap();
						 p.level--;
						 stack.push(p);
					 } else {
						 stack.push(p);
					 }
				 }
			 }
		 }
	}
	
	public static void printPath(LinkedList<ArrayList<char[]>>  dungeon, Point point){
		
		while(point != null){
			if(point.changeMap)
				dungeon.get(point.level).get(point.y)[point.x] = '*';
			point = point.parent;
		}
		for(ArrayList<char[]> f : dungeon){
			for(char[] l : f){
				System.out.println(l);
			}
			System.out.println();
		}
	}
	
	public static char getMapValue(LinkedList<ArrayList<char[]>>  dungeon, Point point){
		return dungeon.get(point.level).get(point.y)[point.x];
	}
	
	public static List<Point> getNeighbors(Point point){
		List<Point> neighbors = new ArrayList<Point>();
		neighbors.add(new Point(point, point.x - 1, point.y, point.level));
		neighbors.add(new Point(point, point.x + 1, point.y, point.level));
		neighbors.add(new Point(point, point.x, point.y - 1, point.level));
		neighbors.add(new Point(point, point.x, point.y + 1, point.level));
		
		return neighbors;
	}
	
}
