package comparingObjects;

public class Student {
	private int studentId;
	private String studentName;
	private int studentScore;
	private int attendance;
	
	public Student(){
		
	}
	
	public Student(int studentId, String studentName, int studentScore) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentScore = studentScore;
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentScore() {
		return studentScore;
	}
	public void setStudentScore(int studentScore) {
		this.studentScore = studentScore;
	}
	public int getAttendance() {
		return attendance;
	}
	public void setAttendance(int attendance) {
		this.attendance = attendance;
	}
	
	public boolean equals(Object object){
		if(object instanceof Student){
			Student student = (Student) object;
			if(student.getStudentScore() != this.getStudentScore()){
				return false;
			}
			if(student.getAttendance() != this.getAttendance()){
				return false;
			}
		}
		return true;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName="
				+ studentName + ", studentScore=" + studentScore
				+ ", attendance=" + attendance + "]";
	}
}
