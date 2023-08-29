import java.util.*;
public class MinElement
{
	public static void main(String[] args)
	{
		int n,min;
		int[] a= new int[10];
		
		System.out.println("Please Enter the Value of n");
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		
		System.out.println("Enter the Array Elements:");
		for(int i=0;i<n;i++)
			a[i]=in.nextInt();
		
		min=a[0];
		 for(int i=1;i<n;i++)
			 if(a[i]<min)
				 min=a[i];
		System.out.println("Array Elements are:");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+"\t");
		System.out.println("\nMininum Element = "+min);
		
	}
}