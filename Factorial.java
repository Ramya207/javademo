package firstProject;
import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,f=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			f=f*i;
		}
		System.out.println("The factorial of "+n+" is "+f);
		sc.close();
		

	}

}
