package abstraction;

//Anonymous means nameless
//Anonymous class is mostly used with
//abstract class or interface

interface Person{
	void login();
	void logout();
}

class Customer implements Person{
	@Override
	public void login() {	
		System.out.println("Customer Logged In");
	}
	@Override
	public void logout() {
		System.out.println("Customer Logged Out");
	}
}

public class AnonymousClassDemo {
	public static void main(String[] args) {
		Customer c = new Customer();
		c.login();
		c.logout();
		
		//Anonymous Class
		//Below statement create the object of 
		//a nameless class that implements Person
		//interface and also creates the instance
		//of the anonymous
		Person p = new Person() {
			public void login() {
				System.out.println("Anonymous Person Logged In");
			}
			public void logout() {
				System.out.println("Anonymous Person Logged Out");
			}
		};
		p.login();
		p.logout();
	}

}
