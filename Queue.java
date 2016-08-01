package Single;

import java.util.Scanner;

public class Queue<T> {

	int max=3;
	int front=-1,rear=-1;
	T array[]=(T[])new Object[max];
	
	
	 Boolean enqueue(T data)throws ArrayIndexOutOfBoundsException
	 {
		 if(rear==-1)
		 {
			 front=0;
		 }
		 if(rear>=max)
		 {
			 throw new ArrayIndexOutOfBoundsException();
			
			 
		 }
		 else
		 {
			 rear=rear+1;
			 array[rear]=data;
			 return true;
		 }
	 }
	 void show()throws NullPointerException
	 {
		 if(rear==-1)
		 {
			 throw new NullPointerException();
		 }
		 for(int i=front;i<=rear;i++)
		 {
			 
			
			 System.out.println(array[i]);
		 }
	 }
	
	Boolean dequeue()throws NullPointerException
	{
		if(rear==-1)
		{
			throw new NullPointerException();
		}
		
		front=front+1;
		if(front==rear)
		{
			front=front-1;
			rear=rear-1;
			
		}
		return true;
	}
	
	T getFront()throws IllegalArgumentException
	{
		if(front==-1)
		{
			throw new IllegalArgumentException();
		}
		return array[front];
	}
	void queueEmpty()
	{
		rear=-1;
		front=-1;
	}
	
	public static void main(String args[])
	{
		Queue<Integer> q=new Queue<Integer>();
		String ch;
		try
		{
			  System.out.println("1. Enqueue Element");
				System.out.println("2. Dequeue Element");
				System.out.println("3. Traverse Element");
				System.out.println("4.Get front element");
				System.out.println("5. Make queue empty");
				do{
				System.out.println("Choose appropriate value according to your requirement");
				Scanner sc=new Scanner(System.in);
				int choice=sc.nextInt();
				switch(choice){
				case 1:
				System.out.println("Enter the element you want to enqueue in queue");
				q.enqueue(sc.nextInt());
				break;
				case 2:
				if(q.dequeue()){
				System.out.println("Element is poped");
				}
				else{
				System.out.println("can't pop");
				}
				break;
				
				case 3:
				q.show();
				break;
				case 4:
					int data=q.getFront();
					System.out.println("Item on front position is"+data);
				case 5:
					q.queueEmpty();
				default:
				System.out.println("Invalid choice");

				}
				sc.nextLine();

				
				System.out.println("Do you want more...if yes write yes");
				 ch=sc.nextLine();
				
				}while(ch.compareToIgnoreCase("yes")==0);
		
		}
		
		catch(NullPointerException e)
		{
			System.out.println("Underflow condition ");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			 System.out.println("Overflow condition occurs");
			
		}
		catch(IllegalArgumentException e)
		{
			 System.out.println("Overflow condition occurs");
			
		}
		
		
	}
}
