/****************************************************************
 * Purpose : To pop and peek in stack.
 * @author Samarth BM
***************************************************************/
package com.bridegelabs;

import java.util.Scanner;

public class StackQueueRunner {
	static Scanner sc = new Scanner(System.in);

	/* purpose: Method to take user input to perform stack. */
	public static int userMenu() {
		System.out.println("Press 1 to Push");
		System.out.println("Press 2 to Pop");
		System.out.println("Press 3 to Peek");
		System.out.println("Press 4 to Display");
		System.out.println("Press 5 to Quit");
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
				flag = false;
				break;

			}
		}

	}

}
