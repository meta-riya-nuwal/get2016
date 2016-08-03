package job;
import java.util.*;
public class ProcessJob {

	
	public static void main (String args[])
	{
		
		System.out.println("How many jobs you want");
		Scanner sc=new Scanner(System.in);
		Job job=new Job();
		Print p=new Print();
		/*
		@param no_of_job -Total Number of jobs
		*/
		int no_of_job=sc.nextInt();
		Job j[]=new Job[no_of_job];
		Job j1[]=job.insertJobs(j);
		DepartmentPrinter dp=new DepartmentPrinter();
		Job j2[]=dp.enqueuePriority(j1);
		for(int i=0;i<j2.length;i++)
		{
			System.out.println(j2[i].getJobPriority());
			System.out.println(j2[i].getJobId());
			System.out.println(j2[i].getJobname());
		}
		p.printJob(j2);
		
	}
	
	
}
