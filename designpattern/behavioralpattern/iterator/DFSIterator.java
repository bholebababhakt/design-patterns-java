package designpattern.behavioralpattern.iterator;

import java.util.*;

public class DFSIterator implements Iterator<Integer> {
    private Graph graph;
    private Stack<Integer> stack;
    private Set<Integer> visited;

    public DFSIterator(Graph graph, int startNode) {
        this.graph = graph;
        this.stack = new Stack<>();
        this.visited = new HashSet<>();
        stack.push(startNode);
    }

    @Override
    public boolean hasNext() {
        return !stack.empty(); // If the stack is not empty, there's more to visit
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int node = stack.pop();
        visited.add(node);
        List<Integer> neighbors = graph.getNeighbors(node);
        Collections.reverse(neighbors);
        for (int neighbor : neighbors) {
            if (!visited.contains(neighbor)) {
                stack.push(neighbor);
            }
        }
        return node;
    }
}
