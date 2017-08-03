package methodOverriding;

public class TestMain {
	public static void main(String args[]){
		Person[] persons = new Person[5];
		
		Professor professor1 = new Professor("Aravind",3);
		
		Professor professor2 = new Professor();
		professor2.setBooksPublished(5);
		professor2.setName("Girish");
		
		Student student1 = new Student("Akshay",70);
		
		Student student2 = new Student("Satya",90);
		
		Student student3 = new Student();
		student3.setName("Prithvi");
		student3.setPercentage(100);
		
		persons[0] = professor1;
		persons[1] = professor2;
		persons[2] = student1;
		persons[3] = student2;
		persons[4] = student3;
		
		for(int i = 0; i < persons.length ; i++) {
			if(persons[i] instanceof Student) {
				Student stud = (Student)persons[i];
				stud.display();
				if(stud.isOutstanding()){
					System.out.println("Above student is Outstanding");
					continue;
				}
				System.out.println("Above student is not Outstanding");
			}
			if(persons[i] instanceof Professor) {
				Professor prof = (Professor)persons[i];
				prof.print();
				if(prof.isOutstanding()){
					System.out.println("Above professor is Outstanding");
					continue;
				}
				System.out.println("Above professor is not Outstanding");
			}
		}
 	}
}
