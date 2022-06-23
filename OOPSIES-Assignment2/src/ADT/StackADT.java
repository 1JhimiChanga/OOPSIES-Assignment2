package ADT;

import java.util.Iterator;
import java.util.Stack;


/**
 * Class description:
 *
 * @author Hayley Mead (781756)
 *
 * @param <E>
 */
public interface StackADT<E> {
	/**
	 * Description: 
	 * Preconditions:
	 * Post conditions:
	 */
	public void push();
	/**
	 * Description:
	 * Preconditions:
	 * Post conditions:
	 */
	public void pop();
	/**
	 * 
	 * Description:
	 * Preconditions:
	 * Post conditions:
	 */
	public void	peek();
	
	/**
	 * Description: checks if two stacks are equal
	 * Preconditions: check if two stacks with equal items in same order
	 * Post conditions: 
	 * @param that
	 * @return true/false if equal/not equal
	 */
	public boolean equals(StackADT<E> that);
	
	/**
	 * Description: 
	 * Preconditions:
	 * Post conditions:
	 * @return 
	 */
	public Stack<E> newStack();
	
	
	/**
	 * Description: iterates over items in a stack
	 * Preconditions: stack must exist
	 * Post conditions: results in iterator 
	 * @return iterates over the items in the stack
	 */
	public Iterator<E> iterator();
	
	/**
	 * Description: array containing all items in this stack 
	 * Preconditions: must have stack
	 * Post conditions: array has items in stack
	 * @return array with items in stack
	 */
	public Object[] toArray();
	
	
	/**
	 * @param copy
	 * @return
	 */
	public E[] toArray(E[] copy);
	
	/**
	 * Description: 
	 * Preconditions:
	 * Post conditions:
	 * @param obj
	 * @return
	 */
	public int search(E obj);
	
	
	/**
	 * Description:
	 * Preconditions:
	 * Post conditions:
	 * @return size of stack
	 */
	public int size();
	
	/**
	 * Description: 
	 * Preconditions: must have stack
	 * Post conditions: will return a result 
	 * @return true/false if empty
	 */
	public boolean isEmpty();
	
	/**
	 * Description:
	 * Preconditions:
	 * Post conditions:
	 */
	public void clear();

	
}
