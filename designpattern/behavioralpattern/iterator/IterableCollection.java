package designpattern.behavioralpattern.iterator;

//aggregator interface
//createIterator() which will return an iterator for traversing the collection.
public interface IterableCollection<T> {
    Iterator<T> createDFSIterator(); // Method to create an DFS iterator
    Iterator<T> createBFSIterator(int startNode); // Method to create an BFS iterator

}
