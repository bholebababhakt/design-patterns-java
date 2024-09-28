package designpattern.behavioralpattern.iterator;

import java.util.*;

public class BFSIterator implements Iterator<Integer> {
    private Graph graph;
    private Queue<Integer> queue;
    private Set<Integer> visited;

    public BFSIterator(Graph graph,int startNode){
        this.graph = graph;
        this.queue = new LinkedList<>();
        this.visited = new HashSet<>();
        queue.add(startNode);
        visited.add(startNode);
    }
    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }

    @Override
    public Integer next() {
        if (!hasNext()){
            throw new NoSuchElementException();
        }
        int node = queue.poll();
        for (int neighbor: graph.getNeighbors(node)){
            if (!visited.contains(neighbor)){
                queue.add(neighbor);
                visited.add(neighbor);
            }
        }
        return node;
    }
}
