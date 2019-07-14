package redington.week6.project;

class Book
{
	int price=50;
	String author="";
}
public class Computer {
	int ram=23;
	int getspeed()
	{
		int timeclock=2;
		int speed = timeclock*ram;
		return speed;
	}
	Book getAction()
	{
		Book abc=new Book();
		abc.price=50;
		abc.author="Henry";
		return abc;
	}
	

}
