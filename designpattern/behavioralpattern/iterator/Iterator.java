package designpattern.behavioralpattern.iterator;

//Iterator interface will have methods for checking if there are more nodes (hasNext()) and retrieving the next node (next()).
public interface Iterator<T> {
    boolean hasNext();  // Check if there's another element

    T next();           // Get the next element
}
