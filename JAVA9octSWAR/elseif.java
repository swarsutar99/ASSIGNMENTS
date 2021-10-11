public class elseif {

	public static void main (String args[]) {
		
		int num = 0;
		
		if(num > 0) {
			System.out.println("POSITIVE");
		} else if (num < 0) {
			System.out.println("NEGATIVE");
		} else {
			System.out.println("ZERO");
		}		
		int newNumber = 500;
		if (newNumber > 0) {
			System.out.println("Greater than 0");
		}
		if (newNumber > 50) {
			System.out.println("Greater than 50");
		}
		if (newNumber > 90) {
			System.out.println("Greater than 90");
		}		
      int MyNumber = 300;
		if (MyNumber > 0) {
			System.out.println("Greater than 0");
		}
		else if (MyNumber > 50) {
			System.out.println("Greater than 50");
		}
		else if (MyNumber > 90) {
			System.out.println("Greater than 90");
		}
		
	}
}