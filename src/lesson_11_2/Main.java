package lesson_11_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Random rnd = new Random();
		Car[][] arr = new Car[rnd.nextInt(11)][rnd.nextInt(11)];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				int randomYear = (int) (1950 + Math.random() * 73);
				int randomCylinders = (int) (4 + Math.random() * 8);
				double randomDiameter = 12 + Math.random() * 6.8;
				String randomMaterial = rnd.nextInt(3) == 2 ? "leather" : "polyurethane";

				SteeringWheel SW = new SteeringWheel(randomDiameter, randomMaterial);
				Engine engine = new Engine(randomCylinders);

				Car c = new Car(rnd.nextInt(401), randomYear, SW, engine);
				arr[i][j] = c;
			}
		}

		while (true) {
			System.out.println("Enter 1 to output deepToString of an element.");
			System.out.println("Enter 2 to fill ");
			Scanner scan = new Scanner(System.in);
			int number = scan.nextInt();
			int randomYear = (int) (1950 + Math.random() * 73);
			int randomCylinders = (int) (4 + Math.random() * 8);
			double randomDiameter = 12 + Math.random() * 6.8;
			String randomMaterial = rnd.nextInt(3) == 2 ? "leather" : "polyurethane";

			SteeringWheel SW = new SteeringWheel(randomDiameter, randomMaterial);
			Engine engine = new Engine(randomCylinders);
			Car car = new Car(rnd.nextInt(401), randomYear, SW, engine);

			switch (number) {
			case 1:
				System.out.println(Arrays.deepToString(arr));
				break;
			case 2:
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[i].length; j++) {
						arr[i][j] = car;
					}
				}
				System.out.println("Array is filled.");
				break;
			default:
				break;
			}
		}

	}

}
