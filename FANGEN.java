import java.util.*;
import java.lang.*;

import java.util.Scanner;


class WingedFan {
	private static String[][] wingedFanArray;
	private static int wingSize;

	public WingedFan(int wingSize) {
		WingedFan.wingSize = wingSize;
		WingedFan.wingedFanArray = new String[2 * wingSize][2 * wingSize];
		drawDots();
	}


	private void drawDots() {
		wingSize = (Math.abs(wingSize));

		for (int i = 0; i < wingSize * 2; i++)
			for (int j = 0; j < wingSize * 2; j++)
				wingedFanArray[i][j] = ".";
	}

	public void printWingedFan() {
		for (int i = 0; i < wingSize * 2; i++) {
			System.out.println();
			for (int j = 0; j < wingSize * 2; j++)
				System.out.print(wingedFanArray[i][j]);
		}
		System.out.println();
	}

	public static String[][] getWingedFanArray() {
		return wingedFanArray;
	}

	public static void setWingedFanArray(String[][] wingedFanArray) {
		WingedFan.wingedFanArray = wingedFanArray;
	}

	public static int getWingSize() {
		return wingSize;
	}

	public static void setWingSize(int wingSize) {
		WingedFan.wingSize = wingSize;
	}
}

class ClockwiseWingedFan extends WingedFan {

	public ClockwiseWingedFan(int wingSize) {
		super(wingSize);
		drawFan();
	}

	private void drawFan() {
		int wingSize = WingedFan.getWingSize();
		String[][] array = WingedFan.getWingedFanArray();
		
		for (int i = 0, p = 0; i < wingSize; i++) {
			for (int j = 0; j < wingSize - p; j++)
				array[i][j + p] = "*";
			p++;
		}

		for (int i = 0, p = wingSize; i < wingSize; i++) {
			p--;
			for (int j = ((wingSize * 2) - 1); wingSize + p <= j; j--)
				array[i][j] = "*";
		}

		for (int i = wingSize, p = 0; i < wingSize * 2; i++) {
			for (int j = 0; wingSize - p > j; j++)
				array[i][j] = "*";
			p++;
		}

		for (int i = wingSize, p = wingSize; i < wingSize * 2; i++) {
			p--;
			for (int j = wingSize; (wingSize * 2) - p > j; j++)
				array[i][j] = "*";
		}
		WingedFan.setWingedFanArray(array);
	}
}
class CounterclockwiseWingedFan extends WingedFan {

	public CounterclockwiseWingedFan(int wingSize) {
		super(wingSize);
		drawFan();
	}

	private void drawFan() {
		int wingSize = WingedFan.getWingSize();
		String[][] array = WingedFan.getWingedFanArray();

		for (int i = 0, p = wingSize; i < wingSize; i++) {
			p--;
			for (int j = 0; (wingSize) - p > j; j++)
				array[i][j] = "*";
		}
		for (int i = 0, p = 0; i < wingSize; i++) {
			for (int j = wingSize; wingSize * 2 - p > j; j++)
				array[i][j] = "*";
			p++;
		}

		for (int i = wingSize, p = 0; i < wingSize * 2; i++) {
			p--;
			for (int j = wingSize - 1; wingSize + p <= j; j--)
				array[i][j] = "*";
		}

		for (int i = wingSize, p = 0; i < wingSize * 2; i++) {
			for (int j = wingSize; j < wingSize * 2 - p; j++)
				array[i][j + p] = "*";
			p++;
		}

		WingedFan.setWingedFanArray(array);
	}

}

public class Main {

public static void main (String[] args) throws java.lang.Exception {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			int fanSize = scanner.nextInt();

			if (fanSize < 0) {
				WingedFan wingedFan = new ClockwiseWingedFan(Math.abs(fanSize));
				wingedFan.printWingedFan();
			} else if (fanSize > 0) {
				WingedFan wingedFan = new CounterclockwiseWingedFan(fanSize);
				wingedFan.printWingedFan();
			} else if (fanSize == 0)
				break;
		}
	}
}

	
