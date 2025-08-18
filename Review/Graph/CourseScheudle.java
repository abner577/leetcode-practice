package Review.Graph;

import java.util.ArrayList;
import java.util.List;

public class CourseScheudle {
    public static void main(String[] args) {

    }
    public boolean canFinish(int numCourses, int[][] prereq) {
        List<List<Integer>> graph = new ArrayList<>();
        int[] states = new int[numCourses];

        // gives every node/int a list which will represent their pre-reqs
        for(int i =0 ; i < numCourses; i++) graph.add(new ArrayList<>());

        for(int i =0; i < prereq.length; i++){
            int a = prereq[i][0];
            int b = prereq[i][1];
            graph.get(a).add(b);
        }

        for(int i =0; i < numCourses; i++){
            if(!dfs(graph, i, states)) return false;
        }
        return true;
    }

    private boolean dfs(List<List<Integer>> graph, int current, int[] states) {
        int state = states[current];
        if(state == 2) return true;
        else if (state == 1) return false;
        else {
            states[current] = 1;
        }

        for(int neighbor : graph.get(current)){
            if(!dfs(graph, neighbor, states)) return false;
        }
        states[current] = 2;
        return true;
    }
}
