package designpattern.behavioralpattern.iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph implements IterableCollection<Integer>{
    private Map<Integer, List<Integer>> adjencyList;

    public Graph() {
        this.adjencyList = new HashMap<>();
    }

    public List<Integer> getNeighbors(int node){
        return adjencyList.getOrDefault(node,new ArrayList<>());
    }

    public void addEdge(int source,int destination){
        adjencyList.computeIfAbsent(source,k -> new ArrayList<>()).add(destination);
    }

    @Override
    public Iterator<Integer> createDFSIterator() {
        return new DFSIterator(this,1); // Start at node 1 for DFS
    }

    @Override
    public  Iterator<Integer> createBFSIterator(int startNode){
        return new BFSIterator(this,startNode);
    }
}
