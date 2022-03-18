package udemy.interview.oddnumber;

public class OddNumber {

	/**
	 * Print the odd numbers starting from 0 and ending at the number received
	 * <pre>
	 * 11
	 * "1,3,5,7,9,11"
	 * </pre>
	 * 
	 * @param number
	 * @return String
	 */
	public String print(int number) {
		StringBuilder s = new StringBuilder();
		for (int x = 1; x <=number; x++) {
			if (isOdd(x)){
				if (s.length() > 0) s.append(",");
				s.append(x);
			}
		}
		return s.toString();
	}
	
	private boolean isOdd(int x) {
		return (x % 2 == 1);
	}
	
	public String printNoModule(int number) {
		StringBuilder s = new StringBuilder();
		for (int x = 1; x <=number;) {
			if (s.length() > 0) s.append(",");
			s.append(x);
			x = x + 2;
		}
		return s.toString();
	}
	
}
