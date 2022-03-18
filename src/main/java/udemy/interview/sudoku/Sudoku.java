package udemy.interview.sudoku;

/**
 * Implementation of the Sudoku game.
 * 
 * 123| |456| |7|8|9|
 * 456| |090| |123
 * 789| |123| |456
 * --------------
 * @author Marcos
 */
public class Sudoku {

	private final int MIN_NUMBER = 1;
	private final int MAX_NUMBER = 9;
	private final int GAME_RANGE = new Double(Math.sqrt(MAX_NUMBER)).intValue();
	
	int[][] grid;
	
	public Sudoku(int[][] grid) {
		this.grid = grid;
	}
	
	public boolean solve() {
		int[] emptyArea = findEmptyArea(null, null);
		Integer emptyRow = emptyArea[0];
		Integer emptyCol = emptyArea[1];
		if (emptyRow == -1 || emptyCol == -1) return true;
		for(int number = MIN_NUMBER;number<=MAX_NUMBER;number++) {
			if (isAreaSafe(emptyRow, emptyCol, number)) {
				grid[emptyRow][emptyCol] = number;
				if (solve()) {
					return true;
				}
				grid[emptyRow][emptyCol] = 0;
			}
		}
		
		return false;
	}
	
	public int[] findEmptyArea(Integer row, Integer col) {
		int[] emptyArea = new int[]{-1,-1};
		if (grid == null) return emptyArea;
		for(int r=0; r<grid.length; r++) {
			for(int c=0; c<grid.length; c++) {
				if (isEmptyArea(r, c)) return new int[]{r,c};
			}
		}
		return emptyArea;
	}
	
	public boolean isEmptyArea(int row, int col) {
		return (grid[row][col] == 0);
	}
	
	public boolean isAreaSafe(Integer emptyRow, Integer emptyCol, int number) {
		if (!isUsedInRow(emptyRow, number) && !isUsedInCol(emptyCol, number) && !isUsedInBox(emptyRow, emptyCol, number)) {
			return true;
		}
		return false;
	}
	
	public boolean isUsedInBox(Integer emptyRow, Integer emptyCol, int number) {
		int startRow = (emptyRow - (emptyRow%GAME_RANGE));
		int startCol = (emptyCol - (emptyCol%GAME_RANGE));
		for(int r=0; r<GAME_RANGE; r++) {
			for (int c=0; c<GAME_RANGE; c++) {
				if (grid[startRow+r][startCol+c] == number) return true;
			}
		}
		return false;
	}
	
	public boolean isUsedInRow(Integer row, int number) {
		for (int c=0; c<grid.length; c++) {
			if (grid[row][c] == number) return true;
		}
		return false;
	}
	
	public boolean isUsedInCol(Integer col, int number) {
		for (int r=0; r<grid.length; r++) {
			if (grid[r][col] == number) return true;
		}
		return false;
	}
	
	public void printMe() {
		for (int r=0; r<MAX_NUMBER;r++){
			if (r > 0 && r%GAME_RANGE==0) System.out.println("\n----------");
			System.out.print("| ");
			for(int c=0; c<MAX_NUMBER;c++){
				if (c>0 && c%GAME_RANGE == 0) System.out.print("|"); 
				System.out.print(grid[r][c]+"|");
			}
			System.out.println("\n----------");
		}
	}
	
}
