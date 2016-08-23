package com.tiy.practice;

public class BestFriend {

	public static void clearMacScreen() { 
        System.out.print("\033[H\033[2J"); 
    }

	private String name;
	private int age;
	private int yearsOfFriendship;
	private String meetingPlace;

	public BestFriend(String name, int age, int yearsOfFriendship, String meetingPlace) {
		this.name = name;
		this.age = age;
		this.yearsOfFriendship = yearsOfFriendship;
		this.meetingPlace = meetingPlace;
	}

	public void printHeart(int position) {
		if (position == 1) {
			System.out.println("  Best Friend");
			System.out.println();
			System.out.println();
			System.out.println("   **     **");
			System.out.println("  ****   ****");
			System.out.println("  **  ***  **");
			System.out.println("   **  *  **");
			System.out.println("    **   **");
			System.out.println("     ** **");
			System.out.println("      ***");
			System.out.println("       *");
		} else if (position == 2) {
			System.out.println("  Best Friend");
			System.out.println();
			System.out.println("   **     **");
			System.out.println("  ****   ****");
			System.out.println("  **  ***  **");
			System.out.println("   **  *  **");
			System.out.println("    **   **");
			System.out.println("     ** **");
			System.out.println("      ***");
			System.out.println("       *");
			System.out.println();
		}
		else {
			System.out.println("  Best Friend");
			System.out.println("   **     **");
			System.out.println("  ****   ****");
			System.out.println("  **  ***  **");
			System.out.println("   **  *  **");
			System.out.println("    **   **");
			System.out.println("     ** **");
			System.out.println("      ***");
			System.out.println("       *");
			System.out.println();
			System.out.println();			
		}
	}

	public void printInfo() throws Exception {
		int sleepTime = 500;

		for (int counter = 4; counter < 13; counter++) {
			printHeart(counter % 3);
			System.out.println("My best friend's name: " + name);
			System.out.println("My best friend's age: " + age);
			if (yearsOfFriendship == 1) {
				System.out.println("We have been friends for " + yearsOfFriendship + " year!");
			} else {
				System.out.println("We have been friends for " + yearsOfFriendship + " years!");
			}
			System.out.println("We met in " + meetingPlace + ".");

			Thread.sleep(sleepTime);
			clearMacScreen();
		}
	}
}