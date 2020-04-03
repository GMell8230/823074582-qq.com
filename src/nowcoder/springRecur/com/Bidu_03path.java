/**
　 * Title: Bidu_03path.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年4月3日下午11:01:22
*/
package nowcoder.springRecur.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Bidu_03path {
	static int max = 0;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int []nodes = new int[n+1];
		for (int i = 1; i < nodes.length; i++) {
			nodes[i] = in.nextInt();
		}
		List<Integer> []graph = new ArrayList[n+1];
		for (int i = 0; i < graph.length; i++) {
			graph[i] = new ArrayList<Integer>();
		}
		for (int i = 0; i < n-1; i++) {
			int l = in.nextInt();
			int r = in.nextInt();
			graph[l].add(r);
			graph[r].add(l);
		}
		for (int i = 1; i < n; i++) {
			dfs(graph, nodes, i, 0);
		}
		System.out.println(max);
	}

	private static void dfs(List<Integer>[] graph, int[] nodes, int cur, int len) {
		len += 1;
		max = Math.max(len, max);
		List<Integer> nexts = graph[cur];
		for (int next : nexts) {
			if (nodes[next] > nodes[cur]) {
				dfs(graph, nodes, cur, len);
			}
		}
	}
}
