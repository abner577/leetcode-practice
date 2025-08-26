package Review2.Graphs;

public class CloneGraph {
    /*
    public Node cloneGraph(Node node) {
        if(node == null) return null;
        HashMap<Node, Node> hashMap = new HashMap<>();
        Set<Node> visited = new HashSet<>();

        // goes through entire graph
        dfs(node, hashMap, visited);

        for(Map.Entry<Node, Node> entry : hashMap.entrySet()) {
            Node original = entry.getKey();
            Node copy = entry.getValue();

            for(Node neighbor : original.neighbors) copy.neighbors.add(hashMap.get(neighbor));
        }
        return hashMap.get(node);
    }

    public void dfs(Node current, HashMap<Node, Node> hashMap,  Set<Node> visited) {
        visited.add(current);
        hashMap.put(current, new Node(current.val));

        for(Node neighbor : current.neighbors) {
            if(!visited.contains(neighbor)) dfs(neighbor, hashMap, visited);
        }
    }
     */
}
