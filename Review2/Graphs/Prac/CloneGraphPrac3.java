package Review2.Graphs.Prac;

public class CloneGraphPrac3 {
    /*
      public Node cloneGraph(Node node) {
        if(node == null) return null;
        HashMap<Node, Node> map = new HashMap<>();
        Set<Node> visited = new HashSet<>();

        // fills map and visited
        dfs(node, map, visited);

        for(Map.Entry<Node, Node> entry : map.entrySet()) {
            Node original = entry.getKey();
            Node copy = entry.getValue();

            for(Node neighbor : original.neighbors) copy.neighbors.add(map.get(neighbor));
        }
        return map.get(node);
    }

    public void dfs(Node current, HashMap<Node, Node> map, Set<Node> visited) {
        map.put(current, new Node(current.val));
        visited.add(current);

        for(Node neighbor : current.neighbors) {
            if(!visited.contains(neighbor)) dfs(neighbor, map, visited);
        }
    }
     */
}
