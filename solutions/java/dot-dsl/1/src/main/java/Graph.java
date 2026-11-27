import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class Graph {

    Collection<Node> nodes = new ArrayList<>();
    Collection<Edge> edges = new ArrayList<>();
    Map<String, String> attributes = Collections.emptyMap();
    
    public Graph() {
    }

    public Graph(Map<String, String> attributes) {
        this.attributes = attributes;
    }

    public Collection<Node> getNodes() {
        return nodes;
    }

    public Collection<Edge> getEdges() {
        return edges;
    }

    public Graph node(String name) {
        nodes.add(new Node(name,Collections.emptyMap()));
        return this;
    }

    public Graph node(String name, Map<String, String> attributes) {
        nodes.add(new Node(name,attributes));
        return this;
    }

    public Graph edge(String start, String end) {
        edges.add(new Edge(start,end));
        return this;
    }

    public Graph edge(String start, String end, Map<String, String> attributes) {
        edges.add(new Edge(start,end,attributes));
        return this;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }
}
