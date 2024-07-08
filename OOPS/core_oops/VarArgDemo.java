package core_oops;

public class VarArgDemo {	
	//parameter called vararg using which
	//we can pass multiple value to single parameter
	
	//all the values that send are the argument
	//to this method are packed in form of an array
	int add(int... numbers) {
		int sum = 0;
		for(int n : numbers) {
			sum += n;
		}
		return sum;
	}
	
	String finalMessage(String... text) {
		String finalStr = "";
		for(String t : text) {
			finalStr += t + " ";
		}
		return finalStr;
	}

	public static void main(String[] args) {
		VarArgDemo d = new VarArgDemo();
		System.out.println(d.add(8,4,4,1,1,4,4,3,6,3,3,3,3,3,9));
		
		System.out.println(d.finalMessage("a","b","c","d","e"));
	}
}
