import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

/**
 * Class that actually runs the program. The name of the file to read should be
 * stored in args[0].
 * 
 * @author ricar
 *
 */
public class Program {
	static String fileName;
	static ProductList productList;
	static Scanner sc;

	/**
	 * @param args Filename is stored in args[0].
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to Apple.");
		try {
			fileName = args[0];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("No file found.");
			System.exit(0);
		}

		try {
			productList = ProductList.read(fileName);
		} catch (FileNotFoundException e) {
			System.out.println("File " + fileName + " not found.\nProgram terminated.");
			System.exit(0);
		}

		sc = new Scanner(System.in);
		for (;;) {
			System.out.println("1 - Show the entire Apple catalogue\n" + "2 - Add a new iPhone\n"
					+ "3 - Add a new iPad\n" + "4 - Show the entire Apple catalog sorted by product\n"
					+ "5 - Show the entire Apple catalogue sorted by price (low -> high)\n" + "6 - Write to file\n"
					+ "7 - Stop the program");

			int inp = sc.nextInt();

			switch (inp) {
			case 1:
				option1();
				break;
			case 2:
				option2();
				break;
			case 3:
				option3();
				break;
			case 4:
				option4();
				break;
			case 5:
				option5();
				break;
			case 6:
				option6();
				break;
			case 7:
				quit();
			default:
				System.out.println("Please enter a correct option.");
			}

		}
	}

	/**
	 * Quits the program
	 */
	static void quit() {
		sc.close();
		System.out.println("Program stopped, thank you for using Apple. Remember, think different.");
		System.exit(0);
	}

	/**
	 * Shows the entire Apple catalog
	 */
	static void option1() {
		System.out.println(productList);
	}

	/**
	 * Add a new iPhone
	 */
	static void option2() {
		String line = "";
		sc.nextLine();
		System.out.println("Enter the model name: (please start with IPHONE)");
		line += sc.nextLine() + ", ";
		System.out.println("Enter the screen size:");
		line += sc.nextDouble() + ", ";
		sc.nextLine();
		System.out.println("Enter the processor:");
		line += sc.nextLine() + ", ";
		System.out.println("Enter the type of modem: (either GSM or CDMA)");
		line += sc.nextLine() + ", ";
		System.out.println("Enter the color:");
		line += sc.nextLine() + ", ";
		System.out.println("Enter the amount of memory:");
		line += sc.nextLine() + ", ";
		System.out.println("Enter the presence of 3D Touch(tm) technology: (either TRUE or FALSE)");
		line += sc.nextLine() + ", ";
		System.out.println("Enter the price:");
		line += sc.nextInt();
		sc.nextLine();
		productList.add(IPhone.read(line));
	}

	/**
	 * Add a new iPhone
	 */
	static void option3() {
		String line = "";
		sc.nextLine();
		System.out.println("Enter the model name: (please start with IPAD)");
		line += sc.nextLine() + ", ";
		System.out.println("Enter the screen size:");
		line += sc.nextDouble() + ", ";
		sc.nextLine();
		System.out.println("Enter the processor:");
		line += sc.nextLine() + ", ";
		System.out.println("Enter the presence of 4G, rather than only WiFi: (either TRUE or FALSE)");
		line += sc.nextLine() + ", ";
		System.out.println("Enter the color:");
		line += sc.nextLine() + ", ";
		System.out.println("Enter the amount of memory:");
		line += sc.nextLine() + ", ";
		System.out.println("Enter the price:");
		line += sc.nextInt();
		sc.nextLine();
		System.out.println(line);
		productList.add(IPad.read(line));
	}

	/**
	 * Show the entire Apple catalog sorted by product
	 */
	static void option4() {
		new Sort(productList, new TypeComparator()).start();
	}

	/**
	 * Show the entire Apple catalogue sorted by price (low -> high)
	 */
	static void option5() {
		new Sort(productList, new PriceComparator()).start();
	}

	/**
	 * Write to file
	 */
	static void option6() {
		try {
			productList.write(fileName);
		} catch (IOException e) {
			// will never happen, since we know that fileName exists.
			e.printStackTrace();
		}
	}
}
