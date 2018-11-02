package firstProject;
import java.util.*;

public class MaxMinOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 3 numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b && a>c)
		{
			System.out.println(a+" is the biggest number");
		}
		else if(b>c && b>a)
		{
			System.out.println(b+" is the biggest number");
		}
		else
		{
			System.out.println(c+" is the biggest number");
		}
		if(a<b && a<c)
		{
			System.out.println(a+" is the smallest number");
		}
		else if(b<a && b<c)
		{
			System.out.println(b+" is the smallest number");
		}
		else
		{
			System.out.println(c+" is the smallest number");
		}
		sc.close();

	}

}
