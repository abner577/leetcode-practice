package BFSPrac;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {

    ArrayList<Node> nodes;
    int[][] matrix;

    Graph(int size){
        nodes = new ArrayList<>();
        matrix = new int[size][size];
    }

    public void addNode(Node node) {
        nodes.add(node);
    }

    public void addEdge(int src, int dst) {
        matrix[src][dst] = 1;
    }

    public boolean checkEdge(int src, int dst) {
        return matrix[src][dst] == 1;
    }

    public void print() {
        System.out.print("  ");
        for(Node node : nodes) {
            System.out.print(node.data + " ");
        }
        System.out.println();

        for(int i = 0; i < matrix.length; i++) {
            System.out.print(nodes.get(i).data + " ");
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void bfsForDisconnected(){
        boolean[] visited = new boolean[matrix.length];
        for(int i =0; i < matrix.length; i++){
            if(!visited[i]) bfs(i, visited);
        }
    }
   public void bfs(int src, boolean[] visited){
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(src);
        visited[src] = true;
        while(!queue.isEmpty()){
            src = queue.poll();
            for(int i =0; i < matrix[src].length; i++){
                if(matrix[src][i] == 1 && !visited[i]){
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
   }
}
