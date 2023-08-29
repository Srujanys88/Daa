package lab08;
import java.util.Scanner;
public class hamiltonian {
	
		static int x[] =
				new int[10];
		static int n;
		static int g[][] = new int[10][10];

	public static void main(String[] args) 
		// TODO Auto-generated method stub
		{
			Scanner src = new Scanner(System.in);
		
		System.out.println("Enter the number of nodes");
		n=src.nextInt(); 
		
		for (int i=1;i<=n; i++)
		x[i]=0;
		
		System.out.println("Enter the adjacency matrix");
		for (int i=1;i<=n; i++) 
			for (int j=1; j<=n; j++)
				g[i][j]=src.nextInt();
		
		x[1] = 1;
		System.out.println("\n\nHamiltonian Cycle\n");
		hcycle(2);
		}
	
		public static void nextvalue(int k)
		{
			int j; 
			while(true)
			{ 
				x[k] = (x[k] + 1) % (n+1); 
				if(x[k] == 0) return;
				if(g[x[k-1]][x[k]] == 1)
				{ 
					for(j=1;j<=k-1;j++) 
						if(x[j] == x[k] )
							break;
					if(j == k) 
					{ 
						if((k<n) || ((k==n) && (g[x[n]][x[1]] == 1))) 
							return; 
					}
				}
			}
		}
		public static void hcycle(int k) 
		{
			int i;
			while(true) 
			{
				nextvalue(k);
				if(x[k]== 0)
					return;
				if(k==n)
				{ 
					for(i=1;i<=n;i++)
						System.out.print(x[i]+"-->");
					System.out.println(x[1]+"\n");
					} 
				else 
					hcycle(k+1);
				}
			}

	}

		

	


