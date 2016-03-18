import java.time.LocalTime;
public class Java8{
	public static void main (String args[]){
		Java8 java8Tester = new Java8();
		java8Tester.testLocalTime();
	}
	public void testLocalTime(){
		LocalTime dateOn = LocalTime.of(12,15);
		System.out.println(dateOn);
	}
}