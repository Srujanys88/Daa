import java.util.*;
public class Selection 
{
	public static void main(String[] args) 
	{
		int n,min;
		int[] a=new int[100000];
		
		System.out.println("Enter the Value of n");
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		
		Random rn=new Random();
		for(int i=0;i<n;i++)
			a[i]=rn.nextInt(10000);
		
		System.out.println("Array Before Sorting is:");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+"\t");
		
		long start,end;
		
		start=System.nanoTime();
		for(int i=0;i<n-1;i++)
		{
			min=i;
			for(int j=i+1;j<n;j++)
				if(a[j]<a[min])
					min=j;
			
			int t=a[min];
			a[min]=a[i];
			a[i]=t;
		}
		end=System.nanoTime();
		
		System.out.println("\nArray After Sorting is:");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+"\t");
		
		System.out.println("\nTime Taken="+ (end-start) +"ns");
		
	}

}
