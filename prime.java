package firstProject;
import java.util.*;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i,n,count=0;
		System.out.println("enter the number");
		n=sc.nextInt();
		for(i=2;i<=n;i++)
		{
			if(n%i==0)
			{
				count+=1;
			}
		}
		if(count==1)
		{
			System.out.println("the given number is prime");
		}
		else
		{
			System.out.println("the given number is not prime");
		}
		sc.close();
	}

}
