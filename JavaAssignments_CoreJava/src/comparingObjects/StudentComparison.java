package comparingObjects;

public class StudentComparison {
	
	public Student compareStudents(Student batch1[], Student batch2[]) {
		Student bestStudentBatch1;
		Student bestStudentBatch2;
		Student bestStudent;
		
		bestStudentBatch1 = batch1[0];

		for(int i = 0; i < batch1.length; i++){
			if(bestStudentBatch1.getStudentScore() < batch1[i].getStudentScore()){
				bestStudentBatch1 = batch1[i];
			}
			else if(bestStudentBatch1.getStudentScore() == batch1[i].getStudentScore()){
				if(bestStudentBatch1.getAttendance() > batch1[i].getAttendance()){
					continue;
				}
				bestStudentBatch1 = batch1[i];
			}
			else if(bestStudentBatch1.equals(batch1[i])){
				continue;
			}
		}
		
		bestStudentBatch2 = batch2[0];
		
		for(int i = 0; i < batch2.length; i++){
			if(bestStudentBatch2.getStudentScore() < batch2[i].getStudentScore()){
				bestStudentBatch2 = batch2[i];
			}
			else if(bestStudentBatch2.getStudentScore() == batch2[i].getStudentScore()){
				if(bestStudentBatch2.getAttendance() > batch2[i].getAttendance()){
					continue;
				}
				bestStudentBatch2 = batch2[i];
			}
			else if(bestStudentBatch2.equals(batch2[i])){
				continue;
			}
		}
		
		bestStudent = bestStudentBatch1;
		
		if(bestStudentBatch1.getStudentScore() < bestStudentBatch2.getStudentScore()){
			bestStudent = bestStudentBatch2;
		}
		else if(bestStudentBatch1.getStudentScore() > bestStudentBatch2.getStudentScore()){
			bestStudent = bestStudentBatch2;
		}
		else if(!bestStudentBatch1.equals(bestStudentBatch2)){
			if(bestStudentBatch1.getAttendance() < bestStudentBatch2.getAttendance()){
				bestStudent = bestStudentBatch2;
			}
			else if(bestStudentBatch1.getAttendance() > bestStudentBatch2.getAttendance()){
				bestStudent = bestStudentBatch1;
			}		
		}
		else if(bestStudentBatch2.getStudentId() < bestStudentBatch1.getStudentId()){
			bestStudent = bestStudentBatch2;
		}
		else
			bestStudent = bestStudentBatch1;
		return bestStudent;
	}
}
