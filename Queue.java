package data_struct;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Queue<E> {
/*
 * Queue use linked list for implementation
 */
	LinkedList<E> l=new LinkedList<E>();
	
	Boolean add(E e)
	{
		l.add(e);
		return true;
	}
/*
 * @NoSuchElementexception throw by remove() if no element remains in linkedList	
 */
	E remove ()throws NoSuchElementException
	{
		
		int no=l.size();
		if(no>0)
		{
		E data=l.remove();
		return data;
		}
		else{
			throw new NoSuchElementException();
		}
	}
	
	E peek()
	{
		E data=l.getFirst();
		return data;
	}
}
