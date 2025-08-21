package Review2.Graphs.Prac;

import java.util.ArrayList;
import java.util.List;

public class FindIfPathExistsInGraphPrac2 {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph = new ArrayList<>();
        boolean[] visited = new boolean[n];

        // create neighbor lists for each vertex
        for(int i =0; i < n; i++) graph.add(new ArrayList<>());

        // fill neighbor lists
        for(int i=0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        return dfs(graph, visited, source, destination);
    }

    private boolean dfs(List<List<Integer>> graph, boolean[] visited, int current, int destination) {
        if(current == destination) return true;
        visited[current] = true;

        int neighbors = graph.get(current).size();
        for(int i =0; i < neighbors; i++) {
            int neighbor = graph.get(current).get(i);
            if(!visited[neighbor]) {
                if(dfs(graph, visited, neighbor, destination)) return true;
            }
        }
        return false;
    }
}
