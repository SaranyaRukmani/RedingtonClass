package assesment;
import java.util.Scanner;
public class Palindrome {
     private int number,rem,rev=0,temp;
     Scanner scan=new Scanner(System.in);
     public void getInput()
     {
    	 System.out.println("Enter number ");
    	 number=scan.nextInt();
     }
     public void findPalindrome()
     {
    	 temp=number;
    	 while(number>0)
    	 {
    		 rem=number%10;
    		 rev=(rev*10)+rem;
    		 number=number/10;
    	 }
    	 if(temp==rev)
    	 {
    		 System.out.println(temp+" is palindrome number");
    	 }
    	 else
    	 {
    		 System.out.println(temp+" is not palindrome number");
    	 }
    	 
    	 
     }
}
