package GraphQuestions;

import java.util.ArrayList;
import java.util.List;

public class CourseSchedule2 {
    public static void main(String[] args) {

    }
    public int[] findOrder(int numCourses, int[][] prereq){
        List<List<Integer>> graph = new ArrayList<>();
        int[] states = new int[numCourses];
        ArrayList<Integer> result = new ArrayList<>();

        for(int i =0; i < numCourses; i++){
            graph.add(new ArrayList<>());
        }
        for(int i =0; i < prereq.length; i++){
            int a = prereq[i][0];
            int b = prereq[i][1];
            graph.get(a).add(b);
        }

        for(int i =0; i < numCourses; i++){
            if(!dfs(i, graph, states, result)) return new int[] {};
        }
       return result.stream().mapToInt(i -> i).toArray();
    }

    private boolean dfs(int current, List<List<Integer>> graph, int[] states, ArrayList<Integer> result) {
        if(states[current] == 2) return true;
        if(states[current] == 1) return false;
        states[current] = 1;

        for(int neighbor : graph.get(current)){
            if(!dfs(neighbor, graph, states, result)) return false;
        }
        states[current] = 2;
        result.add(current);
        return true;
    }
}
