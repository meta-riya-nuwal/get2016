package job;

public class Print {

	DepartmentPrinter dp=new DepartmentPrinter();
	/*
	 * Print jobs that has maximum priority from available jobs
	 */
	void printJob(Job j[])
	{
		/*
		 * @param currentLength-It is the length after removing jobs that are printed
		 */
	   int currentLength=j.length-1;
       for(int i=0;i<j.length;i++)
       {
    	 
    	   System.out.println("Job process is"+j[0].getJobId()+"priority is "+j[0].getJobPriority()+"and name "+j[0].getJobname());
    	   j[0].setJobId(j[currentLength].getJobId());
    	   j[0].setJobname(j[currentLength].getJobname());
    	   j[0].setJobPriority(j[currentLength].getJobPriority());
    	  j= maintainOrder(j,currentLength);
    	  
    	 /*
    	  * Jobs that are printed should be remove from queue
    	  */
    	   currentLength--;
       }
		
		
		
	}
	
	Job [] maintainOrder(Job j[],int n)
	{
		for (int i = (n-2)/2; i >= 0; --i)
		{
	        dp.MaxHeapify(j, i, n);
		}
		return j;
	}
}
