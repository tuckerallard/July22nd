package com.week1.day5.assignment1;

public class MethodsAndFlow 
{
	private String[] stringArray;

	public MethodsAndFlow(String[] stringArray) 
	{
		this.stringArray = stringArray;
	}
	
	public void outputSubset(int startPosition, int numberOfValues)
	{
		if(startPosition >= 0 && startPosition < stringArray.length)
		{
			
			if(startPosition + numofValues > stringArray.length)
			{
				
			}
			
			for (int i = startPosition; i < (startPosition + numberOfValues); i++)
			{	
				System.out.println(stringArray[i]);
			}
			
		}
		
		else
		{
			System.out.println("Invalid");
		}
	}
	
	public void outputAll()
	{
		outputSubset(0, stringArray.length);
	}

}
