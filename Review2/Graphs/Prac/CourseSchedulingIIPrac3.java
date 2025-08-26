package Review2.Graphs.Prac;

import java.util.ArrayList;
import java.util.List;

public class CourseSchedulingIIPrac3 {

    public int[] findOrder(int numCourses, int[][] prereqs) {
        List<List<Integer>> graph =  new ArrayList<>();
        List<Integer> ordering = new ArrayList<>();
        int[] visited = new int[numCourses];

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

    private boolean dfs(int current, List<List<Integer>> graph, int[] visited, List<Integer> ordering) {
        if(visited[current] == 2) return true;
        else if (visited[current] == 1) return false;
        visited[current] = 1;

        for(int prereq : graph.get(current)) {
            if(!dfs(prereq, graph, visited, ordering)) return false;
        }

        ordering.add(current);
        visited[current] = 2;
        return true;
    }
}
