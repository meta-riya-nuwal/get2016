package job;
import java.util.*;
public class Job {
	/*
	 * Different cateogory priority 
	 */
final int chair=4;
final int professor=3;
final int grad=2;
final int undergrad=1;
int jobId;
String jobname;
int jobPriority;
public int getJobId() {
	return jobId;
}
public void setJobId(int jobId) {
	this.jobId = jobId;
}
public String getJobname() {
	return jobname;
}
public void setJobname(String jobname) {
	this.jobname = jobname;
}
public int getJobPriority() {
	return jobPriority;
}
public void setJobPriority(int jobPriority) {
	this.jobPriority = jobPriority;
}
/*
 * Enter jobs and their name 
 */
Job[] insertJobs(Job j[])
{
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<j.length;i++)
	{
		j[i]=new Job();
		System.out.println("Enter job from avilable job");
		System.out.println("Available jobs are: chair professor grad undergrad");
		String job=sc.next();
		/*
		 * Jobs category should be only that are given
		 */
		while(true)
		{
		if(job.equals("chair")||job.equals("professor")||job.equals("grad")||job.equals("undergrad"))
		{
			break;
		}
		else
		{
			System.out.println("Enter job from avilable job only");
			System.out.println("Available jobs are: chair professor grad undergrad");
			job=sc.next();
			
		}
		}
		switch(job)
		{
		case "chair":j[i].setJobname(job);
		j[i].setJobPriority(chair);
		break;
		case "professor":j[i].setJobname(job);
		j[i].setJobPriority(professor);
		break;
		case "grad":j[i].setJobname(job);
		j[i].setJobPriority(grad);
		break;
		case "undergrad":j[i].setJobname(job);
		j[i].setJobPriority(undergrad);
		break;
			
		}
		
		j[i].setJobId(i);
		
		
		
	}
	return j;
}
	
	
}
