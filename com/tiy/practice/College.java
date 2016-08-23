package com.tiy.practice;

public class College {

	public static void clearMacScreen() { 
        System.out.print("\033[H\033[2J"); 
    }
	
	private String name;
	private String city;
	private String state;
	private int numStudents;
	private String mascot;

	public College(String nameInput, String cityInput, String stateInput, int numStudentsInput, String mascotInput) {
		name = nameInput;
		city = cityInput;
		state = stateInput;
		numStudents = numStudentsInput;
		mascot = mascotInput;
	}

	public void printInfo() throws Exception {
		int sleepTime = 300;

		System.out.println(" ****  ****      ****  *  ****  *  *  *****    *       *  *  *   * ");
		Thread.sleep(sleepTime);
		System.out.println(" *     *  *      *     *  *     *  *    *       *  *  *   *  **  *");
		Thread.sleep(sleepTime);
		System.out.println(" * **  *  *      ***   *  * **  ****    *        * * *    *  * * *");
		Thread.sleep(sleepTime);
		System.out.println(" *  *  *  *      *     *  *  *  *  *    *        *   *    *  *  ** ");
		Thread.sleep(sleepTime);
		System.out.println(" ****  ****      *     *  ****  *  *    *        *   *    *  *   *");
		Thread.sleep(sleepTime);

		System.out.println();

		System.out.println("College: " + name);
		Thread.sleep(sleepTime);
		System.out.println("Location: " + city + ", " + state);
		Thread.sleep(sleepTime);
		System.out.println("Number of Students: " + numStudents);
		Thread.sleep(sleepTime);
		System.out.println("Mascot: " + mascot);
		Thread.sleep(sleepTime * 2);
		clearMacScreen();

		for (int counter = 0; counter < 5; counter++) {
			System.out.println(" ****  ****      ****  *  ****  *  *  *****    *       *  *  *   * ");
			System.out.println(" *     *  *      *     *  *     *  *    *       *  *  *   *  **  *");
			System.out.println(" * **  *  *      ***   *  * **  ****    *        * * *    *  * * *");
			System.out.println(" *  *  *  *      *     *  *  *  *  *    *        *   *    *  *  ** ");
			System.out.println(" ****  ****      *     *  ****  *  *    *        *   *    *  *   *");

			System.out.println();

			System.out.println("College: " + name);
			System.out.println("Location: " + city + ", " + state);
			System.out.println("Number of Students: " + numStudents);
			System.out.println("Mascot: " + mascot);

			Thread.sleep(sleepTime);
			clearMacScreen();
			Thread.sleep(sleepTime);

		}

		System.out.println(" ****  ****      ****  *  ****  *  *  *****    *       *  *  *   * ");
		System.out.println(" *     *  *      *     *  *     *  *    *       *  *  *   *  **  *");
		System.out.println(" * **  *  *      ***   *  * **  ****    *        * * *    *  * * *");
		System.out.println(" *  *  *  *      *     *  *  *  *  *    *        *   *    *  *  ** ");
		System.out.println(" ****  ****      *     *  ****  *  *    *        *   *    *  *   *");

		System.out.println();

		System.out.println("College: " + name);
		System.out.println("Location: " + city + ", " + state);
		System.out.println("Number of Students: " + numStudents);
		System.out.println("Mascot: " + mascot);

	}
}