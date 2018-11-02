package firstProject;
import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum,r,a;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		n=sc.nextInt();
		sum=0;
		a=n;
		while(n!=0)
		{
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		if(sum==a)
		{
			System.out.println("The given number is Palindrome");
				
		}
		else
		{
			System.out.println("The given number is not a Palindrome");
		}
		sc.close();
		

	}

}
