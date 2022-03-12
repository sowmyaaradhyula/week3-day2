package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) 
	{
	  List<Integer> list1 = new ArrayList<>();
	  
	  list1.add(3);
	  list1.add(2);
	  list1.add(11);
	  list1.add(4);
	  list1.add(6);
	  list1.add(7);
	  
	  System.out.println("List1 items are" + list1);
	  
      List<Integer> list2 = new ArrayList<>();
	  
	  list2.add(1);
	  list2.add(2);
	  list2.add(8);
	  list2.add(4);
	  list2.add(9);
	  list2.add(7);
	  
	  System.out.println("List2 items are" + list2);
	  
	  System.out.println("Intersection elements are");
	  
	  for (int i = 0; i < list1.size(); i++) 
	  {
		 for (int j = 0; j < list2.size(); j++) 
		 {
			if(list1.get(i).equals(list2.get(j)))
			{
				System.out.println(list1.get(i));
			}
		}
	  }
	  
	  

	}

}
