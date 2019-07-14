package assesment;
import java.util.Scanner;
public class Factor {
   private	int number;
   Scanner scan=new Scanner(System.in);
   public void getInput()
   {
	   System.out.println("Enter number ");
	   number=scan.nextInt();
   }
   public void findFactor()
   {
	   System.out.println("Fators of the given number");
	   for(int i=1;i<number;i++)
	   {
		   if(number%i==0)
		   {
			   System.out.println(i);
		   }
	   }
   }

}
