package Review.Graph.prac;

import java.util.ArrayList;
import java.util.List;

public class FindIfPathExistsPrac1 {
    public static void main(String[] args) {

    }
    public boolean validPath(int n, int[][] edges, int source, int destination){
        List<List<Integer>> graph = new ArrayList<>();

        for(int i =0;  i < n; i++) graph.add(new ArrayList<>());

        for(int i =0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        boolean[] visited = new boolean[n];
        return dfs(graph, source, destination, visited);
    }

    private boolean dfs(List<List<Integer>> graph, int current, int destination, boolean[] visited) {
        if(current == destination) return true;
        visited[current] = true;

        for(int i =0; i < graph.get(current).size(); i++){
            int neighbor = graph.get(current).get(i);
            if(!visited[neighbor]){
                if(dfs(graph, neighbor, destination, visited)) return true;
            }
        }
        return false;
    }
}
