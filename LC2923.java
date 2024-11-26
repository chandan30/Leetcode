/*
 * There are n teams numbered from 0 to n - 1 in a tournament.

Given a 0-indexed 2D boolean matrix grid of size n * n. For all i, j that 0 <= i, j <= n - 1 and i != j team i is stronger than team j
 if grid[i][j] == 1, otherwise, team j is stronger than team i.

Team a will be the champion of the tournament if there is no team b that is stronger than team a.

Return the team that will be the champion of the tournament.
 * */
public class LC2923 {
public static void main(String[] args) {
	int[][] grid= {{0,1},{0,0}};
	int n=grid.length;
	int[] indegree=new int[n];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(grid[i][j]==1){
                indegree[i]++;
            }
        }
    }
    int max=Integer.MIN_VALUE;
    int i,index=0;
    for(i=0;i<n;i++) {
        if(indegree[i]>max) {
            max=Math.max(indegree[i], max);
            index=i;
        }
    }
    System.out.println(index);
}
}
