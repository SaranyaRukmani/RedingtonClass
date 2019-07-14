package assesment;
import java.util.Scanner;
public class Divisible {
	private int N,rem,temp,no=0;
	Scanner scan=new Scanner(System.in);
	public void getInput()
	{
		System.out.print("N = ");
		N=scan.nextInt();
	}
	public void result()
	{
		temp=N;
		while(N>0 || no > 9)
		{
			if(N == 0)
			{
				N = no;
				no = 0;
				
			}
			rem=N%10;
			no=no+rem;
			N=N/10;
			
			
		}
		if(temp%no==0)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}

}
