package Review2.Graphs.Prac;

import java.util.ArrayList;
import java.util.List;

public class CourseSchedulePrac2 {

    public boolean canFinish(int numCourses, int[][] prereqs) {
        List<List<Integer>> graph = new ArrayList<>();
        int[] visited = new int[numCourses];

        for(int i =0; i < numCourses; i++) graph.add(new ArrayList<>());

        for(int[] prereq : prereqs) {
            int a = prereq[0];
            int b = prereq[1];
            graph.get(a).add(b);
        }

        for(int i =0; i < numCourses; i++) {
            if(!dfs(i, graph, visited)) return false;
        }
        return true;
    }

    private boolean dfs(int current, List<List<Integer>> graph, int[] visited) {
        if(visited[current] == 2) return true;
        else if (visited[current] == 1) return false;
        visited[current] = 1;

        List<Integer> prereqs = graph.get(current);
        for(Integer prereq : prereqs) {
            if(!dfs(prereq, graph, visited)) return false;
        }

        visited[current] = 2;
        return true;
    }
}
