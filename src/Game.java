import java.awt.Dimension;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;

/* Author - Ian McManus
 * Version - 1.0
 * Date - 7th February 2019
 * Description - 
 */

public class Game
{
	
	
	private static final String GAME_TITLE = "The Game of Life";
	public static final int CELL_SIZE = 20, NUMBER_OF_CELLS = 20;
	public static final int SCREEN_WIDTH = CELL_SIZE * NUMBER_OF_CELLS, SCREEN_HEIGHT = SCREEN_WIDTH;
    	public static final Dimension DIMENSIONS = new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT);
	public static final Cell[][] CELLS = new Cell[NUMBER_OF_CELLS][NUMBER_OF_CELLS];

	
	
	public static void main(String[] args) 
	{
		
		JFrame frame = new JFrame(GAME_TITLE);
		frame.setSize(DIMENSIONS);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		GameCanvas canvas = new GameCanvas();
		frame.add(canvas);
	
		loadCells();

		/*set starting alive cells
		 * starting patterns:-
		 *		Three Cell Row
		 *		Ten Cell Row
		 *		Glider
		 *		Small Exploder
		 *		Exploder
		 *		Lightweight Spaceship
		 *		Tumbler
		 *change pattern string below to any of the above to choose starting pattern
		 */
		String pattern = "Three Cell Row";
		StartingPatterns.patterns(pattern, CELLS);
		startGameSequence(canvas);
		
	}//end main

	
	
	//method for starting the game sequence
	private static void startGameSequence(GameCanvas canvas) 
	{
		
		Timer gameTimer = new Timer();

		gameTimer.schedule(new TimerTask() 
		{
			@Override
			public void run() 
			{
				CellManager.updateCells();
				canvas.repaint();
			}
		}, 1000, 1000);
		
	}// end start game sequence method
	
	
	
	//method for loading cells
		private static void loadCells() 
		{
			
			for (int a = 0; a < CELLS.length; a++) 
			{
				for (int b = 0; b < CELLS[a].length; b++) 
				{
					if (CELLS[a][b] == null)
					{
						CELLS[a][b] = new Cell(a, b);
					}//end if statement
				}//end for loop
			}//end for loop
			
		}//end load cells class

}//end class
