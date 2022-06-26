package ADT;

import java.util.Iterator;
/**
 * Title: Assignment 2 - Part 1 <br>
 * Class description: An abstract data type that refers to all operations for the Queue Class <br>
 * Section: A
 * @author Hayley Mead
 * @author Jimmy Van
 * @author Navkaran Waraich
 * @author Griff Thaxter
 * @version June 26, 2022
 */

public interface QueueADT<E> {
	
	
	/** 
	 * Creates a new empty Queue<br>
	 * Precondition: No existing queue has the same name as this one<br>
	 * PostCondition: a new empty Queue
	 * @return Results in a new empty Queue
	 */
	
	public void createQueue();
	
	/** 
	 * Adds an elements to the end of a queue<br>
	 * Precondition: Queue is not full<br>
	 * PostCondition: Adds to the last element of the queue. Queue size + 1
	 * @throw NullPointerException If element is null
	 * @param element Desired value to be added to the queue
	 * 
	 */
	public void enqueue(E element) throws NullPointerException;
	
	/** 
	 * Removes the first element<br>
	 * Precondition: Queue must have an element<br>
	 * PostCondition: first element will be removed, queue size - 1
	 * @throws EmptyQueueException If queue is empty
	 * @return element removed from queue
	 */
	
	public E dequeue() throws EmptyQueueException;
	
	/** 
	 * Allows access to the first element in the queue<br>
	 * Precondition: queue must have at least one element<br>
	 * PostCondition: the value at element(0) will show
	 * @throws EmptyQueueException If queue is empty
	 * @return shows element(E)
	 */
	public E peek() throws EmptyQueueException;
	
	/** 
	 * Iterates over items in a queue<br>
	 * Precondition: queue must exist<br>
	 * PostCondition: results in iterator
	 * @return An iterator for said queue
	 */
	public Iterator<E> iterator() throws EmptyQueueException;
	
	
	/** 
	 * Checks if two queues contain equal items in the same order<br>
	 * Precondition: Both queues are not null<br>
	 * PostCondition: returns true if both are equal
	 * @throws NullPointerException  if either queue is null 
	 * @param that  A second queue that will be compared to the queue calling the method 
	 * @return returns true if equal, otherwise false
	 */
	public boolean equals(QueueADT<E> that) throws NullPointerException;
	
	
	/** 
	 * Gets the size of the queue<br>
	 * Precondition: None<br>
	 * PostCondition: will return the size of the queue
	 * @return size of queue
	 */
	public int size();
	;
	
	/** 
	 * Returns an array containing all of the items in the queue<br>
	 * Precondition: queue must contain at least one element<br>
	 * PostCondition: array of items 
	 * @throws EmptyStackException  If the queue is empty therefore causing an empty array
	 * @return an array of items from the queue
	 */
	public Object [] toArray() throws EmptyQueueException;
	
	/** 
	 * Copies elements in the queue to an array<br>
	 * Precondition: queue must contain at least one element<br>
	 * PostCondition: an array of copied items from queue
	 * @throws EmptyStackException  If the queue is empty therefore causing an empty array
	 * @throws NullPointerException  If copy is null
	 * @param a queue that is valid to be copied into an array
	 * @return array with items from queue
	 */
	public E[] toArray(E[] Copy)throws EmptyQueueException, NullPointerException ;
	
	/** 
	 * Optional method that will check of a fixed sized queue is full<br>
	 * Precondition: Queue is not empty<br>
	 * PostCondition: returns true if queue is full
	 * @throws EmptyQueueException If queue is empty
	 * @return returns true if full, otherwise false
	 */
	
	public boolean isFull() throws EmptyQueueException;

	/** 
	 * Returns a boolean if the Queue is empty<br>
	 * Precondition: an existing Queue<br>
	 * PostCondition: Returns a true boolean if Queue is empty
	 * @return true if Queue is empty, otherwise false
	 */
	public boolean isEmpty();
	
	/** 
	 * Clears the queue<br>
	 * Precondition: must have at least one element<br>
	 * PostCondition: the queue will be empty
	 * 
	 */
	
	public void dequeueAll();
	
	/** 
	 * Returns a string representation of the queue<br>
	 * Precondition: queue must contain at least one element<br>
	 * PostCondition: a string of the queue
	 * @return a string representation of the queue
	 */
	public String toString();
}
