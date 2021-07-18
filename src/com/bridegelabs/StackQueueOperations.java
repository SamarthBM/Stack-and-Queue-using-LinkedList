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
