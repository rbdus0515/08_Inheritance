package edu.kh.inheritanace.model.vo;

public class Employee extends Person {
	// class명에 Object에 대한 상속구문이 없다면
	// 컴파일러가 자동으로 extends Object구문 추가
	
//	private String name;
//	private int age;
//	private String nationality;
	private String company;
	
	public Employee() {}
	
	public Employee(String name, int age, String nationality, String company) {
		
//		this.name = name;
//		this.age = age;
//		this.nationality = nationality;
		this.company = company;
		
	}

//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public String getNationality() {
//		return nationality;
//	}
//
//	public void setNationality(String nationality) {
//		this.nationality = nationality;
//	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	
	// Person으로부터 상속 받은 메서드 중
	// move() 메서드를 Employee에 맞게 재정의(== 오버라이딩)
	
	// @Override 어노테이션 : 해당 메소드가 오버라이딩 되었음을
	//						컴파일러에게 알려주는 역할 -> 컴파일러에게 문법 체크를 하도록 알린다.
	
	// 어노테이션(Annotation) : 컴파일러에게 알려주기 위한 코드 (컴파일러 인식용 주석)
	
	@Override
	public void move() {
		
		System.out.println("오버라이딩 된 move()");
		System.out.println("효율적으로 빨리 일하고 움직인다.");
	}
	
	
}






































