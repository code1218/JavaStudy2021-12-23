package a13_다형성2;

/*
 * service 로직 처리
 */
public class SchoolService {
	// 스캐너
	
	public Person[] setPersonArray() {
		// 사람 배열의 크기를 지정
		return null;
	}
	
	public Teacher addTeacher() {
		Teacher teacher = new Teacher();
		
		return teacher;
	}
	
	public Student addStudent() {
		Student student = new Student();
		
		return student;
		
	}
	
	public void insertPerson(Person[] persons) {
		/*
		 * 1. 학생 등록
		 * 2. 선생님 등록
		 * if 1이면 학생등록
		 * if 2면 선생님 등록
		 * 
		 */
	}
	
	public void showInfoPerson(Person[] persons) {
		/*
		 * instanceof
		 */
	}
}
