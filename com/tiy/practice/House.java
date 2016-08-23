package com.tiy.practice;

public class House {

	public static void clearMacScreen() { 
        System.out.print("\033[H\033[2J"); 
    }

	private String address;
	private String color;
	private int numBedrooms;
	private int numBathrooms;
	private int numFloors;

	public House(String address, String color, int numBedrooms, int numBathrooms, int numFloors) {
		this.address = address;
		this.color = color;
		this.numBedrooms = numBedrooms;
		this.numBathrooms = numBathrooms;
		this.numFloors = numFloors;
	}

	public void printHousePicture(Boolean positionLeft) {
		if (positionLeft) {
			System.out.println("             __");
			System.out.println("            ( )");
			System.out.println("             (_)_");
			System.out.println("              |  |");
			System.out.println("    __________|__|__");
			System.out.println("   /                \\");
			System.out.println("  /                  \\");
			System.out.println(" /____________________\\");
			System.out.println("  |                 |");
			System.out.println("  |      _____      |");
			System.out.println("  |      |   |      |");
			System.out.println("  |      |   |      |");
			System.out.println("  |______|___|______|");
			System.out.println();
			System.out.println(" * * * *MY HOUSE* * * * ");
		} else {
			System.out.println("                 __");
			System.out.println("                ( )");
			System.out.println("              _(_)");
			System.out.println("              |  |");
			System.out.println("    __________|__|__");
			System.out.println("   /                \\");
			System.out.println("  /                  \\");
			System.out.println(" /____________________\\");
			System.out.println("  |                 |");
			System.out.println("  |      _____      |");
			System.out.println("  |      |   |      |");
			System.out.println("  |      |   |      |");
			System.out.println("  |______|___|______|");
			System.out.println();
			System.out.println("* * * * MY HOUSE * * * *");
		}

	}

	public void printInfoBasic() {
		System.out.println("Address: " + address);
		System.out.println("Color: " + color);
		 
		if (numBedrooms == 1) {
			if (numBathrooms == 1) {
				System.out.println("This house has " + numBedrooms + " bedroom and " + numBathrooms + " bathroom.");
			}
			else {
				System.out.println("This house has " + numBedrooms + " bedroom and " + numBathrooms + " bathrooms.");
			}

		} else {
			if (numBathrooms == 1) {
				System.out.println("This house has " + numBedrooms + " bedrooms and " + numBathrooms + " bathroom.");
			}
			else {
				System.out.println("This house has " + numBedrooms + " bedrooms and " + numBathrooms + " bathrooms.");
			}
		}

		if (numFloors == 1) {
			System.out.println("This house has " + numFloors + " floor.");
		} else {
			System.out.println("This house has " + numFloors + " floors.");
		}
	}

	public void printInfo() throws Exception {
		int sleepTime = 500;
		Boolean myFlag = true;

		for (int counter = 0; counter < 7; counter++) {
			printHousePicture(myFlag);
			printInfoBasic();

			Thread.sleep(sleepTime);
			clearMacScreen();
			myFlag = !myFlag;
		}
	}
}