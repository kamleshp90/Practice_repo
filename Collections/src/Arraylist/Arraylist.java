package Arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist 
{
	public static void main(String[] args)
	{
		List<Integer> firstFivePrimeNumbers=new ArrayList<>();
		firstFivePrimeNumbers.add(2);
		firstFivePrimeNumbers.add(3);
		firstFivePrimeNumbers.add(5);
		firstFivePrimeNumbers.add(7);
		firstFivePrimeNumbers.add(11);
		
		List<Integer> firstTenPrimeNumbers=new ArrayList<>(firstFivePrimeNumbers);
		List<Integer> nextFivePrimeNumbers=new ArrayList<>();
		nextFivePrimeNumbers.add(13);
		nextFivePrimeNumbers.add(17);
		nextFivePrimeNumbers.add(19);
		nextFivePrimeNumbers.add(23);
		nextFivePrimeNumbers.add(29);
		
		firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);
		
//		System.out.println(firstTenPrimeNumbers);
		
		Iterator<Integer> it=firstTenPrimeNumbers.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
