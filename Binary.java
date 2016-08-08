package session7;
import java.util.Scanner;

public class Binary {


int prev=-1;



/*
 * Search up to left side until element is found
 */
public int doBinarySearch(int inputArray[],int lowIndex,int highIndex,int data){

int mid;
if(lowIndex>highIndex){
return prev;
}
else{
mid=(lowIndex+highIndex)/2;

if(inputArray[mid]==data){
prev=mid;
}
if(inputArray[mid]>=data){
return doBinarySearch( inputArray,lowIndex, mid-1,data);
}
else if(inputArray[mid]<data){
return doBinarySearch( inputArray,mid+1, highIndex,data);
}

}
return prev+1;	
}




public static void main(String ar[]){

int position;
Binary search=new Binary();


int inputArray[]={1,2,3,3,4};
System.out.println("Enter the element you want to search");
Scanner sc=new Scanner(System.in);
int data=sc.nextInt();
position=search.doBinarySearch( inputArray,0,inputArray.length-1,data);

System.out.println("LOWEST POSITION IS"+position);

}

}