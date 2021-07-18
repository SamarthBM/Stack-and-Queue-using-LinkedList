/****************************************************************
 * Purpose : To perform all stack and queue operation.
 * @author Samarth BM

***************************************************************/

package com.bridegelabs;

public class StackQueueOperations {
	private MyNode top;

	/*
	 * purpose: Method to add elements to stack
	 * 
	 * @param element: elements to be added.
	 */
	public void addElementToStack(int element) {

		MyNode node = new MyNode();
		node.key = element;
		if (node == null)
			node.next = null;
		else {
			node.next = top;
			top = node;
		}
	}

	/* purpose: Method to delete element from stack. */
	public void deleteElementFromStack() {
		if (top == null)
			System.out.println("\n" + "Stack is Empty!");
		else {
			MyNode temp = top;
			System.out.printf("Deleted element: %d", temp.key);
			System.out.println();
			top = temp.next;
		}
	}

	/* purpose: Method to display last element in stack. */
	public int peek() {
		if (top != null)
			return top.key;
		else {
			System.out.println("Stack is empty");
			return 0;
		}
	}

	/* purpose: Method to display the elements in stack */
	public void displayStack() {
		if (top == null)
			System.out.println("Stack is Empty");
		else {
			MyNode temp = top;
			while (temp.next != null) {
				System.out.println(temp.key);
				temp = temp.next;
			}
			System.out.println(temp.key);
		}
	}
}
