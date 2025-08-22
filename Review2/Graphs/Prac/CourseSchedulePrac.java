package Review2.Graphs.Prac;

import java.util.ArrayList;
import java.util.List;

public class CourseSchedulePrac {
    public boolean canFinish(int numCourses, int[][] prereqs) {
        List<List<Integer>> graph = new ArrayList<>();
        int[] visited = new int[numCourses];

        // give pre-req list to each course
        for(int i =0; i < numCourses; i++) graph.add(new ArrayList<>());

        // fill in pre-req list
        for(int[] prereq : prereqs) {
            int u = prereq[0];
            int v = prereq[1];
            graph.get(u).add(v);
        }

        // if any courses return false, immediately exit and return false
        for(int i =0; i < numCourses; i++) {
            if(!dfs(i, graph, visited)) return false;
        }
        return true;
    }

    private boolean dfs(int current, List<List<Integer>> graph, int[] visited) {
        if(visited[current] == 2) return true;
        else if (visited[current] == 1) return false;
        visited[current] = 1;

        // Loop through pre-req courses of current course, if any return false, immediately exit
        List<Integer> neighbors = graph.get(current);
        for(int neighbor : neighbors) {
            if(!dfs(neighbor, graph, visited)) return false;
        }

        // else, mark the current course as visited
        visited[current] = 2;
        return true;
    }
}
