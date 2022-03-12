package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) 
	{
		List<Integer> list1 = new ArrayList<>();
		
		list1.add(3);
		list1.add(2);
		list1.add(11);
		list1.add(4);
		list1.add(6);
		list1.add(7);
		
		System.out.println("List elements are " +list1);
		
		Collections.sort(list1);
		System.out.println("sorted list is " +list1);
		
		int size = list1.size();
		System.out.println("Size of the list is " +size);
		
		System.out.println("The second largest element in given list is "+ list1.get(size-2));
	}

}
