package edu.kh.inheritanace.model.service;

import java.util.Scanner;

import edu.kh.inheritanace.model.vo.Employee;
import edu.kh.inheritanace.model.vo.Person;
import edu.kh.inheritanace.model.vo.Student;

public class InheritanceService {
	
	// 상속 확인 예제
	public void ex1() {
		// Person을 상속받은 Student가 Person 필드, 메서드를 사용 할 수 있는가?
		
		
		Person p = new Person();
		
		// p.name = "홍길동"; // private 때문에 직접접근 불가 (에러발생)
		
		p.setName("홍길동");
		p.setAge(25);
		p.setNationality("대한민국");
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getNationality());
		
		System.out.println("--------------------------------");
		
		// Student 객체 생성
		Student std = new Student();
		
		// Student 만의 고유한 필드
		std.setGrade(3);
		std.setClassRoom(5);
		
		// Person 클래스로 부터 상속 받은 필드, 메서드
		std.setName("고길동");
		std.setAge(19);
		std.setNationality("대한민국");
		
		System.out.println(std.getGrade());
		System.out.println(std.getClassRoom());
		
		// Student가 Person의 메소드 뿐 아니라 필드도 상속 받았는지 확인
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(std.getNationality());
		
		System.out.println("----------------------------");
		
		Employee emp = new Employee();
		
		// Employee 만의 고유 메서드
		emp.setCompany("KH정보교육원");
		
		emp.setName("최규연");
		emp.setAge(23);
		emp.setNationality("대한민국");
		
		System.out.println(emp.getCompany()); 
		
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		System.out.println(emp.getNationality());
		
		System.out.println("----------------------------");
		
		// 추가된 breath 메서드 상속확인
		p.breath();
		std.breath();
		emp.breath();
		// 상속의 특징
		// 1) 코드 추가 및 수정에 용이함
		// -> 부모에게 정의하면 자식들은 모두 부모의 것을
		// 		그대로 받아서 쓸 수 있음!
		
		
		
	}
	
	
	// super() 생성자 사용방법
	public void ex2() {
		
		// Student 매개변수 5개짜리 생성자
		Student std = new Student("김철수", 17, "한국", 1, 3);
		
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(std.getNationality());
		
		System.out.println(std.getGrade());
		System.out.println(std.getClassRoom());
		
	}
	
	// 오버라이딩 확인 예제
	public void ex3() {
		
		Student std = new Student();
		Employee emp = new Employee();
		
		std.move();	// 오버라이딩 X -> Person의 메서드 수행
		
		emp.move(); // 오버라이딩 O -> Employee 메서드 수행
		
	}

	// ObjectClass
	public void ex4() {
		
		// 모든 클래스는 Object클래스의 후손
		// == 모든 클래스의 최상위 부모는 Object
		
		Person p = new Person();
		// Object 를 상속받은 Petson 객체 생성
		
		Student std = new Student();
		// Person을 상속 받은 Student객체 생성
		
		// Object - person - Student
		
		System.out.println(p.hashCode());
		System.out.println(std.hashCode());
		// Person이 Object에서 물려받은 hashCode()를
		// Student가 또 물려받아 사용
		
		String str = "abc";
		Scanner sc = new Scanner(System.in);
		
		System.out.println(str.hashCode());
		// String - Object
		System.out.println(sc.hashCode());
		// Scanner - Object
	}
	
	public void ex5() {
		
		Person p = new Person("김철수", 17, "한국");
		
		System.out.println( p.toString()) ;
		System.out.println( p );
		// print 구문 수행시 참조변수를 작성하면
		// 자동으로 toString() 메서드를 호출해서 출력한다.
		
		System.out.println("------------------------------");
		
		Student std = new Student("이백점", 18, "미국", 2, 6);
		
		System.out.println(std.toString());
	}
	// 왜 안변하냐
}


































