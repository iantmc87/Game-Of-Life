import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

/* Author - Ian McManus
 * Version - 1.0
 * Date - 7th February 2019
 * Description - Class for creating the game canvas
 */

public class GameCanvas extends Canvas 
{
	
	
	public GameCanvas() 
	{
		super();

		this.setSize(Game.SCREEN_WIDTH, Game.SCREEN_HEIGHT);
		this.setBackground(Color.WHITE);
		this.setFocusable(true);
		this.setVisible(true);
	}//end constructor

	
	
	public void paint(Graphics g) 
	{
		int size, a, b;
		Graphics graphics = this.getGraphics();
		graphics.clearRect(0, 0, Game.SCREEN_WIDTH, Game.SCREEN_HEIGHT);
		graphics.setColor(Color.BLACK);
		
		
		for (Cell[] cells : Game.CELLS) 
		{
			
			for (Cell cell : cells) 
			{
				
				if (cell.isAlive()) 
				{
					size = Game.CELL_SIZE;
					a = cell.getA() * size;
					b = cell.getB() * size;

					graphics.fillRect(a, b, size, size);
				}//end if statement
			}//end for loop
		}//end for loop
	}//end paint canvas method

}//end class