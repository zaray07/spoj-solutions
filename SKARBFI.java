import java.util.*;
import java.lang.*;

class Main
{
	static int currentPositionX;
	static int currentPositionY;

	public static void printInfoTreasureOnStartPoint() {
		System.out.println("studnia");
	}

	public static void printInfoTreasureInLine() {
		if (currentPositionX == 0 && currentPositionY > 0)
			System.out.println("0 " + currentPositionY);
		else if (currentPositionX == 0 && currentPositionY < 0)
			System.out.println("1 " + (-currentPositionY));
		else if (currentPositionY == 0 && currentPositionX > 0)
			System.out.println("3 " + currentPositionX);
		else if (currentPositionY == 0 && currentPositionX < 0)
			System.out.println("2 " + (-currentPositionX));
	}

	public static void printInfoTreasureOutOfLine() {
		if (currentPositionY > 0 && currentPositionX > 0) {
			System.out.println("0 " + currentPositionY);
			System.out.println("3 " + currentPositionX);
		} else if (currentPositionY > 0 && currentPositionX < 0) {
			System.out.println("0 " + currentPositionY);
			System.out.println("2 " + (-currentPositionX));

		} else if (currentPositionY < 0 && currentPositionX < 0) {
			System.out.println("1 " + (-currentPositionY));
			System.out.println("2 " + (-currentPositionX));
		} else if (currentPositionY < 0 && currentPositionX > 0) {
			System.out.println("1 " + (-currentPositionY));
			System.out.println("3 " + currentPositionX);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int dataSet = scanner.nextInt();
		for (int i = 0; i < dataSet; i++) {
			
			currentPositionX = 0;
			currentPositionY = 0;
			
			int numberOfTips = scanner.nextInt();
			for (int j = 0; j < numberOfTips; j++) {
				int walkDirection = scanner.nextInt();
				int numberOfSteps = scanner.nextInt();

				switch (walkDirection) {
				case (0):
					currentPositionY += numberOfSteps;
					break;
				case (1):
					currentPositionY -= numberOfSteps;
					break;
				case (2):
					currentPositionX -= numberOfSteps;
					break;
				case (3):
					currentPositionX += numberOfSteps;
					break;
				}
			}
			if (currentPositionX == 0 && currentPositionY == 0)
				printInfoTreasureOnStartPoint();
			else if (currentPositionX == 0 || currentPositionY == 0)
				printInfoTreasureInLine();
			else
				printInfoTreasureOutOfLine();

		}
	}
}