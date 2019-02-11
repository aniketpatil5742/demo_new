package Custome;

public class AgeNotValid extends Exception{
	
	String msg;
	 	public AgeNotValid(String msg)
	 	{
	 		this.msg=msg;
	 	}
	 	
	 	public String toString()
	 	{
	 		return msg;
	 	}
}
