import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		for (int j = 0; j < test; j++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int result = 1;
			int aMODULO = a % 10;
			int bMODULO = b % 4;

			if (bMODULO == 0) {
				result = (int) Math.pow(aMODULO, 4);
			} else {
				for (int i = 1; i <= bMODULO; i++) {
					result *= aMODULO;
				}
				
			}
			System.out.println(result % 10);
		}

	}
}