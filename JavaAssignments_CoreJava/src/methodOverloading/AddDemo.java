package methodOverloading;

public class AddDemo {
	
	void add(double num1, int num2) {
		double sum = num1 + num2;
		System.out.println("1:"+sum);
	}
	
	void add(double num1, double num2) {
		double sum = num1 + num2;
		System.out.println("2:"+sum);
	}
	
	void add(int num1, int num2) {
		double sum = num1 + num2;
		System.out.println("3:"+sum);
	}
	
	public static void main(String args[]){
		AddDemo obj = new AddDemo();
		
		obj.add(10, 10);
		obj.add(15.5, 6);
	}
}

//No error
