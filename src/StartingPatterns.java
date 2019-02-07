
/* Author - Ian McManus
 * Version - 1.0
 * Date - 7th February 2019
 * Description - Class for the different starting patterns
 */

public class StartingPatterns 
{
	
	
	//method for choosing the different starting patterns
	public static void patterns(String pattern, Cell[][] cell) 
	{
			
		if(pattern.equals("Three Cell Row"))
		{
			cell[9][7].setAlive(true);
			cell[9][8].setAlive(true);
			cell[9][9].setAlive(true);
		}//end if statement
			
		else if(pattern.equals("Ten Cell Row"))
		{
			cell[9][3].setAlive(true);
			cell[9][4].setAlive(true);
			cell[9][5].setAlive(true);
			cell[9][6].setAlive(true);
			cell[9][7].setAlive(true);
			cell[9][8].setAlive(true);
			cell[9][9].setAlive(true);
			cell[9][10].setAlive(true);
			cell[9][11].setAlive(true);
			cell[9][12].setAlive(true);
		}//end else if statement
			
		else if(pattern.equals("Glider"))
		{
			cell[10][7].setAlive(true);
			cell[11][8].setAlive(true);
			cell[11][9].setAlive(true);
			cell[10][9].setAlive(true);
			cell[9][9].setAlive(true);		
		}//end else if statement
		
		else if(pattern.equals("Exploder"))
		{
			cell[7][6].setAlive(true);
			cell[9][6].setAlive(true);
			cell[11][6].setAlive(true);
			cell[7][7].setAlive(true);
			cell[11][7].setAlive(true);
			cell[7][8].setAlive(true);
			cell[11][8].setAlive(true);
			cell[7][9].setAlive(true);
			cell[11][9].setAlive(true);
			cell[7][10].setAlive(true);
			cell[9][10].setAlive(true);
			cell[11][10].setAlive(true);
		}//end else if statement
			
		else if(pattern.equals("Small Exploder"))
		{
			cell[9][6].setAlive(true);
			cell[8][7].setAlive(true);
			cell[9][7].setAlive(true);
			cell[10][7].setAlive(true);
			cell[8][8].setAlive(true);
			cell[10][8].setAlive(true);
			cell[9][9].setAlive(true);
		}//end else if statement
			
		else if(pattern.equals("Lightweight Spaceship"))
		{
			cell[8][5].setAlive(true);
			cell[9][5].setAlive(true);
			cell[10][5].setAlive(true);
			cell[11][5].setAlive(true);
			cell[7][6].setAlive(true);
			cell[11][6].setAlive(true);
			cell[11][7].setAlive(true);
			cell[7][8].setAlive(true);
			cell[10][8].setAlive(true);
		}//end else if statement
			
		else if(pattern.equals("Tumbler"))
		{
			cell[7][5].setAlive(true);
			cell[8][5].setAlive(true);
			cell[10][5].setAlive(true);
			cell[11][5].setAlive(true);
			cell[7][6].setAlive(true);
			cell[8][6].setAlive(true);
			cell[10][6].setAlive(true);
			cell[11][6].setAlive(true);
			cell[8][7].setAlive(true);
			cell[10][7].setAlive(true);
			cell[6][8].setAlive(true);
			cell[8][8].setAlive(true);
			cell[10][8].setAlive(true);
			cell[12][8].setAlive(true);
			cell[6][9].setAlive(true);
			cell[8][9].setAlive(true);
			cell[10][9].setAlive(true);
			cell[12][9].setAlive(true);
			cell[6][10].setAlive(true);
			cell[7][10].setAlive(true);
			cell[11][10].setAlive(true);
			cell[12][10].setAlive(true);
		}//end else if statement
			
	}//end starting pattern method

}//end class
