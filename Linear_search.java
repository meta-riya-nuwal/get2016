
public class Linear_search {

	String  Search(int a[],int i,int num)
	{
		if(i>=a.length)
			return "not found";
		else if(num==a[i])
			return "found";
		else
			return Search(a,i+1,num);
		
	}
	
	
	
	
	public static void main(String[] args)
	{
		Linear_search l=new Linear_search();
		int a[]={5,7,8,20,3};
		String no=l.Search(a, 0, 11);
		System.out.print(no);
		
	}
}
