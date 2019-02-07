import java.util.ArrayList;


/* Author - Ian McManus
 * Version - 1.0
 * Date - 7th February 2019
 * Description - class for managing the cells
 */

public class CellManager 
{
	
	
	public static ArrayList<Cell> getNeighbouringCells(Cell cell) 
	{
		
		
		ArrayList<Cell> neighbouringCells = new ArrayList<Cell>();
		int cellA = cell.getA();
		int cellB = cell.getB();

		for (int a = cellA - 1; a <= cellA + 1; a++) 
		{
			
			for (int b = cellB - 1; b <= cellB + 1; b++) {
				if (a < 0 || a >= Game.NUMBER_OF_CELLS || b < 0 || b >= Game.NUMBER_OF_CELLS)
				{
					continue;
				}//end if statement

				Cell neighbouringCell = Game.CELLS[a][b];
				
				if (neighbouringCell.equals(cell))
				{
					continue;
				}//end if statement
				if (neighbouringCell.isAlive())
				{
					neighbouringCells.add(neighbouringCell);
				}//end if statement
			}//end for loop
		}//end for loop

		return neighbouringCells;
	}//end get neighbouringCells method

	public static int getNeighbouringCount(Cell cell) 
	{
		return getNeighbouringCells(cell).size();
	}//end get neighbouring count method

	
	
	//method for checking neighbour cells
	public static void updateCells() 
	{
		
		//array lists to hold alive and dead cells for ready next iteration
		ArrayList<Cell> deadCells = new ArrayList<Cell>();
		ArrayList<Cell> aliveCells = new ArrayList<Cell>();
		int neighbouringCount;

		
		//for loop for populating cell array lists depending on scenario
		for (Cell[] cells : Game.CELLS) 
		{
			for (Cell cell : cells) 
			{
				neighbouringCount = CellManager.getNeighbouringCount(cell);
                              
				if(cell.isAlive()) 
				{
					if(neighbouringCount != 2 && neighbouringCount != 3) 
					{
						deadCells.add(cell);
					}//end if statement
				} else if(neighbouringCount == 3) 
				{
					aliveCells.add(cell);
				}//end else if statement
			}//end for loop
		}//end for loop for populating array lists

		
		
		//for loop for setting alive cells ready for next iteration
		for (Cell cell : aliveCells)
		{
			cell.setAlive(true);
		}//end for loop

		
		
		//for loop for setting dead cells ready for next iteration
		for (Cell cell : deadCells)
		{
			cell.setAlive(false);
		}//end for loop
	}//end method for updating cells

}//end class
