/****************************************************************
 * Purpose : To push elements to stack.
 * 70 will be added first,
 * 30 and 56 is later pushed to get 56 on top.
 * Final sequence: 56->30->70
 * @author Samarth BM
***************************************************************/
package com.bridegelabs;

import java.util.Scanner;

public class StackQueueRunner {
	static Scanner sc = new Scanner(System.in);

	/* purpose: Method to take user input to perform stack. */
	public static int userMenu() {
		System.out.println("Press 1 to Push");
		System.out.println("Press 2 to Display");
		System.out.println("Press 3 to Quit");
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
				performStack.displayStack();
				flag = true;
				break;

			case 3:
				flag = false;
				break;

			}
		}

	}

}
