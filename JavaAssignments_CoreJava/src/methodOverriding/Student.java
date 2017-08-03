package methodOverriding;

public class Student extends Person{
	private double percentage;
	
	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public Student() {
		
	}
	
	public Student(String name, double percentage) {
		super(name);
		this.percentage = percentage;
	}
	
	public void display() {
		System.out.println("Student [percentage=" + percentage + ", getPercentage()="
				+ getPercentage() + ", isOutstanding()=" + isOutstanding()
				+ ", getName()=" + getName() + "]");
	}

	public boolean isOutstanding() {
		if(this.getPercentage() >= 85){
			return true;
		}
		return false;
	}
}
