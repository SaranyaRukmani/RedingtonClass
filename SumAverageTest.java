package assesment;
import java.util.Scanner;
public class SumAverageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumAverage obj=new SumAverage();
		Scanner scan=new Scanner(System.in);
		System.out.println("SUM AND AVERAGE OF NUMBERS");
		System.out.println("**************************");
		boolean b=true;
		int i=0;
		while(b)
		{
			obj.getInput();
			i++;
			System.out.println("Do you want to quit press q ");
			char quit=scan.next().charAt(0);
			if(quit=='q'||quit=='Q')
			{
				b=false;
			}
		}
		obj.sumAverage(i);

	}

}
