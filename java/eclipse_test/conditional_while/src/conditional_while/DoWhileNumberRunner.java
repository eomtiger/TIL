package conditional_while;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoWhileNumberRunner {

	public static void DoWhileNumber() throws NumberFormatException, IOException {
		int i;
		do {
			System.out.print("Enter a number: ");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			i = Integer.parseInt(br.readLine());
			System.out.println("Cube is " + (int) Math.pow(i, 3));
			if (i < 0) {
				System.out.println("Thank you! Have fun");
			}
		} while (i > 0);

	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		DoWhileNumber();

	}

}
