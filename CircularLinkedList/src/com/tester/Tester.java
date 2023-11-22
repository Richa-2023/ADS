package com.tester;

import java.util.Scanner;

import com.core.CLL;

public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CLL list = new CLL();
		boolean exit = false;
		while (!exit)

		{

			System.out.println();
			System.out.println("....menu.....");
			System.out.println("1.Add At First");
			System.out.println("2.Add At Mid");
			System.out.println("3.Add At Last");
			System.out.println("4.Delete At First");
			System.out.println("5.Delete At Mid");
			System.out.println("6.Delete At Last");
			System.out.println("7.Display");
			System.out.println("8.Delete All");
			System.out.println("9.Exit");

			switch (sc.nextInt()) {
			case 1:
				System.out.println("Enter the element");
				int data = sc.nextInt();
				list.addAtFirst(data);
				break;

			case 2:
				System.out.println("Enter the element and position");
				data = sc.nextInt();
				int pos = sc.nextInt();
				list.addAtMid(data, pos);
				break;

			case 3:
				System.out.println("Enter the element");
				data = sc.nextInt();
				list.addAtLast(data);
				break;

			case 4:
				list.delAtFirst();
				break;
			case 5:
				System.out.println("Enter position");
				pos = sc.nextInt();
				// list.delAtMid(pos);
				break;
			case 6:
				list.delAtLast();
				break;

			case 7:
				list.display();
				break;
			case 8:
				list.delAll();
				break;
			case 9:
				exit = true;
				break;

			}
		}

	}

}
