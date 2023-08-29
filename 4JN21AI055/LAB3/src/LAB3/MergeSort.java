package LAB3;

import java.util.Random;
import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) 
	{
		int a[]=new int[100000];
		Scanner in =new Scanner(System.in);
		long start,end;
		
		System.out.println("**Merge Sort Program***");
		
		System.out.println("How Many Elements!!!!!");
		int n=in.nextInt();
		
		Random rn=new Random();
		for(int i=0;i<n;i++)
			a[i]=rn.nextInt(100000);
		
		System.out.println("Array Before Sorting");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+"\t");
		
		start=System.nanoTime();
		mergesort(a,0,n-1);
		end=System.nanoTime();
		
		System.out.println("\nArray After Sorting ");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+"\t");
		
		System.out.println("\nTime Taken="+ (end-start) +"ns");
		
		System.out.println("********************************");
	}

	static void mergesort(int a[],int low,int high)
	{
		int mid;
		if(low<high)
		{
			mid=(low+high)/2;
			
			mergesort(a,low,mid);
			mergesort(a,mid+1,high);
			merge(a,low,mid,high);
		}
	}
	
	static void merge(int a[],int low,int mid,int high)
	{
		int i, j, h,k,b[]=new int[100000];
		h=low;
		i=low;
		j=mid+1;
		while((h<=mid)&&(j<=high))
		{
			if (a[h]<a[j])
			{
				b[i]=a[h];
				h=h+1;
			}
			else
			{
				b[i]=a[j];
				j=j+1;
			}
			i=i+1;
		}
		if(h>mid)
		{
			for(k=j;k<=high;k++)
			{
				b[i]=a[k];
				i=i+1;
			}
		}
		else
		{
			for(k=h;k<=mid;k++)
			{
				b[i]=a[k];
				i=i+1;
			}
		}
		for(k=low;k<=high;k++)
			a[k]=b[k];
	}
}
