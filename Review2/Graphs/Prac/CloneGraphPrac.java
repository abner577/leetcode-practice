package Review2.Graphs.Prac;

public class CloneGraphPrac {
    /*
    public Node cloneGraph(Node node) {
        if(node == null) return null;
        HashMap<Node, Node> map = new HashMap<>();
        Set<Node> visited = new HashSet<>();

        // fill map, visited, therefore giving us references to the copies
        dfs(node, map, visited);

        // Now need to loop through map and build new graph
        for(Map.Entry<Node, Node> entry : map.entrySet()) {

            Node original = entry.getKey();
            Node copy = entry.getValue();

            // loop through originals neighbors, add the copy of those to the copy
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
