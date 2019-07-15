package labseventeendmcpiano;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CountriesApp {

	public static void main(String[] args) throws IOException {

		Scanner scnr = new Scanner(System.in);
		Country cInput = new Country();
		int userInput = -1;

		printTitle();
		do {
			do {
				printMenu();
				userInput = getUserInput(scnr);
			} while (userInput == -1);
			if (userInput == 1) {
				CountriesTextFile.printFile();
			} else if (userInput == 2) {
				cInput = getCountryInput(scnr);
				CountriesTextFile.appendToFile(cInput);
			}
		} while (userInput != 3);
		System.out.println("Goodbye!");
	}

	private static void printTitle() {
		System.out.println("- - - Main Menu - - -");
	}

	private static void printMenu() {

		System.out.println("1. Display a list of countries.");
		System.out.println("2. Add a country.");
		System.out.println("3. Exit.");
	}

	private static int getUserInput(Scanner scnr) {
		int userSelect = -1;
		System.out.println("Choose an option: ");
		try {
			userSelect = scnr.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Oops, try again by entering a number.");
			scnr.nextLine();
			return -1;
		}

		if (!((userSelect > 0 && userSelect < 4))) {
			System.out.println("Oh dear, please enter a valid number.");
			scnr.nextLine();
			return -1;
		}

		return userSelect;
	}

	private static Country getCountryInput(Scanner scnr) {

		String name = "";
		int population = 0;
		scnr.nextLine();
		System.out.println("Enter the name of a country: ");
		name = scnr.nextLine();

		System.out.println("Enter it's population: ");
		population = scnr.nextInt();

		Country userEntry = new Country(name, population);
		return userEntry;
	}

}
