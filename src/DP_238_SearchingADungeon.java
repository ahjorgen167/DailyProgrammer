import java.util.*;


public class DP_238_SearchingADungeon {

	public class Point{
		int level;
		int x;
		int y;
		Point parent;
		
		public Point(){}
		
		public Point(Point parent, int x, int y, int level){
			this.x = x;
			this.y = y;
			this.level = level;
			this.parent = parent;
		}
	}
	
	public static void main(String[] args){
		System.out.println();
		
	}
	
	public static void findPath(char[][][] dungeon, Point start){
		 boolean[][][] visited = new boolean[dungeon.length][dungeon[0].length][dungeon[0][0].length];
		 Stack<Point> stack = new Stack<Point>();
		 stack.push(start);
		 Point temp;
		 while(!stack.isEmpty()){
			 temp = stack.pop();
			 
			 
		 }
	}
}
