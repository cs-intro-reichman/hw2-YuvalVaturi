// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int NofTerms = Integer.parseInt(args[0]);
		double JavaPI = Math.PI;
		double appPi = 1;
		double term = (double) 1/3;
		
		//calculating new pi
		for (int i = 0; i < NofTerms; i++){
			
			if (i/2 == 0) {
				appPi =+ term;
				System.out.println("zogi:" + appPi);
			}
			else {
				appPi =- term;
				System.out.println("ezogi:" + appPi);
			}
			term = (double) (term * (double) 1/2);
			System.out.println("term:" + term);
		}

		System.out.println("pi according to Java: " + JavaPI);
		System.out.println("pi, approximated: " + 4*appPi);


		// java CalcPi.java 1000
		// java CalcPi.java 10
	}
}
