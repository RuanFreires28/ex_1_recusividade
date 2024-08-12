package controller;

public class Controller 
{	
	public Controller() 
	{
		super();
	}
	
	public int Soma (int n) 
	{	
		//condição de parada
		if (n <= 0) 
		{
			return 0;
		}
		else 
		{
		return n + Soma(n - 1); //chamada de passos
		}
	}
}