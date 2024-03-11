package controller;

public class Ex01Principal 
{

	public static void main(String[] args) 
	{
		int [] vetor = {74,20,74,87,81,16,25,99,44,58};

		Ex01Controller oCont = new Ex01Controller();
		vetor = oCont.BubbleSort(vetor);
		
		System.out.println(" ");
		System.out.println("=====================");
		
		for (int valor : vetor)
		{
			System.out.print(valor+ " ");
		}
		System.out.println(" ");
		System.out.println("=====================");
		}

}
