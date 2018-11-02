package firstProject;
import java.util.*;

public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,r,sum,a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		sum=0;
		a=n;
		while(n!=0)
		{
			r=n%10;
			sum=sum+r*r*r;
			n=n/10;
		}
		if(sum==a)
		{
			System.out.println("The given number is Amstrong number");
		}
		else
		{
			System.out.println("The given number is not a Amstrong number");
		}
		sc.close();

	}

}
