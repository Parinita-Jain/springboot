package core_java_examples;

public class SwitchCaseDemo {
	public static void main(String[] args) {
		int dayOfWeek = 6;
		
//		if(dayOfWeek == 1)
//			System.out.println("Sunday");
//		else if(dayOfWeek == 2)
//			System.out.println("Monday");
//		else if(dayOfWeek == 3)
//			System.out.println("Tuesday");
		
		switch(dayOfWeek) {
			case 1: System.out.println("Sunday");
					break;
			case 2: System.out.println("Monday");
					break;
			case 3: System.out.println("Tuesday");
					break;
			case 4: System.out.println("Wednesday");
					break;
			case 5: System.out.println("Thursday");
					break;
			case 6: System.out.println("Friday");
					break;
			case 7: System.out.println("Saturday");
		}
		
		String name = "andy";
		
		switch(name) {
			case "amy": 
			case "jiya":
			case "leena": System.out.println("Works in Sales");
						break;
			case "harry": 
			case "andy":
			case "ron": System.out.println("Works in Accounts");
						break;
			case "smith":
			case "scott":
			case "mike": System.out.println("Works in IT");
						break;
			default: System.out.println("Works in some other department");
		}
	}
}
