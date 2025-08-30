package Review2.Graphs.Prac;

import java.util.ArrayList;
import java.util.List;

public class CourseScheduleIIPrac4 {

    public int[] findOrder(int numCourses, int[][] prereqs) {
        List<List<Integer>> graph = new ArrayList<>();
        int[] visited = new int[numCourses];
        List<Integer> ordering = new ArrayList<>();

        for(int i =0; i < numCourses; i++) graph.add(new ArrayList<>());

        for(int[] prereq : prereqs) {
            int a = prereq[0];
            int b = prereq[1];
            graph.get(a).add(b);
        }

        for(int i =0; i < numCourses; i++) {
            if(!dfs(i, graph, visited, ordering)) return new int[]{};
        }
        return ordering.stream().mapToInt(i -> i).toArray();
    }

    private boolean dfs(int current, List<List<Integer>> graph,
                        int[] visited, List<Integer> ordering) {
        if(visited[current] == 2) return true;
        else if (visited[current] == 1) return false;
        visited[current] = 1;

        List<Integer> neighbors = graph.get(current);
        for(int neighbor : neighbors) {
            if(!dfs(neighbor, graph, visited, ordering)) return false;
        }

        visited[current] = 2;
        ordering.add(current);
        return true;
    }
}
