package Review2.Graphs;

import java.util.ArrayList;
import java.util.List;

public class CourseScheduleII {
    public int[] findOrder(int numCourses, int[][] prereqs){
        List<List<Integer>> graph = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();
        int[] visited = new int[numCourses];

        for(int i =0; i < numCourses; i++) graph.add(new ArrayList<>());

        for(int[] prereq : prereqs) {
            int u = prereq[0];
            int v = prereq[1];
            graph.get(u).add(v);
        }

        for(int i =0; i < numCourses; i++) {
         if(!dfs(i, graph, answer, visited)) return new int[]{};
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }

    private boolean dfs(int current, List<List<Integer>> graph, List<Integer> answer, int[] visited) {
        if(visited[current] == 2) return true;
        else if(visited[current] == 1) return false;
        visited[current] = 1;

        int neighbors = graph.get(current).size();
        for(int i =0; i < neighbors; i++) {
            int neighbor = graph.get(current).get(i);
            if(!dfs(neighbor, graph, answer, visited)) return false;
        }
        answer.add(current);
        visited[current] = 2;
        return true;
    }
}
