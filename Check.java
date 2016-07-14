
public class Check {
	
	int checkArray(int a[])
	{
		int f=0,g=0;
		for(int i=0;i<(a.length-1);i++)
		{
			if(a[i]<=a[i+1]) //elemnts in increasing order
			{
				f=1;
			}
			else if(a[i]>a[i+1]) //elements in decreasing order
			{
				g=2;
			}
		}
		if(f==1 && g==2)
			return 0;
		else if(f==1)
			return 1;
		else
			return 2;
	}
	
	
	public  static void main(String args[])
	{
		Check c=new Check();
		
		int in[]={11,10,9,8,5};
		int out=c.checkArray(in);
		System.out.print(out);
		
	}
	
	
}


