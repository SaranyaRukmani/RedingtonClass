package assesment;
import java.util.Scanner;
public class SumAverage {
	private int number,box=0;
	private double average;
	Scanner scan=new Scanner(System.in);
	void getInput()
	{
		System.out.println("Enter number");
		number=scan.nextInt();
		box=box+number;	
	}
	void sumAverage(int n)
	{
		System.out.println("Sum of numbers "+box);
		average=box/n;
		System.out.println("Average of numbers "+average);
	}

}
