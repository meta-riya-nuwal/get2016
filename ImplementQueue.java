package data_struct;

import java.util.Scanner;
import java.util.*;
public class ImplementQueue {

	
	public static void main(String args[])
	{
	
	Queue<Integer>q=new Queue<Integer>();
	String ch;
	int choice=0;
	
	try
	{
		  System.out.println("1. Add Element");
			System.out.println("2.Remove Element");
			System.out.println("3. Reteieve Element");
			
			do{
			System.out.println("Choose appropriate value according to your requirement");
			Scanner sc=new Scanner(System.in);
			String choce=sc.next();
			try
			{
			 choice=Integer.parseInt(choce);
			}
			catch(NumberFormatException e)
			{
				System.out.println("Number should be digito nly");
				
			}
			switch(choice){
			case 1:
			System.out.println("Enter the element you want to enqueue in queue");
			q.add(sc.nextInt());
			break;
			case 2:
			int data=q.remove();
			System.out.println(data+"is remove from list");
			break;
			
			case 3:
			 data=q.peek();
			System.out.println("Element at front is"+data);
			break;
			
			default:
			System.out.println("Invalid choice");

			}
			
			
			System.out.println("Do you want more...if yes write yes");
			 ch=sc.next();
			
			}while(ch.equalsIgnoreCase("yes"));
	
	}
	catch(NoSuchElementException e)
	{
		System.out.println("Underflow condition no elemeent remaining in list");
	}
}
}
