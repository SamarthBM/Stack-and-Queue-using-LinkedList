 
/****************************************************************
 * Purpose : To add elements to queue.
 * @author Samarth BM
***************************************************************/
package com.bridegelabs;

import java.util.Scanner;

public class StackQueueRunner {
	static Scanner sc = new Scanner(System.in);

	/* purpose: Method to take user input to perform stack. */
	public static int userMenu() {
		System.out.println("========Stack Operations=======");
		System.out.println("Press 1 to Push");
		System.out.println("Press 2 to Pop");
		System.out.println("Press 3 to Peek");
		System.out.println("Press 4 to display stack");
		System.out.println("========Queue Operations=======");
		System.out.println("Press 5 to Enqueue");
		System.out.println("Press 6 to Dequeue");
		System.out.println("Press 7 to display Queue");
		System.out.println("Press 8 to Quit");
		int choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		StackQueueOperations performStack = new StackQueueOperations();

		boolean flag = true;
		while (flag) {
			int choice1 = userMenu();

			switch (choice1) {

			case 1:
				System.out.println("Enter element to push");
				int pushElement = sc.nextInt();
				performStack.addElementToStack(pushElement);
				flag = true;
				break;

			case 2:
				performStack.deleteElementFromStack();
				flag = true;
				break;

			case 3:
				System.out.println("Last element is: " + performStack.peek());
				flag = true;
				break;

			case 4:
				performStack.displayStack();
				flag = true;
				break;
				
			case 5:
				System.out.println("Enter element to add to queue: ");
				int enqueue = sc.nextInt();
				performStack.enqueue(enqueue);
				flag = true;
				break;
				
			case 6:
				performStack.dequeue();
				flag = true;
				break;
				
			case 7:
				performStack.displayQueue();
				flag = true;
				break;	

			case 8:
				flag = false;
				break;

			}
		}

	}

}
