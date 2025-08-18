package GraphQuestions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CourseSchedule {
    public static void main(String[] args) {

    }
    public boolean canFinish(int numCourses, int[][] prereq) {
        List<List<Integer>> graph = new ArrayList<>();
        int[] states = new int[numCourses];

        for(int i =0; i < numCourses; i++){
            graph.add(new ArrayList<>());
        }

        for(int i =0 ; i < prereq.length; i++){
            int a = prereq[i][0];
            int b = prereq[i][1]; // [1,2]
            graph.get(a).add(b);
        }

        for(int i =0; i < numCourses; i++){
            if (!dfs(i, states, graph)) return false;
        }
        return false;
    }
    public static boolean dfs(int current, int[] states, List<List<Integer>> graph){
        int state = states[current];
        if(state == 2) return true;
        else if (state == 1) return false;
        states[current] = 1;

        for(int neighbor : graph.get(current)){
            if(!dfs(neighbor, states, graph)) return false;
        }
        states[current] = 2;
        return true;
    }
}
