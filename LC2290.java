import java.util.PriorityQueue;

public class LC2290 {
	private final static int[][] directions = {{0,1},{0,-1},{1,0},{-1,0}};
public static void main(String[] args) {
	int[][] grid= {{0,1,1},{1,1,0},{1,1,0}};
	int finalresult=minimumObstacles(grid);
	System.out.println(finalresult);
}
	public static int minimumObstacles(int[][] grid) {
	    int r=grid.length;
	    int c=grid[0].length;
	    int result[][]=new int[r][c];
	    for(int i=0;i<r;i++) {
	    	for(int j=0;j<c;j++) {
	    		result[i][j]=Integer.MAX_VALUE;
	    	}
	    }
	    result[0][0]=grid[0][0];
	    PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
	    pq.add(new int[] { result[0][0], 0, 0 });
	    while (!pq.isEmpty()) {
	    	int[] current = pq.poll();
            int obstacles = current[0], row = current[1], col = current[2];
            if (row==r-1 && col==c-1) {
                return obstacles;
            }
            for (int[] dir : directions) {
                int newRow = row + dir[0], newCol = col + dir[1];

                if (isValid(grid, newRow, newCol)) {
                	int newObstacles = obstacles + grid[newRow][newCol];
                	 if (newObstacles < result[newRow][newCol]) {
                         result[newRow][newCol] = newObstacles;
                         pq.add(new int[] { newObstacles, newRow, newCol });
                }
             }    	 
	    }
	}
	    return  result[r-1][c-1];
	}
	    private static boolean isValid(int[][] grid, int row, int col) {
	        return (row>=0 && col>=0 && row<grid.length && col<grid[0].length);
	    }
}
