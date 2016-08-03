package job;
/*
 * Convert jobs into MaxHeap according to their priority 
 */
public class DepartmentPrinter {
/*
 * convert jobs into heap 
 */
	Job[] enqueuePriority(Job j[]) {

		for (int i = (j.length - 2) / 2; i >= 0; --i) {
			MaxHeapify(j, i, j.length);
		}
		return j;
	}

	void MaxHeapify(Job j[], int i, int n) {
		int temp, id;
		String name;
		int l = 2 * i + 1;
		int r = 2 * i + 2;
		/*
		 * @param largest-It is the index of largest element from any subtree
		 */
		int largest = i;
		if (l < n && j[l].getJobPriority() > j[i].getJobPriority())
			largest = l;
		if (r < n && j[r].getJobPriority() > j[largest].getJobPriority())
			largest = r;
		if (largest != i) {

			int firstPrior = j[i].getJobPriority();
			int secondPrior = j[largest].getJobPriority();
			String jobname1 = j[i].getJobname();
			String jobname2 = j[largest].getJobname();
			int id1 = j[i].getJobId();
			int id2 = j[largest].getJobId();
          /*
           * swapping job priorites for converting max heap
           */
			temp = firstPrior;
			firstPrior = secondPrior;
			j[i].setJobPriority(secondPrior);
			secondPrior = temp;
			j[largest].setJobPriority(temp);

			name = jobname1;
			jobname1 = jobname2;
			j[i].setJobname(jobname2);
			jobname2 = name;
			j[largest].setJobname(name);

			id = id1;

			id1 = id2;
			j[i].setJobId(id2);
			id2 = id1;
			j[largest].setJobId(id);

			MaxHeapify(j, largest, n);
		}
	}

}
