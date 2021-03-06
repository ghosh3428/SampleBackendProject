package com.niit.SampleBackendProject.mypackage;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ScCalculator extends Calculator {
	private static final Logger LOG = LogManager.getLogger(ScCalculator.class);

	public void power() {
		LOG.info("ScCalculator.power() called");
		result = (int) Math.pow(first, second);
	}

	public void root() {
		LOG.info("ScCalculator.root() called");
		// result = (int)Math.pow(first,(1/2));
		result = (int) Math.sqrt(first);
	}

	public void sine() {
		LOG.info("ScCalculator.sine() called");
		result = Math.sin(first);
	}

	public void cosine() {
		LOG.info("ScCalculator.cosine() called");
		result = Math.cos(first);
	}

	public void tangent() {
		LOG.info("ScCalculator.tangent() called");
		result = Math.tan(first);
	}

	public void menu() {
		LOG.info("ScCalculator.menu() called");
		int ch = 0;
		Scanner sc = new Scanner(System.in);
		while (ch != 10) {
			System.out.println("1. Add");
			System.out.println("2. sub");
			System.out.println("3. div");
			System.out.println("4. mul");
			System.out.println("5. power");
			System.out.println("6. square root");
			System.out.println("7. tan");
			System.out.println("8. sin");
			System.out.println("9. cos");
			System.out.println("10. Exit");

			ch = sc.nextInt();

			if (ch >= 7 && ch <= 9)
				acceptOne();
			else if (ch != 10 && ch < 10)
				acceptTwo();

			switch (ch) {
			case 1:
				add();
				break;
			case 2:
				sub();
				break;
			case 3:
				div();
				break;
			case 4:
				mul();
				break;
			case 5:
				power();
				break;
			case 6:
				root();
				break;
			case 7:
				tangent();
				break;
			case 8:
				sine();
				break;
			case 9:
				cosine();
				break;
			case 10:
				System.out.println("Thank You");
				break;
			default:
				System.out.println("Inavlid input");
			}

			if (ch != 10 && ch < 10)
				display();
		}
	}
}
