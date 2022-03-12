package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementUsingList {

	public static void main(String[] args) 
	{
		List<Integer> list1 = new ArrayList<>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(7);
		list1.add(6);
		list1.add(8);
		
		System.out.println("List is " + list1);
		
		Collections.sort(list1);
		System.out.println("Sorted list is " + list1);
		
		int size = list1.size();
		System.out.println("Size of List is " +size);
		
				
		for (int i = 0; i < size-1; i++) 
		{
			if(list1.get(i)!= i+1)
			{
				System.out.println("Missing Element in list is " + (i+1));
				break;
			}
		}

	}

}
