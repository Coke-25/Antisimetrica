package es.studium.Antisimetrica;

import java.util.Scanner;

public class Antisimetrica 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner (System.in);
		int tabla[][] = new int [3][3];
		int i,j=0;
		boolean antisimetrica=true;
		
		for (i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.println("Introduce el valor para: "+(i+1)+"-"+(j+1));
				tabla[i][j]= teclado.nextInt();
			}
		}
		
		for (i=0;(i<3)&&(antisimetrica);i++)
		{
			for(j=0;(j<3)&&(antisimetrica);j++)
			{
				if (tabla[i][j]!=-tabla[i][j])
				{
					antisimetrica=false;
				}
			}
		}
		if (antisimetrica)
		{
			System.out.println("Es simétrica");
		}
		else
		{
			System.out.println("No es simétrica");
		}
		teclado.close();
	}

}
