import java.util.ArrayList;


public class Tower_hanoi {

	ArrayList<String>al=new ArrayList<String>();
	
	ArrayList<String> steps(String start,String end,String aux,int disk)
	{
		if(disk==1)
		{
			//System.out.print(start+"->"+end);
			
			al.add(start+"->"+end);
		}
		else
		{
			steps(start,aux,end,disk-1);
//System.out.print(start+"->"+end);
			
			al.add(start+"->"+end);
			steps(aux,end,start,disk-1);
		}
		
		
		return al;
	}
	
	
	public static void main(String args[])
	{
		Tower_hanoi t=new Tower_hanoi();
		ArrayList<String> sl=t.steps("A","B","C",3);
		System.out.println(sl);
	}
	
	
}
