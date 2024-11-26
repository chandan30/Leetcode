
/**
 * @author CHANDAN
 * There are n teams numbered from 0 to n - 1 in a tournament; each team is also a node in a DAG.
You are given the integer n and a 0-indexed 2D integer array edges of length m representing the DAG, where edges[i] = [ui, vi]
indicates that there is a directed edge from team ui to team vi in the graph.
A directed edge from a to b in the graph means that team a is stronger than team b and team b is weaker than team a.
Team a will be the champion of the tournament if there is no team b that is stronger than team a.
Return the team that will be the champion of the tournament if there is a unique champion, otherwise, return -1.
 *
 */
public class LC2924 {
public static void main(String[] args) {
	int n = 3;
	int[][] edges = {{0,1},{1,2}};
	int[] indegree=new int[n];
	for(int[] edge:edges) {
		indegree[edge[1]]++;
	}
	int champ=-1;
	int count=0;
	for(int i=0;i<n;i++) {
		if(indegree[i]==0) {
			champ=i;
			count++;
		}
	}
	System.out.println(count>1?-1:champ);
}
}
