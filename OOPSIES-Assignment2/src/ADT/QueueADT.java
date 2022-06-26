package ADT;

import java.util.Iterator;
/**
 * Class description: An abstract data type that refers to all operations for the Queue Class
 *
 * @author Hayley Mead
 * @author Jimmy Van
 * @author Navkaran Waraich
 * @author Griff Thaxter
 * @version June 26, 2022
 */

public interface QueueADT<E> {
	
	
	/** 
	 * Description: Creates a new Queue<br>
	 * Precondition: no queue<br>
	 * PostCondition: a new Queue
	 * @return Results in a new empty Queue
	 */
	
	public void createQueue();
	
	/** 
	 * Description: Adds an elements to the end of a queue<br>
	 * Precondition: queue must exist<br>
	 * PostCondition: adds to the last element of the queue queue size + 1
	 * @return new element added to queue
	 */
	public void enqueue(E element);
	
	/** 
	 * Description: Removes the first element<br>
	 * Precondition: queue must have an element<br>
	 * PostCondition: first element will be removed, queue size - 1
	 * @return element removed from queue
	 */
	
	public E dequeue() throws EmptyQueueException;
	
	/** 
	 * Description: allows access to the first element in the queue<br>
	 * Precondition: queue must have at least one element<br>
	 * PostCondition: the value at element(0) will show
	 * @return shows element(E)
	 */
	public E peek() throws EmptyQueueException;
	
	/** 
	 * Description: iterates over items in a stack<br>
	 * Precondition: stack must exist<br>
	 * PostCondition: results in iterator
	 * @return iterates over the items in the stack
	 */
	public Iterator<E> iterator() throws EmptyQueueException;
	
	
	/** 
	 * Description: checks if two queues contain equal items in the same order<br>
	 * Precondition: two queues with equal items and in the same order<br>
	 * PostCondition: returns true if both are equal
	 * @throws NullPointerException  if "that" is null 
	 * @param that - A second stack that will be compared to the queue calling the method 
	 * @return returns true if equal, otherwise false
	 */
	public boolean equals(QueueADT<E> that) throws NullPointerException;
	
	
	/** 
	 * Description: checks the size of the queue<br>
	 * Precondition: queue must exist<br>
	 * PostCondition: will return the size of the queue
	 * @return size of queue
	 */
	public int size();
	;
	
	/** 
	 * Description: returns an array containing all of the items in the queue<br>
	 * Precondition: queue must contain at least one element<br>
	 * PostCondition: array of items 
	 * @throws EmptyStackException  If the queue is empty therefore causing an empty array
	 * @return an array of items from the queue
	 */
	public Object [] toArray() throws EmptyQueueException;
	
	/** 
	 * Description: copies elements in the queue to an array<br>
	 * Precondition: queue must contain at least one element<br>
	 * PostCondition: an array of copied items from queue
	 * @throws EmptyStackException  If the queue is empty therefore causing an empty array
	 * @throws NullPointerException  If copy is null
	 * @param a queue that is valid to be copied into an array
	 * @return array with items from queue
	 */
	public E[] toArray(E[] Copy)throws EmptyStackException, NullPointerException ;
	
	/** 
	 * Description: optional method that will check of a fixed sized queue is full<br>
	 * Precondition: fixed-sized queue must be full<br>
	 * PostCondition: returns true if queue is full
	 * @return returns true if full, otherwise false
	 */
	
	public boolean isFull();

	/** 
	 * Description: returns a boolean if the Queue is empty<br>
	 * Precondition: an existing Queue<br>
	 * PostCondition: Returns a true boolean if Queue is empty
	 * @return true if Queue is empty, otherwise false
	 */
	public boolean isEmpty();
	
	/** 
	 * Description: clears the queue<br>
	 * Precondition: must have at least one element<br>
	 * PostCondition: the queue will be empty
	 * @return queue is empty
	 */
	
	public void dequeueAll();
	
	/** 
	 * Description: returns a string representation of the queue<br>
	 * Precondition: queue must contain at least one element<br>
	 * PostCondition: a string of the queue
	 * @return a string representation of the queue
	 */
	public String toString();
}
