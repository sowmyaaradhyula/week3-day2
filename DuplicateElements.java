package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class DuplicateElements {

	public static void main(String[] args)
	{
		
		List<Integer> list1 = new ArrayList<>();
		
		list1.add(14);
		list1.add(12);
		list1.add(13);
		list1.add(11);
		list1.add(15);
		list1.add(14);
		list1.add(18);
		list1.add(16);
		list1.add(17);
		list1.add(19);
		list1.add(18);
		list1.add(17);
		list1.add(20);
		
		System.out.println("List is " +list1);
		
		int size = list1.size();
		System.out.println("size is "+size);
				
		for (int i = 0; i <size-1; i++) 
		{
			int count = 0;
			for (int j = i+1; j < size; j++) 
			{
				if(list1.get(i)==list1.get(j))
				{
					count++;
					
					
				}
			}
			if(count>0)
			{
				System.out.println(list1.get(i));
			}
		
		}
		
		
		
	}

}
