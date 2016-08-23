package com.tiy.practice;

public class Car {

	private String color;
	private String make;
	private String model;
	private int horsePowerHP;

	public Car(String color, String make, String model, int horsePowerHP) {
		this.color = color;
		this.make = make;
		this.model = model;
		this.horsePowerHP = horsePowerHP;
	}
	
	public void printInfo() {
		System.out.println("printInfo() from Car class");
		System.out.println("Color: " + color);
		System.out.println("Make: " + make);
		System.out.println("Model: " + model);
		if (horsePowerHP > 200) {
			System.out.println("Awesome HP: " + horsePowerHP);
		} else {
			System.out.println("Ecological HP: " + horsePowerHP);
		}
	}
}