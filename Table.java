package firstProject;
import java.util.*;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		for(i=1;i<=12;i++)
		{
			System.out.println(n+"*"+i+"="+n*i);
		}
		sc.close();

	}

}
