package controller;

public class Ex01Controller 
{

	public Ex01Controller() 
	{
		super();
	}

	public int[] BubbleSort(int [] vetor)
	{
		int tamanho = vetor.length;
		
		for (int i = 0; i < tamanho; i++)
		{
			for(int j = 0; j < tamanho - 1; j++)
			{
				if (vetor[j] > vetor [j + 1])
				{
					int aux = vetor[j];
					vetor [j] = vetor [j + 1];
					vetor [j + 1] = aux;
				}
			}
		}
		
		return vetor;
	}
}
