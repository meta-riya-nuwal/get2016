package Single;
import java.util.*;
public class Stack<T> {

	LinkedList<T> l=new LinkedList<T>();
	int top=-1;
   void push(T data)
   {
	  
	   l.add(data);
	   ++top;
	   
   }
	
   Boolean pop()throws NullPointerException
   {
	   if(top==-1)
	   {
		   throw new NullPointerException();
	   }
	   Boolean b=l.removeItemAtPos(top+1);
	   top--;
	   if(b==true)
		   return true;
	   else
		   return false;
	   
   }
	T peek()throws NullPointerException
	{
		if(top==-1)
		{
			 throw new NullPointerException();
		   
		}
		int j=top+1;
		
		T data=l.retriveItem(j);
		return data;
	}
	
	void show()
	{
		
		//l.reverseList();
		l.display();
		//l.reverseList();
	}
	public static void main(String args[])
	{
		Stack<String> st=new Stack<String>();
		String ch;
		   System.out.println("1. Push Element");
			System.out.println("2. Pop Element");
			System.out.println("3. Peek Element");
			System.out.println("4. Traverse Element");

			do{
			System.out.println("Choose appropriate value according to your requirement");
			Scanner sc=new Scanner(System.in);
			int choice=sc.nextInt();
			switch(choice){
			case 1:
			System.out.println("Enter the element you want to push");
			st.push(sc.next());
			break;
			case 2:
			if(st.pop()){
			System.out.println("Element is poped");
			}
			else{
			System.out.println("can't pop");
			}
			break;
			case 3:
			String data=st.peek();
			System.out.println("Item is"+data);
			
			break;
			case 4:
			st.show();
			break;
			default:
			System.out.println("Invalid choice");

			}
			sc.nextLine();

			
			System.out.println("Do you want more...if yes write yes");
			 ch=sc.nextLine();
			
			}while(ch.compareToIgnoreCase("yes")==0);



			}
}
		

