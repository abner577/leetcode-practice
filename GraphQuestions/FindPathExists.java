package GraphQuestions;

import java.util.ArrayList;
import java.util.List;

public class FindPathExists {
    public static void main(String[] args) {

    }
    public boolean validPath(int n, int[][] edges, int source, int destination){
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        boolean[] visited = new boolean[n];
        return dfs(graph, visited, source, destination);
    }
    private boolean dfs(List<List<Integer>> graph, boolean[] visited, int current, int destination) {
        if(current == destination) return true;
        visited[current] = true;

        for(int i = 0; i < graph.get(current).size(); i++){
            int neighbor = graph.get(current).get(i);
            if(!visited[neighbor]){
                if(dfs(graph, visited, neighbor, destination)) return true;
            }
        }
        return false;
    }
}
