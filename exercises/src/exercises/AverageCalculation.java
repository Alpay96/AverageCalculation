package exercises;

import java.util.Scanner;

public class AverageCalculation {

	public static void main(String[] args) {
		int math, physics, chemical, turkish, history, music;

		Scanner scan = new Scanner(System.in);

		System.out.print("Your math note: ");
		math = scan.nextInt();

		System.out.print("Your physics note: ");
		physics = scan.nextInt();

		System.out.print("Your chemical note: ");
		chemical = scan.nextInt();

		System.out.print("Your turkish note: ");
		turkish = scan.nextInt();

		System.out.print("Your history note: ");
		history = scan.nextInt();

		System.out.print("Your music note: ");
		music = scan.nextInt();

		double a = (math + physics + chemical + turkish + history + music) / 6;
		System.out.println("Your note average: " + a);

		String durum = a > 60 ? "You passed!" : "You failed.";
		System.out.println(durum);
	}
}
