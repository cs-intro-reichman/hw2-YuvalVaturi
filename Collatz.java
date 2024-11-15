// Demonstrates the Collatz conjecture.

import javax.print.DocFlavor.STRING;

public class Collatz {
	public static void main(String args[]) {

		int N = Integer.parseInt(args[0]);
		String vc = args[1];
		int num = 0;
		for (int i = 1; i < N + 1; i++) {
			while (num != 1){
				
				if (num == 0){
					num = 1;
				}
				if (vc.equals("v")) {
					System.out.println(num);
				}
				if (num % 2 == 0) {
					num = num /2;
				}
				else {
					num = num*3 + 1;
				}
				
			}
			if (vc.equals("v")) {
				System.out.println("("+ N +")");
			}
			num = i + 1;
		}
		System.out.println((String)"Every one of the first " + N + " hailstone sequences reached 1.");
	}
}
// java Collatz.java 7 v
// java Collatz.java 100 c