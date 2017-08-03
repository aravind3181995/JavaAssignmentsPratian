package comparingObjects;

public class TestMain {
	public static void main(String args[]){
		Student[] batch1 = new Student[2];
		Student[] batch2 = new Student[2];
		
		Student student1 = new Student();
		student1.setAttendance(10);
		student1.setStudentId(1);
		student1.setStudentName("arjun");
		student1.setStudentScore(97);
		
		Student student2 = new Student();
		student2.setAttendance(4);
		student2.setStudentId(2);
		student2.setStudentName("aravind");
		student2.setStudentScore(95);
		
		batch1[0] = student1;
		batch1[1] = student2;
		
		Student student3 = new Student();
		student3.setAttendance(10);
		student3.setStudentId(3);
		student3.setStudentName("aparna");
		student3.setStudentScore(97);
		
		Student student4 = new Student();
		student4.setAttendance(4);
		student4.setStudentId(4);
		student4.setStudentName("chandana");
		student4.setStudentScore(93);
		
		batch2[0] = student3;
		batch2[1] = student4;
		
		Student bestStudent;
		StudentComparison sc = new StudentComparison();
		bestStudent = sc.compareStudents(batch1, batch2);
		System.out.println(bestStudent.toString());
	}
}
