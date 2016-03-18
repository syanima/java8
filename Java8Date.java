import java.time.*;
public class Java8Date{
	public static void main (String args[]){
		Java8Date java8Tester = new Java8Date();
		java8Tester.testLocalDateTime();
	}
	public void testLocalDateTime(){
		LocalDateTime dateOn = LocalDateTime.now();
		System.out.println(dateOn);
	}
}