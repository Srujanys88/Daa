package lab2;

import java.util.*;
public class QuickSort {

	public static void main(String[] args) 
	{
		int n;
		int[] a=new int[100000];
		
		System.out.println("How Many Elements!!!!!");
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		
		Random rn=new Random();
		for(int i=0;i<n;i++)
			a[i]=rn.nextInt(100000);
		
		System.out.println("Array Before Sorting");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+"\t");
		
		long start,end;
		
		start=System.nanoTime();
		
		sort(a,0,n-1);
		
		end=System.nanoTime();
		
		System.out.println("\nArray After Sorting ");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+"\t");
		
		System.out.println("\nTime Taken="+ (end-start) +"ns");

	}
	static void sort(int a[], int First,int Last)
	{
		int s;
		if(First<Last)
		{
			s=partition(a,First,Last);
			sort(a,First,s-1);
			sort(a,s+1,Last);
		}
	}
	static int partition(int a[], int F,int L)
	{
		int p,i,j;
		p=a[F];
		i=F;
		j=L;
		
		while(i<j)
		{
			while(a[i]<p)
				i++;
			
			while(a[j]>p)
				j--;
			
			if(i<j)
			{
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
		}
		a[F]=a[j];
		a[j]=p;
		
		return j;
		
	}
}

