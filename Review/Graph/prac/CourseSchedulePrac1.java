package Review.Graph.prac;

import java.util.ArrayList;
import java.util.List;

public class CourseSchedulePrac1 {
    public static void main(String[] args) {

    }
    public boolean canFinish(int numCourses, int[][] prereq) {
        List<List<Integer>> graph = new ArrayList<>();
        int[] states = new int[numCourses];

        for(int i =0; i < numCourses; i++) graph.add(new ArrayList<>());

        for(int i =0; i < prereq.length; i++){
            int a = prereq[i][0];
            int b = prereq[i][1];
            graph.get(a).add(b);
        }

        for(int i =0; i < numCourses; i++){
            if(!dfs(i, graph, states)) return false;
        }
        return true;
    }

    private boolean dfs(int current, List<List<Integer>> graph, int[] states) {
        if(states[current] == 2) return true;
        else if (states[current] == 1) return false;
        else states[current] = 1;

        for(int i =0; i < graph.get(current).size(); i++){
            int neighbor = graph.get(current).get(i);
            if(!dfs(neighbor, graph, states)) return false;
        }

        states[current] = 2;
        return true;
    }
}
