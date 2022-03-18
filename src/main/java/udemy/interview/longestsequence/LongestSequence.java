package udemy.interview.longestsequence;

/**
 * Calculates the longest sequence of characters into a given string
 * 
 * @author Marcos
 */
public class LongestSequence {

	private String longestSequence = "";
	
	/**
	 * Return the longest sequence of characters into a given string
	 * 
	 * 'zabcad'
	 * @param String
	 * @return int
	 */
	public int find(String s) {
		if (s == null) return 0;
		
		StringBuilder currentSequence = new StringBuilder();
		longestSequence = "";
		
		int result = 0;
		int startIndex = 0;
		// (int) 'A' = 95
		boolean[] flag = new boolean[256]; // ASCII table characters
		
		char[] array = s.toCharArray();
		for(int i=0; i<array.length; i++) {
			char current = array[i];
			if (flag[current]) {
				result = Math.max(result,  i - startIndex);
				setMaxSequence(currentSequence);
				
				for (int x=startIndex; x<i; x++) {
					currentSequence.delete(0,  2);
					if (array[x] == current) {
						startIndex = x + 1;
						appendWithComma(currentSequence, current);
						break;
					}
					flag[array[x]] = false;
				}
			} else {
				flag[current] = true;
				appendWithComma(currentSequence, current);
			}
		}
		
		result = Math.max(result, array.length - startIndex);
		setMaxSequence(currentSequence);
		
		return result;
	}

	public void appendWithComma(StringBuilder currentSequence, char current) {
		if (currentSequence.length() > 0) currentSequence.append(",");
		currentSequence.append(current);
	}
	
	public void setMaxSequence(StringBuilder currentSequence) {
		if (longestSequence.length() < currentSequence.length()) longestSequence = currentSequence.toString();
	}
	
	public String getLongestSequence() {
		return longestSequence;
	}
}
