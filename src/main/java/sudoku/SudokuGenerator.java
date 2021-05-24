package sudoku;

public class SudokuGenerator extends SudokuMakers{

	public SudokuPuzzle generateRandomSudoku(SudokuPuzzleType puzzleType) {
		SudokuPuzzle puzzle = new SudokuPuzzle(puzzleType.getRows(), puzzleType.getColumns(), puzzleType.getBoxWidth(), puzzleType.getBoxHeight(), puzzleType.getValidValues());

		for (int i = 0; i < puzzleType.getRows(); i++){
			for (int j = 0; j < puzzleType.getColumns(); j++){
				if (!starter[i][j].equals("0")){
					puzzle.makeMove(i,j,starter[i][j],0);
				}
			}
		}
		return puzzle;
	}



}
