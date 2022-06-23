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
	 * Description: Adds an element to the top of the stack
	 * Preconditions: A created stack
	 * Post conditions: Stack has depth + 1 
	 * @throws
	 */
	public void push() ;
	
	/**
	 * Description: removes top element from stack
	 * Preconditions: a created stack
	 * Post conditions: stack has depth - 1
	 * @throws EmptyStackException when there is no element to pop due to the stack being empty
	 */
	public void pop();
	
	/** 
	 * Description:acsess top element in stack 
	 * Preconditions: stack created 
	 * Post conditions: accessed stack element
	 * @throws
	 */
	public void	peek();
	
	/**
	 * Description: checks if two stacks are equal
	 * Preconditions: check if two stacks with equal items in same order
	 * Post conditions: 
	 * @param that
	 * @return true/false if equal/not equal
	 * 
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
	 * @throws EmptyStackException 
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
	 * Description: array 
	 * Preconditions: must have stack
	 * Post conditions: array has items in stack
	 * @param copy
	 * @return
	 */
	public E[] toArray(E[] copy);
	
	/**
	 * Description: for searching the stack
	 * Preconditions: must have a stack
	 * Post conditions: will find item in stack 
	 * @param obj
	 * @return found object
	 */
	public int search(E obj);
	
	
	/**
	 * Description: finds size of stack
	 * Preconditions: must have stack 
	 * Post conditions: returns size of stack 
	 * @return size of stack
	 */
	public int size();
	
	/**
	 * Description: checks if stack is empty
	 * Preconditions: must have stack
	 * Post conditions: will return a result 
	 * @return true/false if empty
	 */
	public boolean isEmpty();
	
	/**
	 * Description: clears the stack
	 * Preconditions: must have stack
	 * Post conditions: stack is cleared
	 */
	public void clear();

	
}
