
/* Author - Ian McManus
 * Version - 1.0
 * Date - 7th February 2019
 * Description - class for setting cells dead or alive
 */

public class Cell 
{
	private int a, b;
	private boolean cellAlive = false;

	public Cell(int a, int b) 
	{
		this.a = a;
		this.b = b;
	}//end Cell constructor

	public int getA() 
	{
		return a;
	}//end getA method

	public int getB() 
	{
		return b;
	}//end getB method
	
	public void setA(int a) 
	{
		this.a = a;
	}//end setA method

	public void setB(int b) 
	{
		this.b = b;
	}//end setB method

	public boolean isAlive() 
	{
		return cellAlive;
	}//end isAlive method

	public void setAlive(boolean cellAlive) 
	{
		this.cellAlive = cellAlive;
	}//end setAlive method

	public void toggleAlive() 
	{
		this.cellAlive = !this.cellAlive;
	}//end toggle dead or alive method

}//end class