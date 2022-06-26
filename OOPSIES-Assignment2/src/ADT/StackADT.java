package ADT;

import java.util.Iterator;
import java.util.Stack;


/**
 * Title: Assignment 2 - Part 1 
 * Class description: An abstract data type that refers to all operations for the Stack Class
 * Section: A
 * 
 *
 * @author Hayley Mead
 * @author Jimmy Van
 * @author Navkaran Waraich
 * @author Griff Thaxter
 * @version June 25, 2022
 * 
 * 
 *
 * 
 */
public interface StackADT<E> {
	/**
	 * Adds an element to the top of the stack <br>
	 * Preconditions: Stack is not full<br>
	 * Post conditions: Stack has depth + 1 
	 * @throws NullPointerException If element is null
	 * @param element Desired value to be added to the stack
	 */
	public void push(E element) ;
	
	/**
	 * Removes top element from stack<br>
	 * Preconditions: The stack is not empty stack<br>
	 * Post conditions: Stack has depth - 1
	 * @throws EmptyStackException  When there is no element to pop due to the stack being empty
	 * @return removes and returns the top most element of the stack
	 */
	public E pop() throws EmptyStackException;
	
	/** 
	 * Access top element in stack without removing it <br>
	 * Preconditions: Stack needs at least one element <br>
	 * Post conditions: Captures top element of the stack without removing it 
	 * @throws EmptyStackException  if there is no element to peek due to the stack being empty
	 * @return the value of the top most element of the stack 
	 */
	public E peek() throws EmptyStackException;
	
	/**
	 * Checks if two stacks are equal in items as well as order<br>
	 * Preconditions: Both stacks are not null<br>
	 * Post conditions: Results a value determining if the two stacks are equal
	 * @param that - A second stack that will be compared to the stack calling the method 
	 * @throws NullPointerException  if either stack is null 
	 * @return true/false if equal/not equal
	 * 
	 */
	public boolean equals(StackADT<E> that) throws NullPointerException;
	
	/**
	 * Creates a new empty stack<br>
	 * Preconditions: Stack must have a unique name compared to existing stacks<br>
	 * Post conditions: Results in a new empty stack
	 * @return an empty stack
	 */
	public Stack<E> newStack();
	
	
	/**
	 * Iterates over items in a stack<br>
	 * Preconditions: None<br>
	 * Post conditions: Results in iterator 
	 * @return An iterator for said stack
	 * 
	 */
	public Iterator<E> iterator();
	
	/**
	 * Converts stack to an array containing all items in this stack <br>
	 * Preconditions: Stack must have at least one element<br>
	 * Post conditions: Array has copied items from stack
	 * @throws EmptyStackException  If the stack is empty therefore causing an empty array
	 * @return Array with items from stack
	 */
	public Object[] toArray() throws EmptyStackException;
	
	/**
	 * Copies stack to an array containing all items in this stack <br>
	 * Preconditions: Stack has at least one element<br>
	 * Post conditions: Array has copied items from stack
	 * @throws EmptyStackException  If the stack is empty therefore causing an empty array
	 * @throws NullPointerException  If copy is null
	 * @param A stack that is valid to be copied into an array
	 * @return an array of the elements of the stack
	 */
	public E[] toArray(E[] copy) throws EmptyStackException, NullPointerException;
	
	/**
	 * Searches for element in stack equal to obj<br>
	 * Preconditions: Stack must have at least one element<br>
	 * Post conditions: Results in the index of the desired element
	 * @throws NullPointerException  If obj is null 
	 * @throws EmptyStackException if stack is empty and there are no elements to search 
	 * @param obj
	 * @return index of found object
	 * 
	 */
	public int search(E obj) throws NullPointerException, EmptyStackException;
	
	/**
	 * Gets the size of stack<br>
	 * Preconditions: None<br>
	 * Post conditions: returns size of stack 
	 * @return size of stack
	 */
	public int size();
	
	/**
	 * Checks if stack is empty<br>
	 * Preconditions: None<br>
	 * Post conditions: Will return a value indicating if stack is empty
	 * @return true/false if empty or not
	 */
	public boolean isEmpty();
	
	/**
	 * Clears the stack<br>
	 * Preconditions: None<br>
	 * Post conditions: Stack is cleared
	 */
	public void clear();
	/**
	 * Provides a binary value indicating if obj is an element in the stack<br>
	 * Preconditions: Stack is not empty<br>
	 * Postconditions: Results in a value depending on if the stack contains an element equal to obj
	 * @throws NullPointerException If obj is null
	 * @throws EmptyStackException If stack is empty
	 * @param obj Desired value to see if it exist in the stack
	 * @return A binary value determining if the value of obj exist in the stack
	 */
	public boolean contains(E obj);

	
}
