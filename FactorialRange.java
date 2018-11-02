package firstProject;
import java.util.*;

public class FactorialRange {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number:");
			int n=sc.nextInt();		
			int i,j,f=1;
			for(i=1;i<=n;i++)
			{f=1;
				for(j=1;j<=i;j++)
				{
					f=f*j;
				}
				System.out.println("Factorial of "+i+" is "+f);
			}
			sc.close();
		}

	}



