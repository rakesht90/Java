package udemy.interview.sudoku;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import udemy.interview.sudoku.Sudoku;

public class SudokuTest {
 
	int[][] grid;
	Sudoku s;
	
	@Before
	public void init() {
		grid = new int[][]{{1,0,0,4,0,0,0,0,0}, {0,4,0,0,0,0,0,0,0},{3,0,0,0,0,0,0,0,0},{0,1,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0}};
		s = new Sudoku(grid);
	}
	
	@Test
	public void isEmptyAreaTest() {
		Assert.assertTrue(s.isEmptyArea(1, 3));
		Assert.assertFalse(s.isEmptyArea(3, 1));
	}
	
	@Test
	public void isUsedInRowTest() {
		Assert.assertTrue(s.isUsedInRow(3, 1));
		Assert.assertFalse(s.isUsedInRow(2, 1));
	}
	
	@Test
	public void isUsedInColTest() {
		Assert.assertTrue(s.isUsedInCol(1, 1));
		Assert.assertFalse(s.isUsedInCol(3, 1));
	}
	
	@Test
	public void isUsedInBoxTest() {
		Assert.assertTrue(s.isUsedInBox(1, 4, 4));
		Assert.assertFalse(s.isUsedInBox(1, 4, 3));
	}
	
	@Test
	public void isAreaSafeTest() {
		Assert.assertTrue(s.isAreaSafe(1, 4, 3));
		Assert.assertFalse(s.isAreaSafe(1, 4, 4));
	}
	
	@Test
	public void findEmptyAreaTest() {
		Assert.assertArrayEquals(new int[]{0, 1}, s.findEmptyArea(null, null));
	}

	
	@Test
	public void solveTest() {
		boolean canSolve = s.solve();
		Assert.assertTrue(canSolve);
		
		s.printMe();
	}
}
