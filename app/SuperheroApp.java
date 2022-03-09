package app;


import java.util.Scanner;
import java.util.Set;


/**
* @author vemaj
*
*/
public class SuperheroApp {

	private static Scanner scanner = new Scanner(System.in);
	
	

	/**
	 * @param args mainklasse
	 */
	public static void main(String[] args) {

		while (true) {
			showMenu();
			int choice = readUserInput();
			handle(choice);
			System.out.println("====================");
		}
	}

	/**
	 * 
	 * @return
	 */
	private static int readUserInput() {
		System.out.print("\nBitte, geben Sie die Nummer des gewaehlten Menueeintrags ein:\t");
		int choiceInternal = scanner.nextInt();

		return choiceInternal;
	}

	/**
	 * 
	 * @param choice
	 */
	private static void handle(int choice) {
		switch (choice) {
		case 1:
			createSuperhero();
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6: 
			break;
		default: {
			System.out.println("Ungueltige Eingabe. Bitte ueberpruefen Sie Ihre Eingabe");
			showMenu();
		}
			break;

		}
	}



	/**
	 * 
	 */
	private static void showMenu() {

		String menuItems[] = { "", "(1)\t Superheld anlegen", "(2)\t Daten eines Superhelden ausgeben" };

		System.out.println("\nSuperheroes 1.0\n");
		for (int i = 1; i < menuItems.length; i++) {
			System.out.println(menuItems[i]);
		}

	}
	

	
	private static void createSuperhero() {
		System.out.println("\nLeider hat die Methode noch keinen Code. Aber Du kannst hoffentlich nachvollziehen wie der Ablauf ist. Hier sollst Du einen Superhelden anlegen.\n");
	}
	
	

	 

	
		
	}

	
	


