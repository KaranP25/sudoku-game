import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/**
 * This JUnit test checks the GUI Panel updates the Gameboard as the user enters inputs.
 * @author 100619029
 *
 */
class UpdateGameBoardTest {

	@Test
	void test() {
		GameBoard board1 = new GameBoard(9);
		int arr1[][] = board1.copy2Dimensional(board1.getGameBoard()); //passing value not reference
        int userInput = 3;
        int uLocX = 0;
        int uLocY = 0;
       
        for(int x = 3; x < arr1.length; x++) {
            for(int y = 2; y < arr1[x].length; y++) {
                if(arr1[x][y] == 0) {
                    uLocX = x;
                    uLocY = y;
                    break;
                }
            }
        }
        board1.b[uLocX][uLocY].setText(String.valueOf(userInput));
        board1.updateBoard();
       
        int updatedBoard[][] = board1.getGameBoard();      
       
        assertEquals(true, arr1[uLocX][uLocY] != updatedBoard[uLocX][uLocY]);
	}

}
