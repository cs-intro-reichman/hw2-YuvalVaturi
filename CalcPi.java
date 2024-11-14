// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int NofTerms = Integer.parseInt(args[0]);
		double JavaPI = Math.PI;
		double appPi = 1;
		double n = 3;
		double term;
		
		//calculating new pi
		for (int i = 3; i < (NofTerms+2); i++){
			term = (double) 1/(n);
			if (i%2 == 0) {
				appPi = appPi + term;
			}
			else {
				appPi = appPi - term;
			}
			n = n + 2;
		}

		System.out.println("pi according to Java: " + JavaPI);
		System.out.println("pi, approximated: " + 4*appPi);

		// java CalcPi.java 1000
		// java CalcPi.java 10
	}
}
