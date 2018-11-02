package firstProject;
import java.util.*;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,min,max,i;
		int a[]=new int[25];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		n=sc.nextInt();
		System.out.println("Enter the numbers");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		min=a[0];
		max=a[0];
		for(i=1;i<n;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println("The minimum number is "+min);
		for(i=1;i<n;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("the maximum number is "+max);
		sc.close();
		
		

	}

}
