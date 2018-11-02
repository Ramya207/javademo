package firstProject;

public class MathematicalTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Mathematical Tables");
		int i,j;
		for(i=1;i<=10;i++) {
			System.out.println("Table for "+i);
			for(j=1;j<=10;j++)
			{
				System.out.println(i+"*"+j+"="+i*j);
			}
		}

	}

}
