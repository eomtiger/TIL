package conditional_while;

public class WhileNumberPlayer {

	int number;

	public WhileNumberPlayer(int i) {
		this.number = i;
	}

	public void printSquaresUptoLimit() {
		int i = 1;
		while (i * i < 30) {
			System.out.print(i * i + " ");
			i++;
		}
		System.out.println();
	}

	public void printCubesUptoLimit() {
		int i = 1;
		while ((int) Math.pow(i, 3) < 30) {
			System.out.print((int) Math.pow(i, 3) + " ");
			i++;

		}

	}

}
