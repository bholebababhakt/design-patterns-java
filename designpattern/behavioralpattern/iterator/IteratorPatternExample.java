package designpattern.behavioralpattern.iterator;

public class IteratorPatternExample {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(2, 5);
        graph.addEdge(5, 6);
        graph.addEdge(5, 7);
        graph.addEdge(3, 8);
        graph.addEdge(3, 9);
//                    1
//             2                 3
//        4        5           8     9
//               6   7

        // Get a DFS iterator
        Iterator<Integer> dfsIterator = graph.createDFSIterator();
        System.out.println("DFS Traversal:");
        while (dfsIterator.hasNext()) {
            System.out.print(dfsIterator.next() + " ");
        }

        // Get a BFS iterator
        Iterator<Integer> bfsIterator = graph.createBFSIterator(1); // Start at node 1 for BFS
        System.out.println("\nBFS Traversal:");
        while (bfsIterator.hasNext()) {
            System.out.print(bfsIterator.next() + " ");
        }
    }
}
