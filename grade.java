import java.util.Scanner;
class grade{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks:");
		double mark=sc.nextInt();
		if(mark>=90)
		{
			System.out.println("grade of student is A ");
		}
		else if(mark>80 && mark<89)
		{
			System.out.println("grade of student is B");
		}
		else if(mark>70 && mark<79)
		{
			System.out.println("grade of student is C");
		}
		else if(mark>60 && mark<69)
		{
			System.out.println("grade of student is D");
		}
		else
		{
			System.out.println("grade of student is F");
		}
	}
}