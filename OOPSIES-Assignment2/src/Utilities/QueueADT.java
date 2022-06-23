package Utilities;

import java.util.Iterator;

public interface QueueADT<E> {
	
	
	/** 
	 * Description: Creates a new Queue
	 * Precondition: no queue
	 * PostCondition: a new Queue
	 * @return Results in a new empty Queue
	 */
	public void createQueue();
	
	/** 
	 * Description: Adds an elements to the end of a queue
	 * Precondition: queue must exist
	 * PostCondition: adds to the last element of the queue queue size + 1
	 * @return new element added to queue
	 */
	public void enqueue(E element);
	
	/** 
	 * Description: Removes the first element
	 * Precondition: queue must have an element
	 * PostCondition: first element will be removed, queue size - 1
	 * @return element removed from queue
	 */
	public E dequeue();
	
	/** 
	 * Description: allows access to the first element in the queue
	 * Precondition: queue must have at least one element
	 * PostCondition: the value at element(0) will show
	 * @return shows element(E)
	 */
	public E peek();
	
	/** 
	 * Description: iterates over items in a stack
	 * Precondition: stack must exist
	 * PostCondition: results in iterator
	 * @return iterates over the items in the stack
	 */
	Iterator<E> iterator();
	
	/** 
	 * Description: checks if two queues contain equal items in the same order
	 * Precondition: two queues with equal items and in the same order
	 * PostCondition: returns true if both are equal
	 * @return returns true if equal
	 */
	public boolean equals(QueueADT<E> that);
	
	
	/** 
	 * Description: checks the size of the queue
	 * Precondition: queue must exist
	 * PostCondition: will return the size of the queue
	 * @return size of queue
	 */
	public int size();
	
	/** 
	 * Description: returns an array containing all of the items in the queue
	 * Precondition: queue must contain at least one element
	 * PostCondition: array of items 
	 * @return an array of items from the queue
	 */
	Object [] toArray();
	
	/** 
	 * Description: copies elements in the queue to an array
	 * Precondition: queue must contain at least one element
	 * PostCondition: an array of copied items from queue
	 * @return array with items from queue
	 */
	E[] toArray(E[] Copy);
	
	/** 
	 * Description: optional method that will check of a fixed sized queue is full
	 * Precondition: fixed-sized queue must be full
	 * PostCondition: returns true if queue is full
	 * @return returns true if full 
	 */
	
	public boolean isFull();

	
	/** 
	 * Description: returns a boolean if the Queue is empty
	 * Precondition: an existing Queue
	 * PostCondition: Returns a true boolean if Queue is empty
	 * @return true if Queue is empty
	 */
	public boolean isEmpty();
	
	/** 
	 * Description: clears the queue
	 * Precondition: must have at least one element
	 * PostCondition: the queue will be empty
	 * @return queue is empty
	 */
	public void dequeueAll();
	
	/** 
	 * Description: returns a string representation of the queue
	 * Precondition: queue must contain at least one element
	 * PostCondition: a string of the queue
	 * @return a string representation of the queue
	 */
	public String toString();
}
