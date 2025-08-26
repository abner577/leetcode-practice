package Review2.Graphs.Prac;

import java.util.ArrayList;
import java.util.List;

public class FindIfPathExistsInGraphPrac3 {

    public boolean validPath(int n, int[][] edges, int source, int destination){
        List<List<Integer>> graph = new ArrayList<>();
        boolean[] visited = new boolean[n];

        for(int i =0; i < n; i++) graph.add(new ArrayList<>());

        for(int i =0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        return dfs(source, graph, visited, destination);
    }

    private boolean dfs(int current, List<List<Integer>> graph, boolean[] visited, int destination) {
        if(current == destination) return true;
        visited[current] = true;

        int neighbors = graph.get(current).size();
        for(int i =0; i < neighbors; i++) {
            int neighbor = graph.get(current).get(i);
            if(!visited[neighbor]) {
                if(!dfs(neighbor, graph, visited, destination)) return false;
            }
        }
        return true;
    }
}
