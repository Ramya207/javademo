package firstProject;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The prime numbers between 2 and 100 are");
		int i,j,c;
		for(i=2;i<=100;i++)
		{
			c=0;
			for(j=2;j<=100;j++)
			{
				if(i%j==0)
				{
					c=c+1;
				}
			}
			if(c==1)
			{
				System.out.print(i+" ");
			}
			else
				continue;
		}

	}

}
