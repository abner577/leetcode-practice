package Review.Graph.prac;

import java.util.ArrayList;
import java.util.List;

public class CourseScheduleIIPrac {
    public static void main(String[] args) {

    }
    public int[] findOrder(int numCourses, int[][] prereq){
        List<List<Integer>> graph = new ArrayList<>();
        int[] states = new int[numCourses];
        ArrayList<Integer> ordering = new ArrayList<>();

        for(int i =0; i < numCourses; i++) graph.add(new ArrayList<>());

        for(int i =0; i < prereq.length; i++){
            int a = prereq[i][0];
            int b = prereq[i][1];
            graph.get(a).add(b);
        }

        for(int i =0; i < numCourses; i++){
            if(!dfs(i, graph, states, ordering)) return new int[] {};
        }
        return ordering.stream().mapToInt(i -> i).toArray();
    }

    private boolean dfs(int current, List<List<Integer>> graph, int[] states, ArrayList<Integer> ordering) {
        if(states[current] == 2) return true;
        else if (states[current] == 1) return false;
        else states[current] = 1;

        for(int neighbor : graph.get(current)){
            if(!dfs(neighbor, graph, states, ordering)) return false;
        }
        ordering.add(current);
        states[current] = 2;
        return true;
    }
}
