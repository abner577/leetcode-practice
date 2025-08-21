package Review2.Graphs;

import java.util.ArrayList;
import java.util.List;

public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prereqs) {
        List<List<Integer>> graph = new ArrayList<>();
        int[] visited = new int[numCourses];

        // Create neighbors/pre-reqs list for each course
        for(int i =0; i < numCourses; i++) graph.add(new ArrayList<>());

        // Assign b to the pre-req list of a
        for(int[] prereq : prereqs) {
            int u = prereq[0];
            int v = prereq[1];
            graph.get(u).add(v);
        }

        // if even one course cant be taken, immediately return false
        for(int i =0; i < numCourses; i++) {
            if(!dfs(graph, i, visited)) return false;
        }
        return true;
    }

    private boolean dfs(List<List<Integer>> graph, int current, int[] visited) {
        if(visited[current] == 2) return true;
        else if (visited[current] == 1) return false;
        visited[current] = 1;

        int neighbors = graph.get(current).size();
        for(int i =0; i < neighbors; i++) {
            int neighbor = graph.get(current).get(i);
            if(!dfs(graph, neighbor, visited)) return false;
        }
        visited[current] = 2;
        return true;
    }
}
