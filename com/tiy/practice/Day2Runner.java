package com.tiy.practice;

public class Day2Runner {
	
	public static void main(String[] args) throws Exception {
		// System.out.println("Running Day2Runner ...");

		// Car myCar = new Car("Red", "Land Rover", "Range Rover Sport SVR", 100);
		// myCar.printInfo();

		House myHouse = new House("15 Carter Lane", "white", 2, 1, 1);
		myHouse.printInfo();

		System.out.println();

		BestFriend myBestFriend = new BestFriend("Vero", 23, 10, "8th grade Spanish class");
		myBestFriend.printInfo();

		System.out.println();

		College myCollege = new College("University of Georgia", "Athens", "GA", 35000, "Bulldog");
		myCollege.printInfo();

	}
}