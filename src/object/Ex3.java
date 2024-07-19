package object;

public class Ex3 {

	public static void main(String[] args) {
		
		
		
	}

}

// 학생 클래스
class Student {
	
	int id; // 학번
	String name; // 학생이름
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) { // 학생객체인지 확인
			Student student = (Student) obj; // Student로 형변환
			if(this.id == student.id) { // 학번이 가으면 true 변환
				return true;
			}
		}
		return false;
	}
	
}















