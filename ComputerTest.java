package redington.week6.project;

public class ComputerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer c=new Computer();
		int speed=c.getspeed();
		Book book=c.getAction();
		System.out.println(book.price);
		System.out.println(book.author);

	}

}
