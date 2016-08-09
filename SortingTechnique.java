package session8;

public class SortingTechnique {

	
	
	public static void main(String args[])
	{
		SortingTechnique sort=new SortingTechnique();
		System.out.println("Comparison Sorting....");
		int array[]={4,3,6,8,10,345};
		if(array.length<10)
		{
			System.out.println("Bubble sort...");
			BubbleSort bubble=new BubbleSort();
			int out[]=bubble.bubbleSort(array);
			for(int i=0;i<out.length;i++)
			{
				System.out.println(out[i]);
			}
		}
		else
		{
			System.out.println("Quick sort...");
			QuickSort quick=new QuickSort();
			int out[]=quick.quickSort(array,0,array.length-1);
			for(int i=0;i<out.length;i++)
			{
				System.out.println(out[i]);
			}
		}
		RadixSort radix = new RadixSort();
		CountSort count = new CountSort();
		int max = count.findMax(array);
		int digit = radix.countDigit(max);
		System.out.println("Linear Sorting....");
		if (digit > 2) {
			System.out.println("Radixsort...");
			int out[] = radix.radixSort(array);
			for (int i = 0; i < out.length; i++) {
				System.out.println(out[i]);
			}
		} else {
			System.out.println("Count sort...");
			int out[] = count.countSort(array);
			for (int i = 0; i < out.length; i++) {
				System.out.println(out[i]);
			}
		}
	}
}
