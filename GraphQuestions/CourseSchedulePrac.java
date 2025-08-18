package GraphQuestions;

import java.util.ArrayList;
import java.util.List;

public class CourseSchedulePrac {
    public static void main(String[] args) {

    }
    public static boolean course(int numCourses, int[][] prereq){
        List<List<Integer>> graph = new ArrayList<>();
        int[] states = new int[numCourses];

        for(int i =0; i < numCourses; i++){
            graph.add(new ArrayList<>());
        }

        for(int i =0; i < prereq.length; i++){
            int a = prereq[i][0];
            int b = prereq[i][1];
            graph.get(a).add(b);
        }

        for(int i =0; i < numCourses; i++){
            if(!dfs(states, numCourses,graph)) return false;
        }
        return true;
    }

    private static boolean dfs(int[] states, int current, List<List<Integer>> graph) {
        if(states[current] == 2) return true;
        if(states[current] == 1) return false;
        states[current] = 1;

        for(int neighbor : graph.get(current)){
            if(!dfs(states, neighbor, graph)) return false;
        }
        states[current] = 2;
        return true;
    }
}
