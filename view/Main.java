package view;

import controller.Controller;

public class Main 
{
	public static void main(String[] args) 
	{		
	Controller c = new Controller();
				
		int n = 10 ;
		int resultado = c.Soma(n);
		System.out.println(resultado);		
	}	
}