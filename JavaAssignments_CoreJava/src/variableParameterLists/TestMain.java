package variableParameterLists;

public class TestMain {
	public static void main(String args[]){
		
		displayPassengers(1,"Rama","Laxmana","Bharatha","Shatrugna");
		
		String[] passengers = {"Rama","Laxmana","Bharatha","Shatrugna"};
		displayPassengers(1,passengers);
	}
	
	static void displayPassengers(int i, String... names){
		for(String name: names){
			System.out.println(name);
		}
	}
}
