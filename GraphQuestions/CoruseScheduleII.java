package GraphQuestions;

import java.util.ArrayList;
import java.util.List;

public class CoruseScheduleII {
    public static void main(String[] args) {

    }
    public static int[] findOrder(int numCourses, int[][] prereq){
        List<List<Integer>> graph = new ArrayList<>();
        int[] states = new int[numCourses];
       ArrayList<Integer> ordering = new ArrayList<>();

        for(int i =0; i < numCourses; i++){
            graph.add(new ArrayList<>());
        }

        for(int i =0; i < prereq.length; i++){
            int a = prereq[i][0];
            int b = prereq[i][1];
            graph.get(a).add(b);
        }

        for(int i =0; i < numCourses; i++){
            if(!dfs(states, i, graph, ordering)) return new int[] {};
        }
        return ordering.stream().mapToInt(i -> i).toArray();
    }

    private static boolean dfs(int[] states, int current, List<List<Integer>> graph, ArrayList<Integer> ordering) {
        if(states[current] == 2) return true;
        if(states[current] == 1) return false;
        states[current] = 1;

        for(int neighbor : graph.get(current)){
             if(!dfs(states, neighbor, graph, ordering)) return false;
        }
        states[current] = 2;
        ordering.add(current);
        return true;
    }
}
