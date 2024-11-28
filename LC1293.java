/*
 * You are given an m x n integer matrix grid where each cell is either 0 (empty) or 1 (obstacle). You can move up, down, left, or right
 *  from and to an empty cell in one step.
Return the minimum number of steps to walk from the upper left corner (0, 0) to the lower right corner (m - 1, n - 1) 
given that you can eliminate at most k obstacles. If it is not possible to find such walk return -1.
 * 
 * 
 * 
 * */
import java.util.LinkedList;
import java.util.Queue;

public class LC1293 {
	private final static int[][] directions = {{0,1},{0,-1},{1,0},{-1,0}};
public static void main(String[] args) {
	int[][] grid = {{0,0,0},{1,1,0},{0,0,0},{0,1,1},{0,0,0}};
	int k=1;
	int result= shortestPath(grid,k);
	System.out.println(result);
	
}
	public static int shortestPath(int[][] grid, int k) {
	    int m=grid.length;
	    int n=grid[0].length;
	    int result[][]=new int[m][n];
	    for(int i=0;i<m;i++){
	        for(int j=0;j<n;j++){
	            result[i][j]=Integer.MAX_VALUE;
	        }
	    }
	    result[0][0]=grid[0][0];
	   //PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
	   //pq.add(new int[] { result[0][0], 0, 0 });
	    Queue<int[]> pq = new LinkedList<>();
	    pq.add(new int[]{result[0][0], 0, 0, k}); // Initial state
	    boolean[][][] visited = new boolean[m][n][k + 1];
	    visited[0][0][k] = true;
	    while(!pq.isEmpty()){
	        int[] current=pq.poll();
	        int obstacle=current[0];
	        int row=current[1];
	        int col=current[2];
	        int rem=current[3];
	        if(row==m-1 && col==n-1)
	        return obstacle;
	
	    for(int[] dir:directions){
	        int newrow=dir[0]+row,newcol=col+dir[1];
	        if (isValid(grid, newrow, newcol)) {
	            	//int newObstacles = obstacle + grid[newrow][newcol];
	                int newK = rem - grid[newrow][newcol];
	                if (newK >= 0 && !visited[newrow][newcol][newK]) {
	                    visited[newrow][newcol][newK] = true;
	                    pq.add(new int[]{obstacle + 1, newrow, newcol, newK});
	                }
	            	/* if (newObstacles < result[newrow][newcol]) {
	                     result[newrow][newcol] = newObstacles;
	                     pq.add(new int[] { newObstacles, newrow, newcol });
	                    }*/
	         }    
	    }
	    }
	   // return result[m-1][n-1];
	    return -1;
	}

	private static boolean isValid(int[][] grid,int row, int col){
	    return (row>=0 && row<grid.length && col>=0 && col<grid[0].length);
	}

}
