
/*
 * You are given a m x n matrix grid consisting of non-negative integers where grid[row][col] represents the minimum time required to
 *  be able to visit the cell (row, col), which means you can visit the cell (row, col) only when the time you visit it is greater
 *   than or equal to grid[row][col].
You are standing in the top-left cell of the matrix in the 0th second, and you must move to any adjacent cell in the four
 directions: up, down, left, and right. Each move you make takes 1 second.
Return the minimum time required in which you can visit the bottom-right cell of the matrix. If you cannot visit
 the bottom-right cell, then return -1
 * 
 * 
 * 
*/import java.util.PriorityQueue;

public class LC2577 {
	private final static int[][] directions= {{1,0},{-1,0},{0,1},{0,-1}};
	public static void main(String[] args) {
		int grid[][]= {{0,1,3,2},{5,1,2,5},{4,3,8,6}};
		int result=minimumTime(grid);
		System.out.println(result);

	}
	public static int minimumTime(int[][] grid) {
		int m=grid.length;
		int n=grid[0].length;
		if(grid[0][1]>1 && grid[1][0]>1){
			return -1;
		}
		boolean visited[][]=new boolean[m][n];


		PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
		pq.add(new int[] { grid[0][0], 0, 0 });
		while(!pq.isEmpty()){
			int[] current = pq.poll();
			int time=current[0];
			int row=current[1];
			int col=current[2];

			if(row==m-1 && col==n-1){
				return time;
			}
			if(visited[row][col]){
				continue;
			}
			visited[row][col]=true;
			for(int[] dir:directions){
				int newx=row+dir[0];
				int newy=col+dir[1];
				if(!isValid(visited,newx,newy)){
					continue;
				}

				int wait=((grid[newx][newy]-time)%2==0)?1:0;
				int nexttime=Math.max(grid[newx][newy]+wait,time+1);
				pq.add(new int[]{nexttime,newx,newy});
			}
		}
		return -1;

	}

	private static boolean isValid(boolean[][] visited,int row,int col){
		return (row>=0 && row<visited.length && col>=0 && col<visited[0].length && !visited[row][col]);
	}
}
